package P1029;

public class User {
    // 필드
    String username;
    String email;
    String password;

    // 생성자 : 초기화
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
    // 메서드 : 기능 수행
    public String setPassword(String newPassword) { // 새로운 password를 받아야 하므로 매개변수 필요
        this.password = newPassword;
        return this.password;

    }
}
