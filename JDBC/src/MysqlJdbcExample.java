import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlJdbcExample {
    // #1. 데이터베이스 커넥션 정보
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // 메서드 조회 모든 고객정보를 조회
    public List<Customer> getAllCustomer() {
        List<Customer> customer = new ArrayList<>();
        String query = "select * from 고객";
        // 외부에 있는 데이터베이스를 연결하는 과정에서 반드시 예외처리를 해야함
        // try~catch 문법을 사용
        // try()를 실행하고 오류가 발생하면 catch구문 실행
        try (
                Connection connection = DriverManager.getConnection(
                        URL, USER, PASSWORD);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)) {
            System.out.println("데이터베이스 연결 성공");

        } catch (SQLException e) {
            e.printStackTrace(); // 예외가 발생한 과정의 정보를 출력 (어디서 무슨 에러가 났는지 출력)
        }
        return customer;
    }

    public static void main(String[] args) {
        MysqlJdbcExample repository = new MysqlJdbcExample();
        List<Customer> customers = repository.getAllCustomer();
    }
}