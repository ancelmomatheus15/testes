package br.sceweb.modelo;


import java.util.InputMismatchException;

public class Empresa {
	
	String cnpj;
	String nomeDaEmpresa;
	String nomeFantasia;
	String endereco;
	String Telefone;
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		if(cnpj.equals("")){
			throw new IllegalArgumentException("Nome Invalido");
		}else{
			this.cnpj = cnpj;
		}
		
	}
	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}
	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		if(nomeDaEmpresa.equals("")){
			throw new IllegalArgumentException("Nome Invalido");
		}else{
			this.nomeDaEmpresa = nomeDaEmpresa;
		}
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		if(nomeFantasia.equals("")){
			throw new IllegalArgumentException("Nome Invalido");
		}else{
			this.nomeFantasia = nomeFantasia;
		}		
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		if(endereco.equals("")){
			throw new IllegalArgumentException("Nome Invalido");
		}else{
			this.endereco = endereco;
		}
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		if(telefone.equals("")){
			throw new IllegalArgumentException("Nome Invalido");
		}else{
			this.Telefone = telefone;
		}
		
	}

	

}
