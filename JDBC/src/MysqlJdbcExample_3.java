import javax.swing.plaf.nimbus.State;
import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlJdbcExample_3 {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // #1. 직위를 매개변수로 전달하여 해당 직위 사원의 사원번호, 이름, 직위를 조회
    // 어제 배운 PreparedStatement 이용
    public List<Employee> getEmployeesByPosition(String position) {
        List<Employee> employees = new ArrayList<>();
        String query = "select 사원번호, 이름, 직위 from 사원 where 직위 = ?";
        try (Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
            PreparedStatement pstmt = connection.prepareStatement(query)) {

            pstmt.setString(1, position);
            try (ResultSet resultSet = pstmt.executeQuery()){
                    while (resultSet.next()) {
                        Employee employee = new Employee();
                        employee.setEmployeeNumber(resultSet.getString("사원번호"));
                        employee.setEmployeeName(resultSet.getString("이름"));
                        employee.setEmployeePosition(resultSet.getString("직위"));
                        employees.add(employee);
                    }
                }
            }
        catch (SQLException e){
            e.printStackTrace();
        }
        return employees;
    }

    // #2. 고객번호를 매개변수로 전달하여 고객번호, 고객회사명, 담당자명을 조회
    public List<Customer> getCustomersById(String id){
        List<Customer> customers = new ArrayList<>();
        String query = "select 고객번호, 고객회사명, 담당자명 from 고객 where 고객번호 = ?";

        try (Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
             PreparedStatement pstmt = connection.prepareStatement(query)){
            pstmt.setString(1,id);
            try (ResultSet resultSet = pstmt.executeQuery()){
                while(resultSet.next()){
                    Customer customer = new Customer();
                    customer.setCustomerNumber(resultSet.getString("고객번호"));
                    customer.setCustomerCompany(resultSet.getString("고객회사명"));
                    customer.setManagerName(resultSet.getString("담당자명"));
                    customers.add(customer);
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return customers;
    }



    // #3. 주문일을 매개변수로 전달하여 주문일 이후에 발생한 주문의 주문번호와 고객번호, 주문일 조회
    public List<Order> getOrdersByOrderDate(String date) {
        List<Order> orders = new ArrayList<>();
        String query = "select 주문번호, 고객번호, 주문일 from 주문 where ?<주문일";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, date);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Order order1 = new Order();
                    order1.setOrderID(rs.getString("주문번호"));
                    order1.setCustomerID(rs.getString("고객번호"));
                    order1.setOrderDate(rs.getDate("주문일").toLocalDate());
                    orders.add(order1);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
        }return orders;
    }


    public static void main(String[] args) {
        MysqlJdbcExample_3 repository = new MysqlJdbcExample_3();
        //List<Employee> objects = repository.getEmployeesByPosition("과장");
       // List<Customer> objects = repository.getCustomersById("CCOPI");
         List<Order> objects = repository.getOrdersByOrderDate("2021-05-01");
        for (Object object: objects) {
            System.out.println(object);
        }
    }
}