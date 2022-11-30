import java.sql.*;

public class DB_MAN {
    
    public static Connection mycon(){
        
      Connection con  = null;
      
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java?characterEncoding=UTF-8&&serverTimezone=UTC","root","root");
          
      }catch( ClassNotFoundException|SQLException e){
          System.out.println(e);
      }
      
      return con;
    }
   
}