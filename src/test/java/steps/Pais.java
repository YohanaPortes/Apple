package steps;




import elementos.Elementos;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class Pais extends Metodos{
	
	Elementos elem = new Elementos();
	
	@Before
	public void abrirNavegador() {
		abrirNavegador("https://www.apple.com/");
	}
	
	@Given("que seleciono o pais")
	public void que_seleciono_o_pais() {
	   clicar(elem.pais);
		
	}

	@When("clico em continuar")
	public void clico_em_continuar() {
	   clicar(elem.btnContinuar);
	}

	@Then("sou redirecionada para pagina apple do pais selecionado")
	public void sou_redirecionada_para_pagina_apple_do_pais_selecionado() {
	   
	}	

	//@After
	//public void fecharNavegador() {
	//	fecharNavegador();
	//}
}
