package windDeliveryDomain.windDelivery.domain.point;

/*
 * @ 포인트 구분
 * CHARGE: 충전(+)
 * WITHDRAW: 출금(-)
 * PURCHASE_DEDUCTION: 대금(-)
 * RETURN: 대금 반환(+)
 * SALES_REVENUE: 대금(+)
 */

public enum PointStatus {
    CHARGE, WITHDRAW, PURCHASE_DEDUCTION,RETURN, SALES_REVENUE
}
