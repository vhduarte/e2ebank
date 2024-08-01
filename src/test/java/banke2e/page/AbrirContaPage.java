package banke2e.page;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import banke2e.drivers.Driver;
import banke2e.elementos.Elementos;
import banke2e.massa.MassaDeDados;
import banke2e.metodos.Metodos;
import banke2e.runner.Executa;

public class AbrirContaPage extends Driver {
	Executa executa = new Executa();
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	MassaDeDados massa = new MassaDeDados();

	@Test
	public void testar() throws InterruptedException {
		executa.iniciarTeste();
		metodo.clicar(el.btnAbrirConta);
		metodo.escrever(el.cpf, massa.Cpf);
		metodo.clicar(el.btnContinuar);
		Thread.sleep(2000);

		metodo.escrever(el.nome, massa.nome);
		metodo.escrever(el.sobrenome, massa.sobreNome);
		metodo.escrever(el.email, massa.email);
		Thread.sleep(1000);

		for (int i = 0; i <= 1; i++) {
			Thread.sleep(1000);
			metodo.escrever(el.telefone, massa.tel);
			metodo.limpaTexto(el.telefone);
		}
		metodo.escrever(el.telefone, massa.tel);

		metodo.escrever(el.endereco, massa.endereco);
		metodo.escrever(el.rg, massa.rg);

		for (int i = 0; i <= 1; i++) {
			Thread.sleep(1000);

			metodo.escrever(el.cep, massa.cep);
			metodo.limpaTexto(el.cep);

		}
		metodo.escrever(el.cep, massa.cep);

		metodo.escrever(el.numero, massa.numero);
		metodo.escrever(el.estado, massa.estado);
		metodo.escrever(el.cidade, massa.cidade);
		//metodo.escrever(el.complemento, massa.complemento);
		
		for (int i = 0; i <= 1; i++) {
			Thread.sleep(1000);

			metodo.escrever(el.data, massa.data);
			metodo.limpaTexto(el.data);

		}
		metodo.escrever(el.data, massa.data);
		
		Thread.sleep(2000);
		metodo.clicar(el.btnAvancar);
		Thread.sleep(2000);
		metodo.escrever(el.grupoAtual, massa.grupoAtual);
		metodo.escrever(el.primeiroGrupo, massa.primeiroGrupo);
		metodo.escrever(el.cargo, massa.cargo);
		metodo.escrever(el.salario, massa.salario);
		metodo.escrever(el.emailProfissional, massa.emailProfissional);
		Thread.sleep(1000);
		metodo.clicar(el.btnEnviar);
		

		Thread.sleep(1000);
		
		for (int i = 0; i <= 1; i++) {
			Thread.sleep(1000);

			metodo.escrever(el.senha, "Teste@123");
			metodo.limpaTexto(el.senha);

		}
		metodo.escrever(el.senha, "Teste@123");
		metodo.escrever(el.confirmaSenha, "Teste@123");
		metodo.clicar(el.btnCadastrar);
		
		
		

}
	
	
}
