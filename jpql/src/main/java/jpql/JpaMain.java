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
            for(int i=0; i<100; i++){

                Member member = new Member();
                member.setUsername("test"+i);
                member.setAge(i);
                em.persist(member);
            }
            em.flush();
            em.clear();
            String query = "select m from Member m order by m.age desc";
            List<Member> members = em.createQuery(query, Member.class)
                    .setFirstResult(0)
                    .setMaxResults(10)
                    .getResultList();
            System.out.println("members.size() = " + members.size());
            for (Member member1 : members) {
                System.out.println("member1 = " + member1);

            }

            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
