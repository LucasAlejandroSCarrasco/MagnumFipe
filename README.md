Magnum FIPE - Projeto Final (Mock)
==================================

Este pacote contém a implementação completa do teste, usando MOCK no lugar da API real da FIPE.

### Serviços
- api-1: expõe endpoints REST (trigger load, listar marcas, listar modelos, atualizar veículo)
- api-2: consome fila de marcas, simula consulta a FIPE (mock) e persiste em Postgres
- docker-compose: Postgres, Redis, RabbitMQ, api-1, api-2

### Segurança
- JWT habilitado, sem endpoint de login.
- Para acessar, gere tokens com a chave definida em `application.properties`.

### Endpoints API-1
- `POST /v1/vehicles/load` → envia marcas mock para fila
- `GET /v1/vehicles/brands` → lista marcas (com cache Redis)
- `GET /v1/vehicles/brand/{brandId}/models` → lista modelos/códigos por marca
- `PUT /v1/vehicles/{vehicleId}` → atualiza modelo/observações


