import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcTemplate {

  public static void main(String[] argv) throws Exception {
    System.out.println("this is raja jdbcTemplate!!! ");

    Class.forName("com.mysql.jdbc.Driver"); 

    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=minikube&password=minikube");
    Statement s = conn.createStatement();

    int result = s.executeUpdate("create database jdbcdb");
    System.out.println("database created with status " + result);
  }
}
