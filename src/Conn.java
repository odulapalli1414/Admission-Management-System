import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AdmissionManagementSystem", "postgres" , "root");
            s = c.createStatement();
            // if (c != null) {
            //     System.out.println("Connection OK");
            // } else {
            //     System.out.println("Connection Failed");
            // }
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    // public static void main(String[] args) {
    //     new Conn();
    // }
}
