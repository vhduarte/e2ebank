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
	public void naoSouCliente()throws InterruptedException  {
		executa.iniciarTeste();
		metodo.clicar(el.login);
		metodo.clicar(el.naoSouCliente);
		
		Thread.sleep(1000);
		metodo.escrever(el.cpfRegistro, "010010001119");
		metodo.escrever(el.emailRegistro, "Teste@teste.com");
		metodo.escrever(el.senhalRegistro, "Teste@123");
		metodo.escrever(el.confirmaSenhaRegistro,"Teste@123");
		metodo.clicar(el.registar);
		driver.quit();
		
		
		
		
	}
	

}
