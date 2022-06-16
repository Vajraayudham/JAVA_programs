import java.sql.*;
import java.util.Scanner;

class OracleCon {

    public static void main(String args[]) throws Exception {
        Scanner sc=new Scanner(System.in);
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "hp");
            Statement st = con.createStatement();
            System.out.println("\tMenu\n\t1.Insert\n\t2.Update\n\t3.Delete\n\t4.Display");
            int ch=sc.nextInt();
            switch(ch){
                case 1: System.out.println("Enter Data to be insert in table : id and Name of student");
                        int id=sc.nextInt();
                        String sname=sc.nextLine();
                        PreparedStatement ps=con.prepareStatement("insert into student values(?,?)");
                        ps.setInt(1,id);
                        ps.setString(2,sname);  
                        ps.execute();
                        break;
                case 2: st.executeUpdate("update student set name='Varsha' where id=4");
                        break;    
                case 3: st.executeUpdate("delete from student where id=4");
                        break;
                case 4: ResultSet rs = st.executeQuery("select * from student");
                        while (rs.next())
                                System.out.println(rs.getInt(1) + "  " + rs.getString(2));
                        break;
                default:
                System.out.println("Wrong choice entererd");
            }
            
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            System.out.println("Closing Database connection...");
        }

    }
}