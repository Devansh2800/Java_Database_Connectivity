import java.sql.*;
import java.util.Scanner;

class DisplayAllDemo{
	public static void main(String ar[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/iactdata?user=root&password=");
		
			String qry = "select * from emp";
			PreparedStatement ps = con.prepareStatement(qry);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				int eno=rs.getInt(1);
				String sn = rs.getString(2);
				int sal = rs.getInt(3);
				String dn =rs.getString(4);
				System.out.println("Employee no:"+eno);
				System.out.println("Employee name:"+sn);
				System.out.println("Employee Salary:"+sal);
				System.out.println("Department name:"+dn);
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}