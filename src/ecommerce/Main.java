package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.controller.ProductController;
import ecommerce.test.ProductTests;
import ecommerce.view.DisplayMenu;
import ecommerce.view.ProdsView;


public class Main {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		ProductController productController = new ProductController();
		ProductTests.test(productController);
		
		byte menu = 0;
		boolean darkMode = false; 
		
		String[] menuList = { "1 - Cadastrar smartphones",
							  "2 - Listar smartphones",
							  "3 - Listar smartphones por categoria",
							  "4 - Atualizar informações do smartphones",
							  "5 - Excluir smartphones",
							  "6 - Buscar smartphones",
							  "7 - Modo escuro ou claro",
							  "8 - Sair"};
		
		do {
			
			try {
                menu = DisplayMenu.display(read, menuList, darkMode);
                
                switch(menu) {
                
                case 1:
                    read.nextLine();
                    ProdsView.create(read, productController);
                    keyPress();
                    break;

                case 2:
                    ProdsView.listAll(productController);
                    keyPress();
                    break;
                    
                case 3:
                    read.nextLine();
                    ProdsView.listByCategory(read, productController);
                    keyPress();
                    break;
                
                case 4:
                    read.nextLine();
                    ProdsView.update(read, productController);
                    keyPress();
                    break;

                case 5:
                    read.nextLine();
                    ProdsView.delete(read, productController);
                    keyPress();
                    break;
                
                case 6:
                    read.nextLine();
                    ProdsView.search(read, productController);
                    keyPress();
                    break;
                    
                case 7:
                    darkMode = !darkMode;
                    System.out.println(darkMode ? "Modo escuro ativado!" : "Modo claro ativado!");
                    break;
                    
                case 8:
                    System.out.println("Saindo....");
                    break;

                default:
                    System.out.println("Operação Inválida");
                    keyPress();
                    break;
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número válido.");
                read.nextLine();
                keyPress(); 
                
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
                e.printStackTrace();
                keyPress();
                
            }
			
		}while(menu != 8);
		
		
		
		
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
