# 📈 backendStockExchange

A microservices‑based backend system that simulates a **Stock Exchange**.  
Built with **Spring Boot**, **Spring Cloud**, **Spring Security (JWT)**, and **PostgreSQL**.

> **Status:** 🏗️ *Work in progress* – features, tests, and documentation are actively being developed.

---

## 📂 Project Layout

backendStockExchange/
├── api-gateway/ → Spring Cloud Gateway (routing / token relay)
<br>
├── Company-Registration-Module/ → Company onboarding & share info
├── customer-registration-module/ → Customer onboarding & profiles
├── Demand-Supply-service/ → Buy / sell order matching
├── Share-Crud-Service/ → CRUD for shares
├── exchange-server/ → Eureka service registry
├── repository/ → Shared JPA / PostgreSQL access layer
├── security/ → Central auth service (Spring Security + JWT)
