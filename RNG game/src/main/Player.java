//Created by: Christopher Smith
//Player class defines the user playing the RNG game. Class contains the attributes
//		Points	 
//		Ticket Invetory
//		Item Inventory

package main;

import java.util.ArrayList;

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
			this.points = -(points - 10);
			//randomly select and item from the prizePool
			int min = 0;
			int max = prizePool.size();
			int randomNumber = (int) (Math.random() * (max - min + 1) + min);
			prizePool.get(randomNumber);
			
			//add selected item to player inventory
			//create a stream from prizePool
			Item c = prizePool.stream()
					//searching for item that has an "id" of 1
					.filter(x -> x.id == 1)
					//returns an optional
					.findFirst()
					//take the object with the matching ID 
					.get();
			//add selected prizePoolitem to playerInventory
			playerInventory.add(c);
			System.out.println("Item Added!");
			
		}
	}

	public void sell() {

	}

	public void viewPlayerInv() {
		// TODO Auto-generated method stub

	}

	public void viewPrizePool() {
		// TODO Auto-generated method stub

	}
	
	public ArrayList<Item> getPlayerInventory1() {
		return this.playerInventory;
	}

}