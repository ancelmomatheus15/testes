package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastrarEmpresa {
	
	/**
	 * 
	 * @throws Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();
		empresa.setNomeDaEmpresa("empresa x");
		empresa.setCnpj("89424232000180");
		empresa.setNomeFantasia("empresa x");
		empresa.setEndereco("rua taquari");
		empresa.setTelefone("2222");
	}
	
	public static Empresa empresa = new Empresa();
	public static EmpresaDAO empresaDAO = new EmpresaDAO();
	
	/**
	 * 
	 */
	@Test
	public void CT01UC01FB_cadastrar_empresa_com_sucesso(){
		assertEquals(1, empresaDAO.adiciona(empresa));
	}
	
	/**
	 * 
	 */
	@Test (expected = RuntimeException.class)
	public void CT02UC01A2_cadastrar_empresa_cnpj_ja_cadastrado(){
		empresaDAO.adiciona(empresa);
		empresaDAO.adiciona(empresa);
	}
	
	/**
	 * 
	 */
	@Test (expected = IllegalArgumentException.class)
	public void CT03UC01A3_cadastrar_empresa_cnpj_invalido(){
		empresa.setCnpj("");
	}
	
	/**
	 * 
	 */
	@Test (expected = IllegalArgumentException.class)
	public void CT04UC01A4_cadastrar_empresa_com_dados_invalidosNome(){
		empresa.setNomeDaEmpresa("");
	}
	
	/**
	 * 
	 */
	@Test (expected = IllegalArgumentException.class)
	public void CT04UC01A4_cadastrar_empresa_com_dados_invalidosFantasia(){
		empresa.setNomeFantasia("");
	}
	
	/**
	 * 
	 */
	@Test (expected = IllegalArgumentException.class)
	public void CT04UC01A4_cadastrar_empresa_com_dados_invalidosTelefone(){
		empresa.setTelefone("");
	}
	
	/**
	 * 
	 */
	@Test (expected = IllegalArgumentException.class)
	public void CT04UC01A4_cadastrar_empresa_com_dados_invalidosEndereco(){
		empresa.setEndereco("");
	}
	
//	@Test (expected = RuntimeException.class)
//	public void excluiEmpresaInvalido() throws Exception{
//		empresaDAO.exclui("");
//	}
	
	/**
	 * 
	 * @throws Exception
	 */
	@After
	public void excluiEmpresa() throws Exception{
		empresaDAO.exclui("89424232000180");
	}

	/**
	 * 
	 * @throws Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
