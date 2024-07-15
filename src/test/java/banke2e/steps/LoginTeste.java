package banke2e.steps;

import org.junit.Test;

import banke2e.drivers.Driver;
import banke2e.elementos.Elementos;
import banke2e.metodos.Metodos;
import banke2e.runner.Executa;

public class LoginTeste extends Driver {
	Executa executa = new Executa();
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	@Test
	public void testar() throws InterruptedException {
		executa.iniciarTeste();
		metodo.clicar(el.btnAbrirConta);
		metodo.escrever(el.cpf, el.massaCpf1);
		metodo.clicar(el.btnContinuar);
		Thread.sleep(2000);

		metodo.escrever(el.nome, "victor");
		metodo.escrever(Elementos.sobrenome, "duarte");
		metodo.escrever(el.email, "teste@teste.com");
		Thread.sleep(1000);

		for (int i = 0; i <= 1; i++) {
			Thread.sleep(1000);
			metodo.escrever(el.telefone, "11900000000");
			metodo.limpaTexto(el.telefone);
		}
		metodo.escrever(el.telefone, "11900000000");

		metodo.escrever(el.endereco, "rua paz");
		metodo.escrever(el.rg, "470000000");

		for (int i = 0; i <= 1; i++) {
			Thread.sleep(1000);

			metodo.escrever(el.cep, "00000-170");
			metodo.limpaTexto(el.cep);

		}
		metodo.escrever(el.cep, "00000-170");

		metodo.escrever(el.numero, "33");
		metodo.escrever(el.estado, "São Paulo");
		metodo.escrever(el.cidade, "SP");
		metodo.escrever(el.complemento, "casa");
		metodo.escrever(el.data, "09/02/1991");
		Thread.sleep(2000);
		metodo.clicar(el.btnAvancar);
		Thread.sleep(2000);
		metodo.escrever(el.grupoAtual, "QA");
		metodo.escrever(el.primeiroGrupo, "Quality");
		metodo.escrever(el.cargo, "gerente");
		metodo.escrever(el.salario, "12000");
		metodo.escrever(el.emailProfissional, "teste1@teste.com");
		Thread.sleep(1000);
		metodo.clicar(el.btnEnviar);
		System.out.println("teste realizado com sucesso");
		driver.quit();

	}

}
