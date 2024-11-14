class A2 {
    int a = 3;
    int b = 4;
    void abc(){
        System.out.println("A클래스 메서드");
    }
    
    class B2 {
        int a = 5;
        int b = 6;
        void abc(){
            System.out.println("B클래스 메서드");
        }
        void bcd(){
            System.out.println(a);
            abc();
            // 가장 가까운 이너클래스 본인의 멤버를 가져와 사용한다
            
            // 그렇다면 아우터클래스의 멤버는 어떻게 접근할까?
            System.out.println(A2.this.a);
            A2.this.abc();
            // 여기서 this는 B2를 가르킴. A2.this가 아우터클래스를 참조할수 있는 방법
        }
    }
}

public class InnerClass_2 {
    public static void main(String[] args) {
        A2 a  = new A2();
        A2.B2 b = a.new B2();
        b.bcd();
        
    }
}
