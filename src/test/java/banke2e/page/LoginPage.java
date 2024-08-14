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
	public void login(String usuario, String senha)  {
	
		
		metodo.clicar(el.login);
		metodo.escrever(el.usernameLogin, usuario);
		metodo.escrever(el.senhaLogin, senha);
		metodo.clicar(el.continuar);
		
	
		
		
		
		
	}

}
