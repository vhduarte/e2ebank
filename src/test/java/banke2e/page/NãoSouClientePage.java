package banke2e.page;

import org.junit.jupiter.api.Test;

import banke2e.drivers.Driver;
import banke2e.elementos.Elementos;
import banke2e.metodos.Metodos;
import banke2e.runner.Executa;

public class NãoSouClientePage extends Driver{
	
	

	Elementos el = new Elementos();
	Metodos metodo = new Metodos();
	Executa executa = new Executa();
	@Test
	public void naoSouCliente(String cpf, String email, String senha, String confirmaSenha)throws InterruptedException  {
		executa.iniciarTeste();
		metodo.clicar(el.login);
		metodo.clicar(el.naoSouCliente);
		
		Thread.sleep(1000);
		metodo.escrever(el.cpfRegistro, cpf);
		metodo.escrever(el.emailRegistro, email);
		metodo.escrever(el.senhalRegistro, senha);
		metodo.escrever(el.confirmaSenhaRegistro,confirmaSenha);
		metodo.clicar(el.registar);
		driver.quit();
		
		
		
		
	}
	

}
