package windDeliveryDomain.windDelivery.domain.order;

/*
 * @ 주문 상태 구분
 * CANCEL: 취소
 * PAY: 결제 완료
 * FAIL : 결제 실패
 */
public enum OrderStatus {

    CANCEL, PAY, FAIL
}
