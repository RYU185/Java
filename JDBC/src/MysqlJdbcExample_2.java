import javax.xml.transform.Result;
import java.sql.*;

public class MysqlJdbcExample_2 {
    // 1.  데이터베이스 커넥션 정보
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // #2. INSERT (자바에서 데이터베이스로)
    // 부서테이블에 새로운 행을 추가하고 싶을 때
    public void insertDepartment(String deptNo, String deptName){
        String query = "insert into 부서(부서번호,부서명) "
                +"values (?, ?)";    // ? 자리에 매개변수(A6, A7...)를 넣을 예정
        try(
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1,deptNo);
            pstmt.setString(2, deptName);
            pstmt.executeUpdate();
            System.out.println("Insert 성공");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    // #3. UPDATE
    public void updateDepartment (String oldName, String newName) {
        String query = "update 부서 set 부서명 = ? where 부서명 = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, newName); // 첫번째 ?에 들어갈 newName
            pstmt.setString(2, oldName); // 두번째 ?에 들어갈 oldName
            pstmt.executeUpdate();
            System.out.println("Update 성공");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    /*
    Statement 와 PreparedStatement 차이점 설명
    1. SQL Injection 취약성
    S: 매우 취약, P: 안전

    2. 캐싱 - 자주 사용하는 것을 따로 두고 재사용
    S - 항상 새로운 쿼리 실행
    P - 동일한 쿼리는 캐싱하여 성능향상

    3.  가독성
    S - 코드가 복잡하면 알아보기 어려움
    P - 가독성 향상
     */

    public void insertProduct(int productNum, String productName, String unit, double price, int stock){
        String query = "insert into 제품(제품번호,제품명,포장단위,단가,재고) values (?,?,?,?,?)";
        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1,productNum);
            pstmt.setString(2, productName);
            pstmt.setString(3, unit);
            pstmt.setDouble(4, price);
            pstmt.setInt(5, stock);
            pstmt.executeUpdate();
            System.out.println("Insert 성공");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        MysqlJdbcExample_2 repository = new MysqlJdbcExample_2();
//        repository.insertDepartment("A6","총무부");
//        repository.insertDepartment("A7","해외영업부");
//
//        MysqlJdbcExample_2 repository2 = new MysqlJdbcExample_2();
//        repository2.updateDepartment("해외영업부","글로벌영업부");

        repository.insertProduct(93,"새우깡","500g pkgs.",2000,100);
    }
}
