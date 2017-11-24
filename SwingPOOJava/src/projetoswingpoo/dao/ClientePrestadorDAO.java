package projetoswingpoo.dao;

import java.sql.Connection;
import projetoswingpoo.model.clienteprestador;

import java.sql.PreparedStatement;

public class ClientePrestadorDAO {

	private Connection mConn;

	public ClientePrestadorDAO() {

		mConn = (new ConnectionFactory()).getConnection();

	}

	public void saveinfo(clienteprestador model) {

		String sql = "INSERT INTO clienteprestador(CPF,RG,CEP,endereco,datanascimento,nomeprestador,usuario,senha)"
				+ "values(?,?,?,?,?,?,?,?);";
		try {
			PreparedStatement stmt = (PreparedStatement) mConn.prepareStatement(sql);		
			// troca os ? pelos valores da Tarefa.
			stmt.setString(1, model.getCPF());
			stmt.setString(2, model.getRG());
			stmt.setString(3, model.getCEP());
			stmt.setString(4, model.getEndereco());
			stmt.setDate(5, new java.sql.Date(model.getDatanascimento().getTime()));
			stmt.setString(6, model.getNomecompleto());
			stmt.setString(7, model.getUsuario());
			stmt.setString(8, model.getSenha());//
			
			// Para salvar a Data no banco de dados
			// tem que usar o java.sql.Date
			
			

			stmt.execute();
			stmt.close();
			System.out.println("Gravado!");

		} catch (Exception e) {
			System.out.println("Erro  " + e.getMessage());
			e.printStackTrace();
		}

	}

}
