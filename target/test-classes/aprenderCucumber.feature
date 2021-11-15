# language: pt
Funcionalidade: Aprender Cucumber
	Como uma aluno
	Eu quero aprender a utilizar 
	Para que eu possa automatixar criterios de aceitação

Cenário: Deve executar especificação
	Dado que eu criei o arquivo corretamento
	Quando executa-lo
	Entao a especificalçao deve finalizar com sucesso

	Cenário: Deve incrementar contador
		Dado o valor do contador e 15
		Quando eu incrementar em 3
		Entao o valor do contador sera 18
		
	Cenário: Deve incrementar contador
		Dado o valor do contador e 16
		Quando eu incrementar em 3
		Entao o valor do contador sera 19
		
	Cenário: Deve calcular atraso no prazo de entrega
		Dado que o prazo de entrega em dia 29/10/2021
		Quando a entrega atrasar em 2 "dias"
		Entao a entrega sera efetuada em 01/11/2021
		
	Cenário: Deve calcular atraso no prazo de entrega da china
		Dado que o prazo de entrega em dia 05/04/2021
		Quando a entrega atrasar em 2 "meses"
		Entao a entrega deve ser efetuada em 05/06/2021