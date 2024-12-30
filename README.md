## Rodar apĺicação

1. Execute `mvn clean install` na pasta raiz.
2. Execute `docker-compose up --build` também na raiz.

Obs.: Faça isto sempre que fizer uma alteração no código-fonte.

### Verificar status dos serviços

#### API
Acesse http://localhost:8080/health

#### OpenSearch
Acesse http://localhost:9200