package P1029;

public class Myclass {
    public static void main(String[] args) {
        Student steve = new Student("Steve", 25);
        Student tom = new Student("Tom", 21,"남자");
        Student sam = new Student("Sam", 26, "남자", "부산",89,79,98);
        System.out.println(steve.name);
        System.out.println(steve.address);
        System.out.println(tom.name);
        System.out.println(tom.name);
        System.out.println(sam.scoreHistory);
        // 메서드의 사용
        // 외부클래스가 가지고 있는 메서드이므로 해당 클래스의 인스턴스를 명시해야함 (steve. ,  tom. , sam. 등)
        System.out.println(steve.sumScore());
        System.out.println(tom.sumScore());
        System.out.println(sam.sumScore());

        User Kim = new User("Kim","kim@gmail.com", "1234");
        System.out.println(Kim.password);
        Kim.setPassword("abcd");
        System.out.println(Kim.password);

        Product book1 = new Product("A001","여행",10000,100);
        System.out.println(book1.price + " " + book1.stock);
        book1.setPrice(11000);
        book1.setStock(90);
        System.out.println(book1.price + " "+ book1.stock);

    }
}




// 폴더 = 패키지
// class



