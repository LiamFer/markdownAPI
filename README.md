# 📝 Markdown Note-taking App

Projeto desenvolvido como parte do desafio do [roadmap.sh](https://roadmap.sh/projects/markdown-note-taking-app), que propõe a criação de uma aplicação de anotações em Markdown com funcionalidades de upload, renderização em HTML e verificação gramatical.

---

## 📌 Sobre o Projeto

Esta aplicação permite que os usuários:

- Façam upload de arquivos `.md` (Markdown);
- Verifiquem a gramática do conteúdo com base na API do LanguageTool;
- Salvem notas com o conteúdo original e a versão renderizada em HTML;
- Listem todas as notas salvas;
- Visualizem o HTML renderizado de uma nota específica.

---

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
  - Spring Web
  - Spring Data JPA
- **PostgresSQL Database** (Container)
- **flexmark-java** (renderização de Markdown)
- **LanguageTool API** (correção gramatical)
- **Lombok** (para reduzir boilerplate)

---

## 📂 Endpoints Disponíveis

### ✅ `POST /notes`
**Descrição:** Faz o upload de uma nota em Markdown e a salva com a versão HTML renderizada.

**Parâmetros:**  
- `title` (String)
- `markdown` (MultipartFile)

---

### ✅ `POST /notes/grammar-check`
**Descrição:** Verifica a gramática do conteúdo Markdown enviado.  
**Parâmetros:**
- `markdown` (MultipartFile)

---

### ✅ `GET /notes`
**Descrição:** Lista todas as notas salvas, com paginação.  
**Parâmetros:**  
- `page`, `size` (opcional)

---

### ✅ `GET /notes/{id}/rendered`
**Descrição:** Retorna o HTML renderizado da nota com base no ID.

---

## 📦 Exemplo de Requisição com `curl`

```bash
curl -X POST http://localhost:8080/notes \
  -F "title=Minha Nota" \
  -F "markdown=@exemplo.md"
````

---

## 💡 Como Rodar Localmente

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/markdown-note-app.git
   ```

2. Compile e execute:

   ```bash
   ./mvnw spring-boot:run
   ```

3. Acesse:
   `http://localhost:8080/notes`

---

## ✅ Roadmap

✔️ Upload de arquivos Markdown
✔️ Salvamento em banco com HTML renderizado
✔️ Renderização com Flexmark
✔️ Integração com LanguageTool para verificação gramatical
✔️ Paginação de resultados

---

## 📎 Desafio original

A proposta faz parte do roadmap.sh:
🔗 [https://roadmap.sh/projects/markdown-note-taking-app](https://roadmap.sh/projects/markdown-note-taking-app)

---
