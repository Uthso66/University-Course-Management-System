
package university.course.management.system;

/**
 *
 * @author Uthso
 */
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///ums","root","");
            s = c.createStatement();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
}

