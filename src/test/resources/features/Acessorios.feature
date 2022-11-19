@tag1
 Feature: Pesquisar acessorios
 		Como usuario
 		Quero pesquisar acessorios apple
 		Para comprar online
 		
 	@test1
 	Scenario: Pesquisando acessorios
 	Given que esteja na pagina apple do pais selecionado
 	When clico em acessorios
 	Then sou redirecionada para nova pagina
 	When digito na busca o tipo de acessorio
 	And clico em pesquisar
 	Then sou redirecionada para pagina com as opcoes de acessorios
 	When clico no item escolhido
 	Then sou redirecionada para a pagina de compras
 	When adiciono item a sacola
 	Then sou redirecionada para a pagina da sacola de compras
 	When posso escolher quantidade
 	And adicionar ou nao cartao de presente
 	Then adiciono o cep para entrega do produto
 	And clico em aplicar
 	Then visualizo os dados da compra
 	And clico em pagar
 	Then sou redirecionada para a pagina de finalizacao da compra
 	When seleciono continuar como convidado
 	Then sou redirecionada para a pagina de checkout 
 	When clico em continuar para o endereco de envio
 	Then sou redirecionada para pagina para local de entrega
 	When preencho o cadastro
 	And clico em continuar para o pagamento
 	Then sou redirecionada para a pagina de pagamento
