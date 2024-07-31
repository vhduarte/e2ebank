package banke2e.metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import banke2e.drivers.Driver;

public class Metodos extends Driver {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, textoCapturado);
	}

	public void validarUrl(String urlDesejada) {
		try {
			assertEquals(urlDesejada, driver.getCurrentUrl());
		} catch (Exception e) {
			System.err.println("***** url diferente da desejada *****");
			System.err.println("***** causa do erro ***** " + e.getCause());
			System.err.println("***** mensagem do erro ***** " + e.getMessage());
		}
	}

	public void limpaTexto(By elemento) {
		try {
			driver.findElement(elemento).clear();
		} catch (Exception e) {
			System.err.println("***** causa do erro ***** " + e.getCause());
		}
	}

	public void submit(By elemento) {
driver.findElement(elemento).submit();
	}
	public void aguardarElementoSerClicavel(By elemento) {
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		Wait.until(ExpectedConditions.elementToBeClickable(elemento));
	}
	public void validarMsgAlert(String textoEsperado) {
		String msgAlert = driver.switchTo().alert().getText();
		assertTrue(msgAlert.contains(textoEsperado));
		}
	



}
