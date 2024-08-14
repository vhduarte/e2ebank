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

	public void acessarCadastro(String cpf) throws InterruptedException {

		Thread.sleep(1000);
		metodo.clicar(el.btnAbrirConta);
		metodo.escrever(el.cpf, cpf);
		metodo.clicar(el.btnContinuar);
	}

	public void preencherDadosPessoais(String nome, String sobrenome, String email, String data, String rg,
			String telefone, String endereco, String cep, String numero, String complemento, String estado,
			String cidade) throws InterruptedException {

		metodo.esperarElemento(el.nome);
		metodo.escrever(el.nome, nome);
		metodo.escrever(el.sobrenome, sobrenome);
		metodo.escrever(el.email, email);
		for (int i = 0; i <= 1; i++) {
			Thread.sleep(1000);
			metodo.escrever(el.data, data);
			metodo.limpaTexto(el.data);
		}
		metodo.escrever(el.data, data);

		metodo.escrever(el.rg, rg);
		Thread.sleep(2000);

		for (int i = 0; i <= 1; i++) {
			Thread.sleep(1000);
			metodo.escrever(el.telefone, telefone);
			metodo.limpaTexto(el.telefone);
		}
		metodo.escrever(el.telefone, telefone);

		Thread.sleep(2000);
		metodo.escrever(el.endereco, endereco);

		for (int i = 0; i <= 1; i++) {
			Thread.sleep(1000);
			metodo.escrever(el.cep, cep);
			metodo.limpaTexto(el.cep);
		}
		metodo.escrever(el.cep, cep);
		Thread.sleep(2000);
		metodo.escrever(el.numero, numero);
		metodo.escrever(el.complemento, complemento);
		metodo.escrever(el.estado, estado);
		metodo.escrever(el.cidade, cidade);
		//

		Thread.sleep(2000);
		metodo.clicar(el.btnAvancar);
		Thread.sleep(2000);

	}

	public void preencherDadosProfissionais(String grupoAtual, String primeiroGrupo, String cargo, String salario,
			String emailProfissional) throws InterruptedException {

		metodo.escrever(el.grupoAtual, grupoAtual);
		metodo.escrever(el.primeiroGrupo, primeiroGrupo);
		metodo.escrever(el.cargo, cargo);
		metodo.escrever(el.salario, salario);
		metodo.escrever(el.emailProfissional, emailProfissional);
		Thread.sleep(1000);
		metodo.clicar(el.btnEnviar);

	}

	public void cadastrarSenha(String senha) throws InterruptedException {
		Thread.sleep(1000);

		for (int i = 0; i <= 1; i++) {
			Thread.sleep(1000);

			metodo.escrever(el.senha, senha);
			metodo.limpaTexto(el.senha);

		}
		metodo.escrever(el.senha, senha);
		metodo.escrever(el.confirmaSenha, senha);
		metodo.clicar(el.btnCadastrar);

	}
}
