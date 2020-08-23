# getNet

Esse projeto foi realizado como parte de um processo seletivo para a empresa DBC Company.

>>DESAFIO AUTOMAÇÃO

Passos:

1 - Acessar o site: https://site.getnet.com.br/
2 - No campo de busca(LUPA), pesquisar por "superget"
3 - No resultado da busca, clicar no link " como faço a portabilidade da
minha maquininha"
4 – Verificar se a modal foi aberta com a mensagem “Como faço a
portabilidade da minha maquininha?"

Preferencialmente desenvolver com linguagem Java, com selenium, cucumber.

Além da automação dos passos descritos acima, serão avaliados itens como
design das classes, organização, manutenibilidade do código, orientação a
objeto, arquitetura da automação, clean code, seletores utilizados para
identificar os elementos web (xpath, css, id) e etc.

>> ATENÇÃO

Foi realizado a estrutura de automação de forma que buscasse todos os link da primeira pagina, pois não pude encontrar o link "como faço a portabilidade da
minha maquininha" em nenhum das paginas de resultado, optei por inserir novos link no script de teste.

---
## Índice

- [Tecnologias utilizadas](#tecnologias-utilizadas)
- [Executar o teste](#executar-o-teste)
- [Relatórios de testes](#relatórios-de-testes)
- [Observações sobre o resultado dos testes](#observações-sobre-o-resultado-dos-testes)
- [Jenkins](#jenkins)
- [Considerações Finais](#considerações-finais)
---
## Tecnologias utilizadas
---
Para o desafio, foram ultilizadas as seguintes tecnologias:
- Selenium
- Java
- Cucumber (BDD)
- Junit
---

## Executar o teste

Para executar o projeto, via Maven, basta seguir no seu terminal predileto para o diretório do projeto e executar o seguinte comando:
```bash
  $ mvn test
```
Caso deseje executar pela IDE de sua preferência, executar o arquivo *RunPesquisaGetNet.java* inicia todos os testes. 

---
## Relatórios de testes 
 
Ao executar os testes, os relatórios HTML estão sendo gravados dentro do diretório *target/cucumber-reports/html/*. Nesse report HTML, está registrada a execução dos casos de testes, juntamente com as descrições de sucesso/falha no testes executados.

---
## Considerações Finais
 
*UFA!* Deu trabalho! rsrs e valeu a pena. Como há algum tempo já não trabalhava com testes em interface, precisei de um tempo para recuperar a antiga prática, ainda mais no BDD, pois atualmente trabalho com algo próximo ao teste unitário. Foi um exercício interessante reativar os conhecimentos. 

Em resumo, durante o desafio, fui me afiando e aprendendo. Espero conseguir mostrar meus conhecimentos para meus avaliadores. 
 
Até mais!
