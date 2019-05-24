import java.sql.*;
import java.util.Properties;

public class jdbcTemplate {

  public static void main(String[] argv) throws Exception {
    System.out.println("this is raja jdbcTemplate!!! ");

    Class.forName("com.mysql.jdbc.Driver"); 

    String url = "jdbc:mysql://localhost:3306/registrations";
    Properties info = new Properties();
    info.put("user", "registrar");
    info.put("password", "registrar");
    //info.put("database", "registrations");
    
    //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=registrar&password=registrar");
    Connection conn = DriverManager.getConnection(url, info);
    Statement s = conn.createStatement();

    ResultSet res = s.executeQuery("select * from bindings");
    while(res.next()) {
      System.out.println("row: %s" + res.getString("address_of_record"));
    }

    conn.close();
/*
    try {
      String sql = "select * from bindings";
      ResultSet rs = conn.createStatement().executeQuery(sql);
      while(rs.next()) {
        System.out.println("row: %s" + rs.getString("address_of_record"));
      }
    } catch (SQLException ex) {
      JDBCTutorialUtilities.printSQLException(e);
    } finally {
      if (s != null) { s.close(); }
    }
*/
    System.out.println("Bye Bye");
  }
}
