package ecommerce;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		byte menu = 0;
		boolean darkMode = false; 
		
		String[] menuList = { "1 - Cadastrar novo produto",
							  "2 - Listar produtos", 
							  "3 - Atualizar informações do produto",
							  "4 - Excluir produto",
							  "5 - Buscar produto por nome",
							  "6 - Modo escuro ou claro",
							  "7 - Sair"};
		
		do {
			
			menu = DisplayMenu.display(read, menuList, darkMode);
			
			switch(menu) {
			
			case 1:
				System.out.println("aaaaaaaahhhhhhhhhhh");
				break;

			case 2:
				
				break;
			
			case 3:
				
				break;

			case 4:
				
				break;
			
			case 5:
				
				break;
			
			case 6:
				darkMode = !darkMode;
				
				break;
				
			case 7:
				System.out.println("Saindo....");
				break;

			default:
				System.out.println("Operação Inválida");
				break;
			}
			
		}while(menu != 7);
		
		
		
		read.close();

	}

}