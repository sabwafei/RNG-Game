package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		//create an inventory of randomized items:
		//arrayList to hold inventory items
		ArrayList<Item> prizePool = new ArrayList<Item>();
		//populate and items to "prizePool"
		for(int i = 0; i < 5; i++) {
			Item item = new Item();
			item.setId(i);
			prizePool.add(item);
		}
		
		//create an instance of the player object
		Player player = new Player();
		
		//create the player inventory
		
		//prompt player to make a selections
		System.out.println("What would you like to do: ");
		System.out.println("enter you selection on the keyboard");

		//player methods:
//		A-play: uses point to purchase a random item in the prizePool
//		B-Sell: sell an item in the player inventory to add point to the player point total
//		C-View Inventory: view contents of player inventory
//		D-View Prize Pool: view contents of the prizePool
		
		//controller method display menu will run that will prompt player with play/menu choices
		displayMenu(player, prizePool);
		//testing printing out player inventory contents:
		//works but sometimes fails due to out of bounds exception
		System.out.println(player.getPlayerInventory());
		
		
		//print out prize pool for testing
//		for(int i = 0; i < prizePool.size(); i++) {
//			System.out.println(prizePool.get(i));
//		}
	}

	private static void displayMenu(Player player, ArrayList<Item> prizePool) {
		//create scanner for player input
		Scanner reader = new Scanner(System.in);
		//prompt user with game choices
		System.out.println("Please select one of the following:");
		System.out.println("A- Play| B-Sell| C-View Inventry| D-View Prize Pool");
		player.play(prizePool);

		//get player input and run corresponding method
//		String playerChoice = reader.nextLine();
//		
//		//logic for determining which method to run
//		if(playerChoice == "A") {
//			player.play(prizePool);
//		}else if(playerChoice == "B") {
//			player.sell();
//		}else if(playerChoice == "C") {
//			player.viewPlayerInv();
//		}else if(playerChoice == "D") {
//			player.viewPrizePool();
//		}
//		
//		//close the scanner
//		reader.close();
		
	}

}
