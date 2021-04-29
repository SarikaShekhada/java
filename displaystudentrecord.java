//program number 9
import java.sql.*;
//java -classpath .;mysql-connector-java-5.1.23-bin.jar  displaystudentrecord
class displaystudentrecord
{
	public static void main(String[] args)
	{	
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/student","root","");
			Statement st=con.createStatement();			
			String str="select * from stud";
			ResultSet rs=st.executeQuery(str);
			while(rs.next())
			{
				System.out.println(" "+rs.getString("s_rollno")+" "+rs.getString("s_name")+" "+rs.getString("s_city")+" "
				+rs.getString("s_result"));
			}
			rs.close();
			st.close();
			con.close();
			System.out.println("successfully display");
		}
		catch(ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
		catch(SQLException sqle)
		{
			sqle.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
}