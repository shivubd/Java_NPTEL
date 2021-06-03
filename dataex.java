import java.sql.*;
public class dataex{
	public static void main(String args[]) throws Exception{
		Connection conn=null;
		Statement stmt=null;
			String user="shivu";
			String pass="shivu";
			String url="jdbc:mysql://localhost:3306/test";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn=DriverManager.getConnection(url,user,pass);
			stmt=conn.createStatement();
			stmt.execute("create database test3");
			stmt.execute("use test3");
			stmt.execute("drop database test2");
			if(conn!=null){
				try{
					conn.close();
					System.out.println("database connection closed");
				}
				catch(Exception e){
				}
			}
		
	}
}
			
		