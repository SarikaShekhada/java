import java.sql.*;
class student
{
	public static void main(String [] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
			Statement st=con.createStatement();
			String sql = "INSERT INTO stud " +
                   "VALUES (100, 'sarika', 12, 'ahemdabad')";
			st.executeUpdate(sql);
			System.out.println("record inserted");
			st.close();
			con.close();

		}
		catch(ClassNotFoundException cfe)
		{
			cfe.printStackTrace();
		}
		catch(SQLException se)
		{
			
      //Handle errors for JDBC
			se.printStackTrace();
		}
		catch(Exception e)
		{
      //Handle errors for Class.forName
			e.printStackTrace();
		}
		/*catch(ClassNotFoundException cfe)
		{
			cfe.printStackTrace();
		}*/
	}
}