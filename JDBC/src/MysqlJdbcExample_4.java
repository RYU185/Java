import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MysqlJdbcExample_4 {
    // #1. 재고수량을 매개변수로 전달하고 재고수량 미만인 제품의 제품번호,제품명,총주문건수 조회
    // Map을 사용하여 메서드내에서 출력하도록 구현

    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public void getProductsWithStock(int stock) {
        String query = "select 제품.제품번호, 제품명, (select count(주문수량) from 주문세부 " +
                "where 제품.제품번호 = 주문세부.제품번호) as 총주문건수 from 제품 " +
                "where 재고 < ? " +
                "group by 제품.제품번호, 제품명";

        //String query = "select 제품.제품번호, 제품명, count(주문수량) as 총주문건수 " +
        //                "from 제품 join 주문세부 on 주문세부.제품번호 = 제품.제품번호 " +
        //                "where 재고 < ? group by 제품.제품번호, 제품명";

        List<Map<String,Object>> Stock = new ArrayList<>();
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
            PreparedStatement ps = conn.prepareStatement(query)){
            ps.setInt(1, stock);
            try (ResultSet rs = ps.executeQuery()){
                while (rs.next()) {
                    Map<String, Object> stock1 = new HashMap<>();
                    stock1.put("제품번호",rs.getString("제품번호"));
                    stock1.put("제품명",rs.getString("제품명"));
                    stock1.put("총주문건수",rs.getString("총주문건수"));
                    Stock.add(stock1);
                }
                for (Map<String,Object> stock1: Stock){
                    System.out.println(stock1);
                }
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    // #2. 매개변수로 날짜(date)와 기간(개월수)(month)를 전달하고 해당 날짜를
    // 기준으로 개월수이내의 주문정보를 골라 아래 컬럼을 조회
    // 예를들어, 2022-02-01 기준으로 3개월 이내의 주문정보
    // 사원번호, 이름, 직위
    public void getEmployeesWithDuration(String date, int month) {
        String query = "select 사원.사원번호, 이름, 직위 " +
                "from 사원 join 주문 on 주문.사원번호 = 사원.사원번호 " +
                "where 주문일 <= ? and 주문일 >= adddate(?,interval ? month) " +
                "group by 사원.사원번호, 이름, 직위";
        

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement(query)){
            ps.setString(1,date);
            ps.setString(2,date);
            ps.setInt(3,month);
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()) {
                    String num = rs.getString("사원번호");
                    String name = rs.getString("이름");
                    String position = rs.getString("직위");
                    System.out.println(num + " " + name + " " + position);
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    // #3. 매개변수로 도시를 전달하고 해당도시별 고객들에 대한 주문년도별 주문건수 조회
    public void getNumOfOrdersByCity(String city) {
        String query = "select 고객.도시, count(*) as 주문건수, year(주문.주문일) as 주문년도 " +
                "from 주문 join 고객 on 주문.고객번호 = 고객.고객번호 " +
                "where 고객.도시 = ? " +
                "group by 도시, year(주문.주문일) "+
                "order by 주문년도";
        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = conn.prepareStatement(query)){
            ps.setString(1,city);
            
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                   String cityName = rs.getString("도시");
                   String orderCount = rs.getString("주문건수");
                   String orderYear = rs.getString("주문년도");
                    System.out.println(cityName + " " +orderCount+" "+orderYear);
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MysqlJdbcExample_4 repository = new MysqlJdbcExample_4();
        //repository.getProductsWithStock(4);
        //repository.getEmployeesWithDuration("2022-02-01", -3);
        repository.getNumOfOrdersByCity("서울특별시");
    }
}