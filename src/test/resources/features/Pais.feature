
@tag
Feature: Selecionando Pais ou regiao para localizacao e compra online
  Como usuario
  Quero selecionar pais ou regiao
  Para comprar online

  @test
  Scenario: Selecionando Pais ou regiao
    Given que seleciono o pais 
    When clico em continuar
    Then sou redirecionada para pagina apple do pais selecionado
    

 
 	
 	
 	
 		