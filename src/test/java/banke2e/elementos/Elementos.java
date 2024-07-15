package banke2e.elementos;

import org.openqa.selenium.By;

import banke2e.drivers.Driver;

public class Elementos extends Driver {
	
	
	public String massaCpf = "123.486.700-00";
	public String massaCpf1 = "545.000.545-81";
	public String massaNome = "victor";
	public String massaTel = "1194446350";
	public String massaCep = "04963170";
	
	
	public static By btnAbrirConta = By.xpath("//nav[@class='header-nav']");
	public static By cpf = By.xpath("//input[@id='cpf-input']");
	public static By btnContinuar = By.xpath("//*[@id=\"root\"]/div/main/div[2]/button[2]");
	public static By nome = By.xpath("//input[@name='firstName']");
	public static By sobrenome = By.xpath("//input[@name='lastName']");
	public static By email = By.xpath("//input[@name='email']");
	public static By telefone = By.xpath("//input[@placeholder='Telefone']");
	public static By endereco = By.xpath("//input[@name='address']");
	public static By rg = By.xpath("//input[@name='rg']");
	public static By cep = By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/form/div[7]/input");
	public static By numero = By.xpath("//input[@name='number']");
	public static By estado = By.xpath("//input[@name='state']");
	public static By cidade = By.xpath("//input[@name='city']");
	public static By complemento = By.xpath("//input[@name='complement']");
	public static By data = By.xpath("//input[@name='dataBirthday']");
	public static By btnAvancar = By.xpath("//button[@type='button']");
	public static By grupoAtual = By.xpath("//input[@name='actualGroup']");
	public static By primeiroGrupo = By.xpath("//input[@name='firstGroup']");
	public static By cargo = By.xpath("//input[@name='job']");
	public static By salario = By.xpath("//input[@placeholder='Salário']");
	public static By emailProfissional = By.xpath("//input[@name='professionalEmail']");
	public static By btnEnviar = By.xpath("//button[@id='btnEnviar']");
	
	
	
	
	

}
