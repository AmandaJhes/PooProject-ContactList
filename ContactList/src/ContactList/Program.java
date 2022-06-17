package ContactList;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		
		
		
		ArrayList<Contact> contacts = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		int option;
		String repeat = "";
		
		do {
			
			System.out.println("\nAgenda de Contatos");
			System.out.println("1-Adicionar Contato");
			System.out.println("2-Listar Contato");
			System.out.println("3-Excluir Contato");
			System.out.println("4-Fechar Agenda");
			System.out.print("Escolha uma opção: ");
			option = ler.nextInt();
			
			switch(option) {
			case 1:
				do {
					System.out.println("\nDigite os dados do contato");
					System.out.print("Nome: ");
					String name = ler.next();
					System.out.println("Number: ");
					String number = ler.next();
					System.out.println("Parentesco: ");
					String familiaridade = ler.next();
					
					contacts.add(new Contact(name, number, familiaridade));
					
					System.out.println("\nDeseja continuar a cadastrar contatos? (yes or no)");
					repeat = ler.next();
					
				} while (repeat.equals("yes"));	
				break;
				
			case 2:
				System.out.println("\nListagem dos contatos");
				for (Contact contact : contacts) {
				    System.out.println(contact.toString());
				}
				break;
				
			case 3:
				System.out.println("Digite o nome do contato que deseja remover: ");
				String removeContact = ler.next();
				
				for(int i = 0; i < contacts.size(); i++)
			    {
			        Contact p = contacts.get(i);

			        if(p.getName().equals(removeContact))
			        {
			            // Encontrou uma pessoa cadastrada com nome "Pedro".

			            // Remove.
			            contacts.remove(p);
			            
			            System.out.print("Contato " + removeContact + " foi removido!");
			            // Sai do loop.
			            break;
			        }
			    }
				break;
			case 4:
				System.out.println("Programa Finalizado!");
				return;
			default:
				System.out.println("Opção Inválida! Por favor digite novamente.");
				break;
			}
		} while (option != 4);
		
		System.out.println("Você encerrou a Agenda!!! Bye.");
		
	}

}
