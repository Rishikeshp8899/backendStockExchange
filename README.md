# 📈 Stock Exchange Backend 

A microservices‑based backend system that simulates a **Stock Exchange**.  
Built with **Spring Boot**, **Spring Cloud**, **Spring Security (JWT)**, and **PostgreSQL**.

> **Status:** 🏗️ *Work in progress* – features, tests, and documentation are actively being developed.

---

## 📂 Project Layout

📁 **Backend Stock Exchange/**<br>
├── 🚪 **api-gateway/** → 🌐 Spring Cloud Gateway (routing / token relay)<br>
├── 🏢 **Company-Registration-Module/** → 🧾 Company onboarding & share info<br>
├── 👤 **customer-registration-module/** → 🧍 Customer onboarding & profile management<br>
├── ⚖️ **Demand-Supply-service/** → 🔁 Buy / Sell order matching logic<br>
├── 🧮 **Share-Crud-Service/** → ✏️ CRUD operations for shares<br>
├── 🧭 **exchange-server/** → 🗂️ Eureka Service Discovery<br>
├── 🗃️ **repository/** → 🧬 Shared JPA layer + PostgreSQL access<br>
├── 🔐 **security/** → 🛡️ Central Auth (Spring Security + JWT)<br>

