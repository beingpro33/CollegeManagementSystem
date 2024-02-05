import java.sql.Connection;
import java.sql.DriverManager;
// import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc
{
  String jdbcURL = "jdbc:postgresql://localhost:5432/cms";
  String username = "postgres";
  String password = "1234";

  Statement stm;

  jdbc()
  {
     try 
      {
        Connection connection = DriverManager.getConnection(jdbcURL, username, password);
        // System.out.println("Connected to Postgresql server");

        stm = connection.createStatement();
        
      } catch (SQLException e)
        {
        
          System.out.println("Error in connecting to Postgresql server");
          e.printStackTrace();
        }

        
  }  


  
}
