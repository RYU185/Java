package P1029;

import java.util.Date;

public class Order {
    String orderId; // 주문번호
    User user; // 주문한 사람 class!!
    Product product; // 주문한 제품 class!! 다른 클래스를 가져와 이용하는 것이 중요한 포인트
    Date orderDate; // 주문 날짜
    double totalAmount; // 주문 수량

    public Order(String orderId, User user, Product product, Date orderDate, double totalAmount) {
        this.orderId = orderId;
        this.user = user;
        this.product = product;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }
}
