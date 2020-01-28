import java.sql.*;
import java.util.Scanner;

// This program will demonstrate you on how to delete record from the table schema that is already made.
// SQL queries will have differnt file.

class DeleteRecordDemo{
	public static void main(String ar[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/iactdata?user=root&password=");
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter Employee no.");
			int eno = s1.nextInt();

			
			String qry = "delete from emp where eno=?";
			PreparedStatement ps = con.prepareStatement(qry);
			ps.setInt(1,eno);
			
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
