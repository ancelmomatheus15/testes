package br.sceweb.modelo;


import java.util.InputMismatchException;

public class Empresa {
	
	String cnpj;
	String nomeDaEmpresa;
	String nomeFantasia;
	String endereco;
	String Telefone;
	
	/**
	 * 
	 * @return String
	 */
	public String getCnpj() {
		return cnpj;
	}
	
	/**
	 * 
	 * @param cnpj
	 */
	public void setCnpj(String cnpj) {
		if(cnpj.equals("")){
			throw new IllegalArgumentException("Nome Invalido");
		}else{
			this.cnpj = cnpj;
		}
		
	}
	
	/**
	 * 
	 * @return String
	 */
	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}
	
	/**
	 * 
	 * @param nomeDaEmpresa
	 */
	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		if(nomeDaEmpresa.equals("")){
			throw new IllegalArgumentException("Nome Invalido");
		}else{
			this.nomeDaEmpresa = nomeDaEmpresa;
		}
	}
	
	/**
	 * 
	 * @return String
	 */
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	/**
	 * 
	 * @param nomeFantasia
	 */
	public void setNomeFantasia(String nomeFantasia) {
		if(nomeFantasia.equals("")){
			throw new IllegalArgumentException("Nome Invalido");
		}else{
			this.nomeFantasia = nomeFantasia;
		}		
	}
	
	@Override
	/**
	 * @return boolean 
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (Telefone == null) {
			if (other.Telefone != null)
				return false;
		} else if (!Telefone.equals(other.Telefone))
			return false;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (nomeDaEmpresa == null) {
			if (other.nomeDaEmpresa != null)
				return false;
		} else if (!nomeDaEmpresa.equals(other.nomeDaEmpresa))
			return false;
		if (nomeFantasia == null) {
			if (other.nomeFantasia != null)
				return false;
		} else if (!nomeFantasia.equals(other.nomeFantasia))
			return false;
		return true;
	}
	
	/**
	 * 
	 * @return String
	 */
	public String getEndereco() {
		return endereco;
	}
	
	/**
	 * 
	 * @param endereco
	 */
	public void setEndereco(String endereco) {
		if(endereco.equals("")){
			throw new IllegalArgumentException("Nome Invalido");
		}else{
			this.endereco = endereco;
		}
	}
	
	/**
	 * 
	 * @return String
	 */
	public String getTelefone() {
		return Telefone;
	}
	
	/**
	 * 
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		if(telefone.equals("")){
			throw new IllegalArgumentException("Nome Invalido");
		}else{
			this.Telefone = telefone;
		}
		
	}

	

}
