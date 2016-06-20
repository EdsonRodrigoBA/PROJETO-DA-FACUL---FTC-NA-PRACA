package br.ftcnapraca.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection getConnection() {
		// TODO Auto-generated method stub
		try {
			//Usei o Class.forname para que possamos manipular os dados do banco via java web
			//ou seja estou forçando....
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/ftc", "root", "1111");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public static void main(String[] args) {
		
	}

}


