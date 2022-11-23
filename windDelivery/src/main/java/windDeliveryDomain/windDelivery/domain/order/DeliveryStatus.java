package windDeliveryDomain.windDelivery.domain.order;

/*
 * @ 배달 상태 구분
 * ORDERING: 음식 주문 중
 * ONGOING: 가는 중~
 * COMPLETE : 배달 완료
 */
public enum DeliveryStatus {
    ORDERING, ONGOING, COMPLETE
}
