# 🧠 Funny Translation API Consumer

Este projeto é uma aplicação Java com Spring Boot que consome a [FunTranslations API](https://funtranslations.com/) para traduzir textos para idiomas "divertidos" como **Yoda** e **Minion**. O objetivo é aplicar boas práticas de desenvolvimento, incluindo o uso de **FeignClient**, **Spring Data JPA**, **Swagger**, **H2 Database**, e **Padrões de Projeto**.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- FeignClient
- H2 Database (in-memory)
- Swagger (Springdoc OpenAPI)

---

## 📦 Funcionalidades

- 🎯 Traduz texto para linguagem dos Minions ou do Yoda.
- 💾 Armazena traduções realizadas no banco H2.
- 🔍 Consulta todas as traduções salvas ou uma específica por ID.
- ❌ Remove traduções pelo ID.

## ▶️ Como Executar

1. **Clone o repositório**:
```bash
git clone https://github.com/luqczinn/translation-api-consumer.git
cd translation-api-consumer
```

2. Execute a aplicação.

A aplicação estará disponível em: [http://localhost:8080](http://localhost:8080/swagger-ui/index.html)
