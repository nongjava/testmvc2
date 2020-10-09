import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class model {
String TFname;
String EFname;
String TLname;
String ELname;
int dataStudentID;
	public void check(int studentid) {
		String dbURL = "jdbc:mysql://localhost:3306/test1";
		String username = "root";
		String password = "tutor007";
	
		 
		try {
			 Connection conn = DriverManager.getConnection(dbURL, username, password);
			    
			    String sql = "SELECT * FROM Student";
			    
			    Statement statement = conn.createStatement();
			    ResultSet result = statement.executeQuery(sql);
			     
			
			     
			    while (result.next()){
			      dataStudentID =result.getInt(1);
			      if(studentid == dataStudentID ) {
			     TFname = result.getString(2);
			      EFname = result.getString(3);
			      TLname = result.getString(4);
			      ELname = result.getString(5);
			        
			      }
		   
		    
		    }
       } catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}
	public String getanswer1(){
		
		
		return TFname ;
		
    
    }
	public String getanswer2(){
		return EFname;
    
    }
	public String getanswer3(){
		return TLname;
    
    }
	public String getanswer4(){
		return ELname;
    
    }
}
