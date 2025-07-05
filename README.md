# 📈 backendStockExchange

A microservices‑based backend system that simulates a **Stock Exchange**.  
Built with **Spring Boot**, **Spring Cloud**, **Spring Security (JWT)**, and **PostgreSQL**.

> **Status:** 🏗️ *Work in progress* – features, tests, and documentation are actively being developed.

---

## 📂 Project Layout

backendStockExchange/<br>
├── api-gateway/ → Spring Cloud Gateway (routing / token relay)
<br>
├── Company-Registration-Module/ → Company onboarding & share info<br>
├── customer-registration-module/ → Customer onboarding & profiles<br>
├── Demand-Supply-service/ → Buy / sell order matching<br>
├── Share-Crud-Service/ → CRUD for shares<br>
├── exchange-server/ → Eureka service registry<br>
├── repository/ → Shared JPA / PostgreSQL access layer<br>
├── security/ → Central auth service (Spring Security + JWT)<br>
