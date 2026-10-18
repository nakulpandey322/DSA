import java.sql.*;

class WorkerDB {
    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "system", "password");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Worker");

            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(6));
            }
            con.close();
        } catch(Exception e){ System.out.println(e); }
    }
}
