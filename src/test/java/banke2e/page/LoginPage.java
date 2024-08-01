package banke2e.page;

import org.junit.jupiter.api.Test;

import banke2e.drivers.Driver;
import banke2e.elementos.Elementos;
import banke2e.metodos.Metodos;
import banke2e.runner.Executa;

public class LoginPage extends Driver{
	
	Elementos el = new Elementos();
	Metodos metodo = new Metodos();
	Executa executa = new Executa();
	
	@Test
	public void login() throws InterruptedException {
		executa.iniciarTeste();
		metodo.clicar(el.login);
		Thread.sleep(1000);
		metodo.escrever(el.usernameLogin, "526.134.275-99");
		metodo.escrever(el.senhaLogin, "Teste@123");
		metodo.clicar(el.continuar);
		driver.quit();
		
	}

}
