package jpql;
import javax.persistence.*;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();


        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        try {
            Member member = new Member();
            member.setUsername("test");
            em.persist(member);

            TypedQuery<MemberDTO> query = em.createQuery("select new jpql.MemberDTO(m.username, m.age) from Member m", MemberDTO.class);
            List<MemberDTO> resultList = query.getResultList();


            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
