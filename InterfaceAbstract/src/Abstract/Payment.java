package Abstract;
// 결제 시스템 클래스
// 결제금액
// 가게 ID
// 결제 수단 (카드, 현금, 계좌이체, 모바일 결제, 포인트 결제)
public abstract class Payment {
    protected double amount;  // 금액
    protected String id; // 상점 ID

    public Payment() {
    }

    public Payment(double amount, String id) {
        this.amount = amount;
        this.id = id;
    }
    // 추상 메서드
    abstract boolean processPayment();  // 결제 진행 메서드 (결제되냐 안되냐 강제적으로 실행)
    abstract String getReceipt(); // 영수증 발행
}
// 신용카드 결제
class CreditCard extends Payment {
    private String cardNumber;   // 신용카드번호
    private String expiryDate;   // 카드 만료일

    // 자식클래스의 생성자에는 부모의 필드도 추가할 수 있음 (반드시는 아니지만 추가하면 편리하다)
    public CreditCard(double amount, String id, String cardNumber, String expiryDate) {
        super(amount, id);
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    boolean processPayment() {
        System.out.println("신용카드로 결제 진행");
        return true;
    }

    @Override
    String getReceipt() {
        return "신용카드 결제금액 : "+amount+"원";
    }
}

// 모바일결제
class Mobile extends Payment {
    private String paymentType;  // 결제타입 (카카오페이, 네이버페이 등)
    private boolean usePoint;    // 포인트 사용 유무

    public Mobile(double amount, String id, String paymentType, boolean usePoint) {
        super(amount, id);
        this.paymentType = paymentType;
        this.usePoint = usePoint;
    }

    @Override
    boolean processPayment() {
        if (usePoint){
            System.out.println("모바일결제 진행(포인트 사용)");
        }else{
            System.out.println("모바일 결제 진행");
        }
        return true;
    }

    @Override
    String getReceipt() {
        if (usePoint){
            return "모바일 결제금액: " + amount+"원 (포인트 사용)";
        }else {
            return "모바일 결제금액: " + amount +"원";
        }
    }
}

// 현금 결제 (연습문제)
class Cash extends Payment {
    private double receivedAmount;  // 고객으로부터 받은 현금

    public Cash(double amount, String id, double receivedAmount) {
        super(amount, id);
        this.receivedAmount = receivedAmount;
    }

    @Override
    boolean processPayment() {
        if (receivedAmount >= amount) {
            System.out.println("현금결제를 진행합니다");
            return true;   // 이게 가장 중요!!! 이 과정에서 true false로 getReceipt를 실행할지말지 결정해주기 때문에 별다른 코드를 더 쓸 필요가 없음
        } else {
            System.out.println("금액이 부족하여 결제할 수 없습니다");
            return false;
        }
    }


    @Override
    String getReceipt () {
        if (this.processPayment()) {
            System.out.println("현금결제 진행: " + amount + "원 " + "거스름돈: " + (receivedAmount - amount) + "원");
        }
        return "";
    }
}