package banke2e.teste;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import banke2e.page.AbrirContaPage;
import banke2e.page.LoginPage;
import banke2e.runner.Executa;

public class Teste {

	LoginPage login = new LoginPage();
	AbrirContaPage abrirConta = new AbrirContaPage();

	@BeforeEach
	public void iniciarTeste() {
		Executa.iniciarTeste();
	}

	public void terminarTeste() {
		Executa.terminarNavegador();
	}

	// @Test
	public void loginComDadosValidos() {
		login.login("526.134.275-86", "Teste@123");

	}

	@Test
	public void cadastrarUsuario() throws InterruptedException  {
		abrirConta.acessarCadastro("526.134.275-84");
		abrirConta.preencherDadosPessoais("Hugo", "Duarte", "teste@teste.com", "01/01/2024", "47319233", "11900000000",
				"Avenida Atlantica", "04963170", "33", "", "SP", "São Paulo");
		abrirConta.preencherDadosProfissionais("052023", "022023", "QA", "12.000,00", "teste@e2etreinamentos.com.br");
	}

}
