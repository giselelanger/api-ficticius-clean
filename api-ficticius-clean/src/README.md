
# api-ficticius-clean


API Rest Ficticius Clean

### Descrição Básica 

O Projeto faz uso das seguintes tecnologias:

- Spring Boot
- Spring Data
- H2 Database
- Swagger 
 
### API do Desafio Publicada no Endpoint

- Endpoint API: 

http://localhost:8080/api/veiculos

http://localhost:8080/api/veiculos/calcular-gastos
		
- Documentação Swagger: 

http://localhost:8080/swagger-ui.html

### Configurando o Ambiente Local

**Pipeline:** 
(Diretório Raiz do Projeto) 
Requisitos Básicos (Git, Apache Maven, JDK17)
	
1. Clonando Repositório Remoto
	
	`git clone https://github.com/giselelanger/api-ficticius-clean.git`
	`cd api-ficticius-clean`
	
2. Gerar o Artefato do Projeto:
	
	`mvn -B package`
	
3. Executar o profile de DEV
	
`java -jar -Dspring.profiles.active=dev target/api-ficticius-clean-0.0.1-SNAPSHOT.jar --server.port=8080`

4. Teste Básico
	
`curl -v http://localhost:8080/api/veiculos`

### Testes de Serviços usando Postman
`1. Cadastro de veículos:`

`Método HTTP: POST`
`URL:`
`http://localhost:8080/api/veiculos`

`Body (JSON):`
`{`
    `"nome": "Gol",`
    `"marca": "Volkswagen",`
    `"modelo": "1.6 MSI",`
    ` "dataFabricacao": "2021-05-15",`
    `"consumoCidade": 10.5,`
    `"consumoRodovia": 14.3`
`}`

`Passos:`
`- Abra o Postman`
`- Crie uma nova requisição`
`- Escolha método POST`
`- Insira a URL acima`
`- Na aba "Body", escolha "raw" e selecione JSON`
`- Cole o JSON fornecido`
`- Clique em "Send"`

`2. Cálculo e ranqueamento dos gastos:`

`Método HTTP: GET`
`URL:`
`http://localhost:8080/api/veiculos/calcular-gastos`

`Body (JSON):`
`{`
    `"precoGasolina": 6.59,`
   ` "kmCidade": 120,`
    `"kmRodovia": 400`
`}`


**Desenvolvido por:** Gisele Langer - 03-2025.
