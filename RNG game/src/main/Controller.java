package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		//create an inventory of randomized items:
		//prizePool arrayList will hold items
		ArrayList<Item> prizePool = new ArrayList<Item>();
		
		//populate and add items to "prizePool"
		for(int i = 0; i <= 4; i++) {
			Item item = new Item();
			prizePool.add(item);
		}
		
		//create an instance of the player object
		Player player = new Player();
				
		//prompt player to make a selections
		System.out.println("enter you selection on the keyboard");

		//player methods:
//		A-play: uses point to purchase a random item in the prizePool
//		B-Sell: sell an item in the player inventory to add point to the player point total
//		C-View Inventory: view contents of player inventory
//		D-View Prize Pool: view contents of the prizePool
		
		//controller method display menu will run that will prompt player with play/menu choices
		displayMenu(player, prizePool);		
		
	}

	private static void displayMenu(Player player, ArrayList<Item> prizePool) {
		//create scanner for player input
		Scanner reader = new Scanner(System.in);
		//prompt user with game choices
		System.out.println("Please select one of the following:");
		System.out.println("A- Play| B-Sell| C-View Inventory| D-View Prize Pool");
		
		//get player input and run corresponding method
		char playerChoice = reader.next().charAt(0);
		
//		//logic for determining which method to run
		if(playerChoice == 'A') {
			player.play(prizePool);
		}else if(playerChoice == 'B') {
			player.sell();
		}else if(playerChoice == 'C') {
			player.viewPlayerInv();
		}else if(playerChoice == 'D') {
			player.viewPrizePool(prizePool);
		}
		
//		//close the scanner
		reader.close();
		
	}

}
