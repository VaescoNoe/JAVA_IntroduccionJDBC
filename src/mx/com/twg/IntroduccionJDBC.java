package mx.com.twg;

import java.sql.*;

public class IntroduccionJDBC {
	
	public static void main (String [] args) {
		
		String url = "jdbc:mysql://localhost:3306/sga?useSSL=false";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection(url, "root", "");
			Statement stm = con.createStatement();
			String sql="SELECT * FROM persona;";
			ResultSet rst = stm.executeQuery(sql);
			
			while(rst.next()){
				System.out.print("ID: "+rst.getInt(1));
				System.out.print(", Nombre: "+rst.getString(2));
				System.out.println(", Apellido: "+rst.getString(3));
			}
			rst.close();
			stm.close();
			con.close();
		}catch(ClassNotFoundException | SQLException e){
			
		}
	}

}
