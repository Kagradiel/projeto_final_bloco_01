package ecommerce;

import java.io.IOException;
import java.util.Scanner;

import ecommerce.test.ProductTests;


public class Main {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		
		ProductTests.test();
		
		byte menu = 0;
		boolean darkMode = false; 
		
		String[] menuList = { "1 - Cadastrar novo produto",
							  "2 - Listar produtos", 
							  "3 - Atualizar informações do produto",
							  "4 - Excluir produto",
							  "5 - Buscar produto",
							  "6 - Modo escuro ou claro",
							  "7 - Sair"};
		
		do {
			
			menu = DisplayMenu.display(read, menuList, darkMode);
			
			switch(menu) {
			
			case 1:
				System.out.println("aaaaaaaahhhhhhhhhhh");
				
				keyPress();
				break;

			case 2:
				
				keyPress();
				break;
			
			case 3:
				
				keyPress();
				break;

			case 4:
				
				keyPress();
				break;
			
			case 5:
				
				keyPress();
				break;
			
			case 6:
				darkMode = !darkMode;
				break;
				
			case 7:
				System.out.println("Saindo....");
				break;

			default:
				System.out.println("Operação Inválida");
				keyPress();
				break;
			}
			
		}while(menu != 7);
		
		
		
		
		read.close();

	}
	
	public static void keyPress() {

		try {

			System.out.println("\nPressione Enter para Continuar ...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}

	};

}
