# Agenda de Contatos

Projeto didático desenvolvido em Java para acompanhar a evolução dos conceitos trabalhados na disciplina de Programação Orientada a Objetos (POO).

O sistema é desenvolvido de forma incremental. Cada versão introduz novos conceitos, estruturas e melhorias sobre a versão anterior.

## Objetivo

Construir uma Agenda de Contatos completa, iniciando com uma solução procedural simples e evoluindo gradualmente para uma aplicação organizada com conceitos de Programação Orientada a Objetos, interface gráfica e persistência de dados.

## Evolução do Projeto

| Versão | Armazenamento / Recursos | Descrição |
|---|---|---|
| v0.0.0 | Variáveis simples | Permite armazenar apenas um contato em memória |
| v0.1.0 | Arrays | Permite vários contatos com capacidade fixa |
| v0.2.0 | List + ArrayList | Permite vários contatos com tamanho dinâmico |
| v0.3.0 | List + ArrayList | Adiciona a opção de alteração de contatos cadastrados |
| v1.0.0 | List + ArrayList | Modularização das funcionalidades em métodos na classe principal |
| v1.1.0 | List + ArrayList | Separação das responsabilidades e métodos em arquivos/classes utilitárias |
| v1.1.1 | List + ArrayList | Correção de bug no fluxo de encerramento do sistema (opção Sair) |
| v2.1.0 | Arquivo TXT (I/O Java) | Persistência de dados em arquivo texto utilizando `java.io` |

---

### v0.0.0 — Programação Procedural Básica

Primeira versão da Agenda.

Principais características:
- Uma única classe `Principal`;
- Todo o código dentro do método `main()`;
- Armazenamento de apenas um contato;
- Variáveis `nome`, `celular` e `email`;
- Menu interativo via console (`Scanner`, `if-else`, `switch-case`, `while`);
- Funcionalidades: Adicionar, Listar, Procurar, Excluir e Sair.

---

### v0.1.0 — Arrays e Capacidade Fixa

Segunda versão da Agenda.

Principais características:
- Uso de arrays simples (`String[]`) para cada atributo;
- Controle de capacidade máxima pré-definida;
- Manipulação através de índices e estrutura `for`;
- Busca sequencial e reorganização física do array na remoção.

---

### v0.2.0 — Armazenamento Dinâmico com ArrayList

Terceira versão da Agenda.

Principais características:
- Uso da API de Coleções do Java (`List` e `ArrayList`);
- Uso de Generics (`<String>`);
- Alocação e redimensionamento dinâmico;
- Utilização dos métodos da API (`add`, `get`, `remove`, `size`, `indexOf`);
- Iteração com `for-each`.

---

### v0.3.0 — Atualização de Registros

Quarta versão da Agenda.

Principais características:
- Nova opção no menu: **Alterar contato**;
- Busca prévia do registro a ser modificado;
- Atualização das listas utilizando o método `set()`.

---

### v1.0.0 — Modularização com Métodos

Reorganização do código procedural em funções/métodos na mesma classe.

Principais alterações:
- Criação dos métodos `adicionar()`, `listar()`, `pesquisar()`, `atualizar()` e `excluir()`;
- Simplificação da estrutura do `switch-case` no `main()`;
- Passagem de dados via parâmetros e argumentos;
- Estudo de conceitos: escopo de variáveis, retornos (`void`) e refatoração.

---

### v1.1.0 — Modularização em Múltiplos Arquivos

Organização e separação das responsabilidades em diferentes arquivos do projeto.

Principais alterações:
- Criação de classes dedicadas para auxílio e gerenciamento da agenda (`Uteis`, `Agenda`);
- Divisão entre a interface com o usuário (menu no console) e a lógica de processamento dos dados.

---

### v1.1.1 — Correção de Bug (Hotfix)

Versão de ajuste e refinamento da série v1.x.

Principais alterações:
- Correção de bug no encerramento da execução da aplicação (opção de saída do menu);
- Garantia do fechamento correto dos fluxos de leitura do `Scanner`.

---

### v2.1.0 — Persistência de Dados em Arquivo Texto (TXT)

Introdução da **persistência de dados**. Os contatos cadastrados deixam de ser perdidos ao encerrar a aplicação e passam a ser gravados em disco em arquivo texto formato `.txt`.

Principais características e conceitos:
- Leitura e escrita de dados em disco utilizando a API `java.io`;
- Representação e verificação do arquivo com `File`;
- Leitura estruturada linha a linha com `FileReader` e `BufferedReader`;
- Gravação e manipulação de fluxo de escrita com `FileWriter` e `PrintWriter`;
- Carregamento automático dos contatos ao iniciar a aplicação;
- Atualização e sincronização do arquivo texto nas operações de inserção, alteração e exclusão;
- Tratamento de exceções de entrada e saída (`IOException`).

---

## Versão Atual

**v2.1.0** — Persistência de dados em arquivos TXT (`java.io`).

---

## Controle de Versões

As versões estáveis do projeto são identificadas por tags Git:

```text
- v0
  - v0.0.0
  - v0.1.0
  - v0.2.0
  - v0.3.0
- v1
  - v1.0.0
  - v1.1.0
  - v1.1.1
- v2
  - v2.1.0