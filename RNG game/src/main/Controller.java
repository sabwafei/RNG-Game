package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		// create an inventory of randomized items:
		// prizePool arrayList will hold items
		ArrayList<Item> prizePool = new ArrayList<Item>();

		// populate and add items to "prizePool"
		for (int i = 0; i <= 4; i++) {
			Item item = new Item();
			prizePool.add(item);
		}

		// create an instance of the player object
		Player player = new Player();

		// create scanner for player input
		Scanner reader = new Scanner(System.in);

		char playerChoice;
		do {

//			prompt user with game choices
			System.out.println("Please select one of the following:");
			System.out.println("A- Play| B-Sell| C-View Inventory| D-View Prize Pool| E-exit application");

//			get player input and run corresponding method
			playerChoice = reader.next().charAt(0);

			// player methods:
//			A-play: uses point to purchase a random item in the prizePool
//			B-Sell: sell an item in the player inventory to add point to the player point total
//			C-View Inventory: view contents of player inventory
//			D-View Prize Pool: view contents of the prizePool

//			logic for determining which method to run
			if (playerChoice == 'A') {
				player.play(prizePool);
			} else if (playerChoice == 'B') {
				player.sell();
			} else if (playerChoice == 'C') {
				player.viewPlayerInv();
			} else if (playerChoice == 'D') {
				player.viewPrizePool(prizePool);
			} else if (playerChoice == 'E') {
				System.exit(0);
			}

		} while (playerChoice != 'E');

		// close the scanner
		reader.close();

	}

}
