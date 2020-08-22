#language: pt
Funcionalidade: Pesquisar no campo de busca

  @PequisarSuperget
  Esquema do Cenário: realizar acesso ao site
    Dado que desejo acessar o site
    Quando acionar o campo de busca
    E informar "<valorPesquisa>" e aciono o botao pesquisar
    Então no resultado da busca, clico no link "<valorResultado>"
    E verifico se a modal foi aberta com a mensagem "<valorResultado>"

		# O cenario solicitado não tinha nas opções de link,por isso pesquisei por outros topicos na primeira paginação
    Exemplos: 
      | valorPesquisa | valorResultado	|
      | superget	| Como cancelar a minha Conta SuperGet?	|
     	| superget	| Como acesso a minha conta SuperGet?	|
     	| superget	| Onde posso realizar saques com o meu Cartão SuperGet?	|
     	| superget	| Posso utilizar a conta SuperGet para receber as vendas de outras maquininhas?	|
