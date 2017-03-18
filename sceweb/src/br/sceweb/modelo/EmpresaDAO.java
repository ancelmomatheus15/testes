package br.sceweb.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.sceweb.servico.FabricaDeConexoes;

public class EmpresaDAO {
	
	public int adiciona(Empresa empresa){
		
		PreparedStatement ps;
		int codigoRetorno=0;

		try (Connection conn = new FabricaDeConexoes().getConnection()){

			ps = (PreparedStatement) conn.prepareStatement("insert into empresa (cnpj, nomeDaEmpresa, nomeFantasia,"+
														   "endereco, telefone) values(?,?,?,?,?)");

			ps.setString(1, empresa.getCnpj());
			ps.setString(2, empresa.getNomeDaEmpresa());
			ps.setString(3, empresa.getNomeFantasia());
			ps.setString(4, empresa.getEndereco());
			ps.setString(5, empresa.getTelefone());

			codigoRetorno = ps.executeUpdate();
			
			ps.close();

		} catch (SQLException e){

			throw new RuntimeException(e);
		}
		return codigoRetorno;
	}
	
	public void exclui(String cnpj){
		PreparedStatement ps;
		
		try (Connection conn = new FabricaDeConexoes().getConnection()){
			ps = (PreparedStatement) conn.prepareStatement("DELETE FROM empresa WHERE cnpj = ?");
			ps.setString(1, cnpj);
			
			ps.executeUpdate();
			
			ps.close();
		}
		catch (SQLException e){

			throw new RuntimeException(e);
		}
	}

}

