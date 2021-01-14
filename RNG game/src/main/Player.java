//Created by: Christopher Smith
//Player class defines the user playing the RNG game. Class contains the attributes
//		Points	 
//		Ticket Invetory
//		Item Inventory

package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
	// player attributes are
	private int points = 100; // base points for player class
	// player inventory
	private ArrayList<Item> playerInventory = new ArrayList<Item>();

	// getters and setters
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public ArrayList<Item> getPlayerInventory() {
		return playerInventory;
	}

	public void setPlayerInventory(ArrayList<Item> playerInventory) {
		this.playerInventory = playerInventory;
	}

	// PLAYER method "play" purchases a randomly selected item in the prizePool.
	// "points are used each time "PLAY" is called. the selected
	// item is then added to the player inventory while the prizePool is replaced
	// with a null item
	public void play(ArrayList<Item> prizePool) {
		// check player point balance
		if (this.points < 10) {
			System.out.println("You do not have enough points to play.");
		} else {
			// subtract play amount from point total
			this.points = points - 10;
			// randomly select an item from the prizePool
			int min = 0;
			int max = 4;
			int randomNumber = (int) (Math.random() * (max - min + 1) + min);

			// add selected item to player inventory
			Item itemToAdd = prizePool.get(randomNumber);
			// assign a unique code to item so it can be accessed later
			itemToAdd.id = itemToAdd.createId();

			playerInventory.add(itemToAdd);
			System.out.println("Item Added!");

		}
	}

//	Sell method will remove an item in the player inventory and add the items sell price to the players point total.
//	Will return a prompt if player has no items in inventory or if player has an insufficient point balance. 
	public void sell() {
		// check if player has any items in playerInventory to sell
		if (playerInventory == null) {
			System.out.println("You have no items to sell");
			// check if player has enough points
		} else if (this.points < 10) {
			System.out.println("insufficient Points");

			// if conditions are met select item to sell
		} else if (playerInventory != null && this.points > 10) {
			System.out.println("Choose Which Inventory Item to sell(Input item code):");
			System.out.println(playerInventory);
			System.out.println(getPoints());


			// get player input
			Scanner reader = new Scanner(System.in);
			String userChoice = reader.nextLine();

			// search player inventory and find matching code
			for (int i = 0; i < playerInventory.size();) {
				System.out.println(userChoice);
				if (playerInventory.get(i).id.contains(userChoice)) {

					// if found add sell price of item to player inventory
					addPoints(playerInventory.get(i).price);
					
					// remove selected item from player inventory
					playerInventory.remove(i);
					
					//close the scanner
					reader.close();

					//exit loop
					break;
				}else {
					System.out.println("Your inventory does not contain that item.");
					reader.close();

					break;
					
				}		
			}

		}

	}

	private void addPoints(int newPrice) {
		// add sold item price to player point total
		this.points = newPrice + this.points;

	}

	public void viewPlayerInv() {
		System.out.println(playerInventory);

	}

	public void viewPrizePool(ArrayList<Item> prizePool) {
		System.out.println(prizePool);
	}

}