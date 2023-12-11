package br.com.showsagora.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import com.mysql.jdbc.PreparedStatement;

import br.com.showsagora.model.Ingresso;
import br.com.showsaora.controller.Conexao;

public class CruDAO {
	
	//CRUD C-Create R-Read U-Update D-Delete
	
	//CREATE (Inserir DADOS)
	public void create(Ingresso ingresso) {
		String sql = "INSERT INTO Ingressos(filme, preco) VALUE (?, ?)";
		Connection conn = null;
		PreparedStatement p = null;
		
		try {
			conn = Conexao.criandoConexao();
			p = (PreparedStatement) conn.prepareStatement(sql);//cast
			p.setString(1, ingresso.getShow());
			p.setFloat(2, ingresso.getPreco());
			p.execute();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao inserir dados! \nERRO: " + e);
		}finally {
			try {
				if (p != null);
				p.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}		

		public void update(Ingresso ingresso) {
			String sql = "UPDATE ingressos SET filme = ?, preco = ? WHERE data = ?";
			Connection conn = null;
			PreparedStatement p = null; //link com banco
			try {
				conn = Conexao.criandoConexao();
				p = (PreparedStatement) conn.prepareStatement(sql);//cast
				p.setString(1, ingresso.getShow());
				p.setFloat(2, ingresso.getPreco());
				p.setDouble(3, ingresso.getData());
				p.execute();//"Executa inst para gravar" dados no banco
				JOptionPane.showMessageDialog(null, "dados atualizados com sucesso!");
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao inserir dados! \nERRO: " + e);
			}finally {
				try {
				if (p != null) {
				p.close();
				}
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}//FIM UPDATE

	//*****************************************
	//R - Read 
		public List<Ingresso> read(){
			String sql = "Select * FROM alunos";
			List<Ingresso> ingressos = new ArrayList<Ingresso>();
			Connection conn = null;
			PreparedStatement p = null;
			ResultSet resultado = null;
			
			try {
				conn = Conexao.criandoConexao();
				p = (PreparedStatement) conn.prepareStatement(sql);//cast
				resultado = p.executeQuery();//mostra os dados da consulta sql
				while(resultado.next()) {
					Ingresso ver_ingresso = new Ingresso();
				
				//recuperar RA
				ver_ingresso.setData(resultado.getDouble("Data"));
				//recuperar o nome
				ver_ingresso.setShow(resultado.getString("Filme"));
				//recuperar idade
				ver_ingresso.setPreco(resultado.getFloat("Preco"));
				//adicionar na lista
				ingressos.add(ver_ingresso);
			}
			}catch (Exception e) {
				e.printStackTrace();
		}finally {
			try {
			if (p != null);
			p.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
			return ingressos;
	}//FIM Read
		
		public boolean delete (int data) {
			String sql = "DELETE FROM alunos WHERE ra = ?";
			Connection conn = null;
			PreparedStatement p = null;
			try {
				conn = Conexao.criandoConexao();//cast
				p.setDouble(1, data);
				p.execute();
				JOptionPane.showMessageDialog(null, "dados excluidos com sucesso!");
				System.out.println("dados excluidos com sucesso!");
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao inseerir dados! \nERRO" + e);
			}finally {
				try {
				if (p != null) {
				p.close();
				}
			}catch (Exception e){
				e.printStackTrace();
			}
		}
			return false;
		}
		
	}//FIM create