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
        String query = "select 제품.제품번호, 제품명, count(주문수량) as 총주문건수 " +
                "from 제품 join 주문세부 on 제품.제품번호 = 주문세부.제품번호 " +
                "where ? < 재고";
        List<Map<String,Object>> Stock = new ArrayList<>();
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
            PreparedStatement ps = conn.prepareStatement(query)){
            ps.setString(1, String.valueOf(stock));
            try (ResultSet rs = ps.getResultSet()){
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
    public static void main(String[] args) {
        MysqlJdbcExample_4 repository = new MysqlJdbcExample_4();
        repository.getProductsWithStock(4);
    }
}