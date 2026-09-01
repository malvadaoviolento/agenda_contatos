package br.edu.principal;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		List<String> celulares = new ArrayList<>();
		List<String> emails = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int opcao = 0;
		boolean continuar = true;
		
		System.out.println("==========================");
		System.out.println(" AGENDA DE CONTATOS ");
		System.out.println(" V.0.2.0 ");
		System.out.println("==========================");
		System.out.println("Bem-vindo!");
		
		while(continuar) {
			System.out.println();
			System.out.println("1 - Adicionar contato");
			System.out.println("2 - Listar contato");
			System.out.println("3 - Procurar contato");
			System.out.println("4 - Excluir contato");
			System.out.println("5 - Sair");
			System.out.println();
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine();
			switch(opcao) {
				case 1 -> {
					System.out.println("\n--- ADICIONAR CONTATO ---");
					
					System.out.print("Nome: ");
					nomes.add(sc.nextLine());
					
					System.out.print("Celular: ");
					celulares.add(sc.nextLine());
					
					System.out.print("E-mail: ");
					emails.add(sc.nextLine());
					
					System.out.println("Contato salvo com sucesso!");
				}
				case 2 -> {
					System.out.println("Listar contato");
					if(nomes.size() == 0) {
						System.out.println("Nenhum contato encontrado!");
					}
					
					else {
						for(int i = 0; i < nomes.size(); i++) {
							System.out.println("\nContato " + (i + 1));
							System.out.println("Nome: " + nomes.get(i));
							System.out.println("Celular: " + celulares.get(i));
							System.out.println("E-mail: " + emails.get(i));
							}
					}
				}
				case 3 -> {
					System.out.println("\n--- PROCURAR CONTATO ---");
					System.out.print("Digite o nome que deseja procurar: ");
					String nomeBusca = sc.nextLine();
					boolean encontrado = false;
					
					for(int i = 0; i < nomes.size(); i++) {
						if(nomes.get(i).equalsIgnoreCase(nomeBusca)) {
							System.out.println("Contato encontrado!");
							System.out.println("Nome: " + nomes.get(i));
							System.out.println("Celular: " + celulares.get(i));
							System.out.println("E-mail: " + emails.get(i));
							
							encontrado = true;
						}
					}
					
					if(!encontrado) {
						System.out.println("Contato não encontrado.");
					}
				}
				case 4 -> {
					System.out.println("\n--- EXCLUIR CONTATO ---");
					boolean achou = false;
					
					if(nomes.size() == 0) {
						System.out.println("Nenhum contato cadastrado.");
					} else {
						System.out.print("Digite o nome do contato que deseja excluir: ");
						String nomeExcluir = sc.nextLine();
						
						for(int i = 0; i < nomes.size(); i++) {
							if(nomes.get(i).equalsIgnoreCase(nomeExcluir)) {
								nomes.remove(i);
								celulares.remove(i);
								emails.remove(i);
								
								achou = true;
							}
						}
						
						if (!achou) {
							System.out.println("Contato nao encontrado");
						} else {
							System.out.println("Contato excluido com sucesso.");
						}
					}
				}
				case 5 -> {
					System.out.println("Saindo...");
					continuar = false;
				}
				
				default -> System.out.println("Opção inválida!");
			}
		}
	}
}