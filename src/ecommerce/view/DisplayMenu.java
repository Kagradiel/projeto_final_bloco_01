package ecommerce.view;

import java.util.Scanner;

import ecommerce.util.Cores;


public class DisplayMenu {

	public static byte display(Scanner read, String[] menuList, boolean darkMode) {

		if(darkMode) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+"\n----------------------------------------\n");

			for (int i = 0; i < menuList.length; i++)
				System.out.println(menuList[i]);

			System.out.println("\n----------------------------------------\n");

			System.out.print("O que você quer fazer: ");
			
		}else {
			System.out.println(Cores.ANSI_BACKGROUND_RGB_WHITE + Cores.TEXT_BLACK + "\n----------------------------------------\n");

			for (int i = 0; i < menuList.length; i++)
				System.out.println(menuList[i]);

			System.out.println("\n----------------------------------------\n");

			System.out.print("O que você quer fazer: ");

		}
		
		byte menu = read.nextByte();

		return menu;
	}

}
