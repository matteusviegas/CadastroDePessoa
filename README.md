# CadastroDePessoa - Azure DevOps Cloud

## Objetivo
Aplicação Spring Boot com CRUD de Pessoa e Endereço utilizando Azure DevOps, Azure App Service e Oracle Autonomous Database OCI.

---

## Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Data JPA
- Oracle Autonomous Database
- Azure App Service
- Azure DevOps
- Azure Pipelines
- Postman

---

## Estrutura do Projeto
- CRUD de Pessoa
- CRUD de Endereço
- Relacionamento entre tabelas
- CI/CD com Azure Pipelines
- Deploy em nuvem

---

## Endpoints

### Pessoa
GET /pessoas
POST /pessoas
PUT /pessoas/{id}
DELETE /pessoas/{id}

### Endereço
GET /enderecos
POST /enderecos
PUT /enderecos/{id}
DELETE /enderecos/{id}

---

## Pipeline YAML
O projeto utiliza pipeline CI/CD via arquivo:

azure-pipelines.yml

Responsável por:
- build do projeto
- empacotamento Maven
- release/deploy

---

## Banco de Dados
Oracle Autonomous Database hospedado na OCI.

Tabelas:
- PESSOA
- ENDERECO

---

## JSONs do CRUD
Os arquivos JSON utilizados nos testes do Postman estão na pasta:

jsons/

---

## Deploy Cloud
Aplicação hospedada no Azure App Service.

---

## Integrantes
- RM561090 Matteus Viegas
- RM561089 Sulamita Viegas
- RM560914 Lucas Almeida
