import java.sql.*;
import java.util.Scanner;


class AddRecordDemo{
	public static void main(String ar[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/iactdata?user=root&password=");
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter Employee no.");
			int eno = s1.nextInt();

			System.out.println("Enter Employee Name");
			String sn = s1.next();

			System.out.println("Enter Employee salary");
			int sal = s1.nextInt();

			System.out.println("Enter Department Name");
			String dn = s1.next();

			
			String qry = "insert into emp values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(qry);
			ps.setInt(1,eno);
			ps.setString(2,sn);
			ps.setInt(3,sal);
			ps.setString(4,dn);
			int a = ps.executeUpdate();
			if(a==1){
				System.out.println("Data is recorded");
			}
			else{
				System.out.println("Data is not recorded");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}