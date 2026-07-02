# 🚀 Microservices E-Commerce (Spring Boot)

Este repositório contém a arquitetura de microsserviços para uma aplicação escalável de e-commerce desenvolvida em Java com o ecossistema Spring. O ecossistema está sendo construído de forma modular para garantir alta disponibilidade e desacoplamento entre os serviços de produtos, vendas e controle de estoque.

---

## 🛠️ Tecnologias Utilizadas

* **Java 21** (ou a versão utilizada no seu ambiente)
* **Spring Boot 4.x / 3.x**
* **Spring Data JPA** (Persistência de dados)
* **Maven** (Gerenciador de dependências e build)
* **Git/GitHub** (Versionamento de código)

---

## 🏗️ Estrutura da Arquitetura (Módulos)

O ecossistema é composto atualmente pelos seguintes microsserviços:

### 📦 1. Product Service (`product-service`) ⚠️ *Em Desenvolvimento*
* **Responsabilidade:** Gerenciamento do catálogo de produtos da aplicação.
* **Funcionalidades:** Cadastro, atualização, remoção e listagem de produtos.

### 💳 2. Order Service (`orderservice`) ✅ *Estrutura Inicial Concluída*
* **Responsabilidade:** Processamento e gerenciamento de pedidos de compras.
* **Funcionalidades:** Criação de novos pedidos e integração com o sistema de inventário para validação de compras.

### 🗃️ 3. Inventory Service (`inventoryservice`) ✅ *Estrutura Inicial Concluída*
* **Responsabilidade:** Controle de estoque físico e disponibilidade de itens.
* **Funcionalidades:** Verificação de disponibilidade de produtos através do identificador exclusivo `skuCode`.

---

## 🚀 Como Executar o Projeto Localmente

### Pré-requisitos
* Java JDK instalado (compatível com a versão do projeto).
* Maven instalado globalmente (ou utilizando o wrapper `./mvnw`).
* Uma IDE de sua preferência (Recomendado: **IntelliJ IDEA**).

### Passos para Execução:

1. **Clonar o repositório:**
   ```bash
   git clone https://github.com
   ```
2. **Abrir no IntelliJ:**
   * Importe a pasta raiz `microservicos`.
   * Vincule os arquivos `pom.xml` de cada subpasta como projetos Maven independentes se a IDE não os reconhecer automaticamente.
3. **Rodar Múltiplos Serviços:**
   * Ative a aba **Services** no IntelliJ (`Alt + 8` no Windows ou `Cmd + 8` no Mac).
   * Inicialize os microsserviços simultaneamente através do painel centralizado de serviços da IDE.

---

## 🛠️ Próximos Passos do Roadmap

- [ ] Finalizar o desenvolvimento e endpoints do `product-service`.
- [ ] Implementar comunicação síncrona/assíncrona entre `orderservice` e `inventoryservice`.
- [ ] Configurar um **API Gateway** (Spring Cloud Gateway) para centralizar as requisições.
- [ ] Implementar o **Service Discovery** (Netflix Eureka Server) para registro automático dos microsserviços.

---
Desenvolvido por [David Alves (DavidSia16)](https://github.com).
