
package university.management.system;

import java.sql.*;

public class conn {
Connection c;
Statement s;
public conn(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ums?","root",null);
        s = c.createStatement();
    }
    catch(Exception e){
        System.out.println(e);
    }
}
    
}

