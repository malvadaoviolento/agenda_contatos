package br.edu.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> celulares = new ArrayList<>();
        List<String> emails = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        mostraMenu();
        
        while (continuar) {
            switch (receberOpcao(sc)) {
                case 1 -> adicionar(sc, nomes, emails, celulares);
                case 2 -> listar(nomes, emails, celulares);
                case 3 -> buscar(sc, nomes, emails, celulares);
                case 4 -> alterar(sc, nomes, emails, celulares);
                case 5 -> excluir(sc, nomes, emails, celulares);
                case 6 -> { System.out.println("Saindo da Agenda de Contatos..."); continuar = false; }
                default -> System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
    
    public static void mostraMenu () {
    	System.out.println("==========================");
        System.out.println("    AGENDA DE CONTATOS    ");
        System.out.println("         V.0.3.0          ");
        System.out.println("==========================");
        System.out.println("Bem-vindo!");
    }
    
    public static int receberOpcao (Scanner scanner) {
    	System.out.println();
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Listar contatos");
        System.out.println("3 - Procurar contato");
        System.out.println("4 - Alterar contato");
        System.out.println("5 - Excluir contato");
        System.out.println("6 - Sair");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();
        
        return opcao;
    }
    
    public static void adicionar (Scanner scanner, List<String> nomes, List<String> emails, List<String> celulares) {
    	System.out.println("=== ADICIONAR CONTATO ===");
        System.out.print("Digite o nome: ");
        nomes.add(scanner.nextLine());
        System.out.print("Digite o celular: ");
        celulares.add(scanner.nextLine());
        System.out.print("Digite o email: ");
        emails.add(scanner.nextLine());

        System.out.println("Contato adicionado com sucesso!");
    }
    
    public static void listar (List<String> nomes, List<String> emails, List<String> celulares) {
        System.out.println("=== LISTAR CONTATOS ===");
        if (nomes.isEmpty()) {
            System.out.println("Nenhum contato cadastrado!");
        } else {
            for (int i = 0; i < nomes.size(); i++) {
                System.out.println("--------------------------");
                System.out.println("Nome: " + nomes.get(i));
                System.out.println("Celular: " + celulares.get(i));
                System.out.println("Email: " + emails.get(i));
            }
        }
    }
    
    public static void buscar (Scanner scanner, List<String> nomes, List<String> emails, List<String> celulares) {
    	System.out.println("=== PROCURAR CONTATO ===");
        System.out.print("Digite o nome do contato: ");
        String nomeBusca = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase(nomeBusca)) {
                System.out.println("--------------------------");
                System.out.println("Nome: " + nomes.get(i));
                System.out.println("Celular: " + celulares.get(i));
                System.out.println("Email: " + emails.get(i));
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Contato não encontrado!");
        }
    }
    
    public static void alterar (Scanner scanner, List<String> nomes, List<String> emails, List<String> celulares) {
        System.out.println("=== ALTERAR CONTATO ===");
        System.out.print("Digite o nome do contato: ");
        String nomeProcurado = scanner.nextLine();
        int posicao = -1;

        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase(nomeProcurado)) {
                posicao = i;
            }
        }

        if (posicao != -1) {
            System.out.print("Digite o novo nome: ");
            String novoNome = sc.nextLine();
            System.out.print("Digite o novo celular: ");
            String novoCelular = sc.nextLine();
            System.out.print("Digite o novo email: ");
            String novoEmail = sc.nextLine();

            nomes.set(posicao, novoNome);
            celulares.set(posicao, novoCelular);
            emails.set(posicao, novoEmail);

            System.out.println("Contato alterado com sucesso!");
        } else {
            System.out.println("Contato não encontrado!");
        }
    }
    
    public static void excluir (Scanner scanner, List<String> nomes, List<String> emails, List<String> celulares) {
    	 System.out.println("=== EXCLUIR CONTATO ===");
         System.out.print("Digite o nome do contato: ");
         String nomeExcluir = scanner.nextLine();
         boolean excluido = false;

         for (int i = 0; i < nomes.size(); i++) {
             if (nomes.get(i).equalsIgnoreCase(nomeExcluir)) {
                 nomes.remove(i);
                 celulares.remove(i);
                 emails.remove(i);
                 excluido = true;
                 System.out.println("Contato excluído com sucesso!");
                 break;
             }
         }

         if (!excluido) {
             System.out.println("Contato não encontrado!");
         }
    }
}