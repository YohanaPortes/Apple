package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;

public class Metodos extends DriversFactory{
	
	public void abrirNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver107.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void clicar (By elemento) {
		driver.findElement(elemento).click();
	}
	
	public void fecharNavegador(String url) {
		driver.quit();
	}
	
	
	public void alternarAba() {
		
	}

}
