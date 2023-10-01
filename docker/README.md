# DOCKERFILE DO BANCO DE DADOS
Para gerar a imagem docker do banco de dados execute os seguintes passos:

## Crie uma imagem baseada no dockerfile compartilhado

```bash
docker build -t ubs-digital-db .

## Com a imagem criada execute um novo conteiner a partir dela
docker run --name <nome-do-conteiner> -e POSTGRES_PASSWORD=Abacate@123 -p 5432:5432 ubs-digital-db

Caso queira que a imagem seja removida assim que finalizada, adicione o paramentro --rm na linha de comando acima
