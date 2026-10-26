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
| v3.0.0 | Classes e Objetos | Introdução à Programação Orientada a Objetos com a criação da classe `Contato` |
| v3.1.0 | Coleção de Objetos | Armazenamento de objetos `Contato` utilizando `List<Contato>` |
| v3.2.0 | CRUD Orientado a Objetos | Adaptação das operações CRUD e da persistência para utilizar `List<Contato>` |
| v3.3.0 | Encapsulamento | Encapsulamento e melhoria da modelagem da classe `Contato` |

## Histórico de Versões

### v0.0.0 — Versão Inicial

Primeira versão da Agenda de Contatos.

Nesta versão, os dados de um contato são armazenados utilizando variáveis simples.

Principais características e conceitos:

- Entrada e saída de dados;
- Utilização da classe `Scanner`;
- Estruturas condicionais;
- Estruturas de repetição;
- Menu de opções;
- Armazenamento de apenas um contato em memória.

### v0.1.0 — Arrays

Evolução da Agenda de Contatos para permitir o armazenamento de vários contatos.

Principais características e conceitos:

- Introdução a arrays;
- Armazenamento de vários contatos;
- Utilização de índices;
- Capacidade fixa de armazenamento;
- Percurso dos dados utilizando estruturas de repetição.

### v0.2.0 — List e ArrayList

Substituição dos arrays por coleções dinâmicas.

Principais características e conceitos:

- Introdução à interface `List`;
- Utilização da classe `ArrayList`;
- Introdução a Generics;
- Utilização de `List<String>`;
- Inserção de elementos com `add()`;
- Recuperação de elementos com `get()`;
- Remoção de elementos com `remove()`;
- Armazenamento dinâmico de contatos.

### v0.3.0 — Alteração de Contatos

Inclusão da funcionalidade de alteração dos dados de um contato já cadastrado.

Principais características e conceitos:

- Pesquisa de contatos;
- Identificação da posição de um contato;
- Alteração de elementos utilizando `set()`;
- Ampliação das operações do CRUD;
- Manipulação dos dados armazenados nas listas.

### v1.0.0 — Modularização

Reorganização do código da Agenda de Contatos por meio da criação de métodos.

Principais características e conceitos:

- Introdução à modularização;
- Criação de métodos;
- Passagem de parâmetros;
- Separação das funcionalidades da aplicação;
- Redução da quantidade de código no método `main`;
- Organização das operações da Agenda.

### v1.1.0 — Separação em Classes

Evolução da modularização com a distribuição das funcionalidades em diferentes arquivos e classes.

Principais características e conceitos:

- Organização do projeto em diferentes classes;
- Separação das funcionalidades da Agenda;
- Criação da classe `Agenda`;
- Criação da classe `Uteis`;
- Redução das responsabilidades da classe `Principal`;
- Melhoria na organização e manutenção do código.

### v1.1.1 — Correção do Fluxo de Saída

Versão de correção da Agenda de Contatos.

Principais características:

- Correção do comportamento da opção Sair;
- Ajuste do fluxo de encerramento da aplicação;
- Manutenção da estrutura implementada na v1.1.0.

### v2.1.0 — Persistência em Arquivo TXT

Introdução da persistência dos dados utilizando arquivos.

Nesta versão, os contatos deixam de existir somente durante a execução da aplicação e passam a ser armazenados em um arquivo texto.

Principais características e conceitos:

- Introdução à persistência de dados;
- Criação da classe `Persistencia`;
- Utilização de classes do pacote `java.io`;
- Escrita de dados em arquivo;
- Leitura de dados do arquivo;
- Carregamento dos contatos ao iniciar a aplicação;
- Salvamento dos contatos ao encerrar a aplicação;
- Utilização do arquivo `contatos.txt`.

Os dados são armazenados utilizando o formato:

```text
nome;celular;email
```

### v3.0.0 — Introdução a Classes e Objetos

Início da transição da abordagem procedural para a **Programação Orientada a Objetos (POO)**.

Nesta versão é criada a classe `Contato`, permitindo representar um contato como uma entidade do sistema e agrupar suas informações em um único objeto.

Principais características e conceitos:

- Introdução ao paradigma de Programação Orientada a Objetos;
- Comparação entre a abordagem procedural e a abordagem orientada a objetos;
- Identificação e modelagem da entidade `Contato`;
- Criação da classe `Contato`;
- Definição dos atributos `nome`, `celular` e `email`;
- Criação e instanciação de objetos;
- Utilização do operador `new`;
- Acesso aos atributos de um objeto;
- Criação de diferentes objetos a partir da mesma classe;
- Introdução aos conceitos de referência e estado de um objeto.

### v3.1.0 — Coleção de Objetos

Evolução da representação dos contatos utilizando uma coleção de objetos do tipo `Contato`.

Nesta versão, os conceitos de `List` e `ArrayList`, já utilizados anteriormente com `String`, são aplicados à classe `Contato`, permitindo armazenar vários contatos em uma única coleção.

Principais características e conceitos:

- Revisão de `List`, `ArrayList` e Generics;
- Criação de uma coleção `List<Contato>`;
- Armazenamento de objetos `Contato` utilizando o método `add()`;
- Recuperação de objetos da coleção utilizando `get()`;
- Percurso da coleção utilizando `for-each`;
- Acesso aos atributos dos objetos armazenados;
- Introdução ao conceito de referência de objetos em coleções;
- Comparação entre listas paralelas de `String` e uma única coleção de objetos;
- Representação de cada contato como uma entidade completa dentro da coleção.

### v3.2.0 — CRUD Orientado a Objetos

Evolução das operações da Agenda de Contatos para trabalhar diretamente com objetos da classe `Contato`.

Nesta versão, as três listas independentes utilizadas para armazenar nomes, celulares e e-mails são substituídas por uma única coleção `List<Contato>`.

As operações do CRUD passam a manipular diretamente os objetos armazenados nessa coleção.

Principais características e conceitos:

- Adaptação das operações de adicionar, listar, pesquisar, alterar e excluir contatos;
- Utilização de `List<Contato>` em todo o CRUD;
- Criação de um novo objeto `Contato` para cada cadastro;
- Percurso da coleção utilizando `for-each`;
- Pesquisa de contatos por meio dos atributos dos objetos;
- Manipulação do estado dos objetos;
- Utilização de referências para localizar e alterar objetos;
- Remoção de objetos da coleção;
- Eliminação das listas paralelas de nomes, celulares e e-mails;
- Adaptação da persistência para trabalhar com `List<Contato>`;
- Reconstrução dos objetos `Contato` durante a leitura do arquivo;
- Manutenção do formato `nome;celular;email` no arquivo `contatos.txt`.

### v3.3.0 — Encapsulamento e Modelagem da Classe

Evolução da classe `Contato` para proteger seu estado interno e controlar o acesso aos seus atributos.

Os atributos, anteriormente públicos, passam a utilizar o modificador de acesso `private`.

```java
private String nome;
private String celular;
private String email;
```

O acesso aos dados passa a ser realizado por meio de métodos getters:

```java
public String getNome() {
    return nome;
}
```

A alteração dos dados passa a ser realizada por meio de métodos setters:

```java
public void setNome(String nome) {
    this.nome = nome;
}
```

Também é criado um construtor para permitir que um objeto `Contato` seja inicializado com seus dados no momento da criação:

```java
public Contato(String nome, String celular, String email) {
    this.nome = nome;
    this.celular = celular;
    this.email = email;
}
```

Assim, a criação de um contato passa a ser realizada diretamente:

```java
Contato contato = new Contato(nome, celular, email);
```

Principais características e conceitos:

- Introdução ao encapsulamento;
- Utilização do modificador de acesso `private`;
- Proteção dos atributos da classe `Contato`;
- Criação de métodos getters;
- Criação de métodos setters;
- Leitura controlada dos atributos;
- Alteração controlada do estado dos objetos;
- Criação de construtor com parâmetros;
- Utilização da palavra-chave `this`;
- Diferenciação entre atributos do objeto e parâmetros;
- Adaptação das operações CRUD para utilizar getters e setters;
- Adaptação da persistência para utilizar getters;
- Reconstrução dos objetos utilizando o construtor;
- Eliminação do acesso direto aos atributos fora da classe `Contato`.

## Estrutura Atual

A aplicação utiliza uma única coleção de objetos:

```java
List<Contato> contatos = new ArrayList<>();
```

Cada contato é representado por uma instância da classe `Contato`:

```java
Contato contato = new Contato(nome, celular, email);
```

A classe `Contato` é responsável pela representação e pelo acesso controlado aos seus dados:

```java
public class Contato {

    private String nome;
    private String celular;
    private String email;

    public Contato(String nome, String celular, String email) {
        this.nome = nome;
        this.celular = celular;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
```

A estrutura principal da aplicação permanece:

```text
Principal
    │
    └── List<Contato>
            │
            ├── Agenda
            │     ├── adicionar()
            │     ├── listar()
            │     ├── pesquisar()
            │     ├── atualizar()
            │     └── excluir()
            │
            └── Persistencia
                  ├── carregarContatos()
                  └── salvarContatos()
```

Os dados continuam sendo armazenados no arquivo `contatos.txt`:

```text
nome;celular;email
```

## Tecnologias e Conceitos

- Java;
- Programação Orientada a Objetos;
- Classes e objetos;
- Encapsulamento;
- Modificadores de acesso;
- Getters e setters;
- Construtores;
- Palavra-chave `this`;
- Java Collections Framework;
- `List`;
- `ArrayList`;
- Java I/O;
- Persistência em arquivo;
- Git;
- GitHub.

## Versão Atual

**v3.3.0 — Encapsulamento e Modelagem da Classe**

Nesta versão, concluímos a etapa inicial de fundamentos de Programação Orientada a Objetos, evoluindo desde a criação da classe `Contato` até o encapsulamento de seus atributos.

## Próxima Evolução

**V4 — Padrão DAO**

A próxima etapa do projeto será dedicada à separação da lógica de acesso aos dados, preparando a aplicação para evoluções futuras nos mecanismos de persistência.