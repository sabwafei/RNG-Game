package main;

public class Item {
	// item class attributes
	private String itemName;
	private String itemDesc;
	int price; // price == "points"
	int rarityCode; // 0-common, 1-uncommon, 2-rare, 3-legendary, 4-exotic
	private String rarityName; // 0-common, 1-uncommon, 2-rare, 3-legendary, 4-exotic
	
	// "id" used to move arrayList element(inventory item) between inventories(player and prizePool)
	public int id;

	// Default constructor randomizes ITEM attributes to create item with simple
	// attributes
	public Item() {
		// simple attributes
		String[] simpleNames = { "Common Item", "Uncommon Item", "Rare Item", "Legendary Item", "Exotic Item" };
		String[] simpleDesc = { "A COMMON item", "An UNCOMMON item", "A RARE item", "A LEGENDARY item",
				" An EXOTIC item " };
		// simple rarity code
		int[] simpleRarity = { 0, 1, 2, 3, 4 };
		// simple rarity name
		String[] simpleRarityName = { " common ", " unommon ", " rare ", " legendary ", " exotic " };

		// RNG to determine which simple data to use
		int min = 0;
		int max = 4;
		int randomNumber = (int) (Math.random() * (max - min + 1) + min);

		// assign random attribute data to ITEM attribute data
		if (randomNumber == 0) {
			this.itemName = simpleNames[0];
			this.itemDesc = simpleDesc[0];
			this.rarityCode = simpleRarity[0];
			this.rarityName = simpleRarityName[0];
			this.price = 10;

		} else if (randomNumber == 1) {
			this.itemName = simpleNames[1];
			this.itemDesc = simpleDesc[1];
			this.rarityCode = simpleRarity[1];
			this.rarityName = simpleRarityName[1];
			this.price = 20;

		} else if (randomNumber == 2) {
			this.itemName = simpleNames[2];
			this.itemDesc = simpleDesc[2];
			this.rarityCode = simpleRarity[2];
			this.rarityName = simpleRarityName[2];
			this.price = 30;

		} else if (randomNumber == 3) {
			this.itemName = simpleNames[3];
			this.itemDesc = simpleDesc[3];
			this.rarityCode = simpleRarity[3];
			this.rarityName = simpleRarityName[3];
			this.price = 40;

		} else if (randomNumber == 4) {
			this.itemName = simpleNames[4];
			this.itemDesc = simpleDesc[4];
			this.rarityCode = simpleRarity[4];
			this.rarityName = simpleRarityName[4];
			// Exotic items will have a unique price
			this.price = 100;
		}

	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getRarityName() {
		return rarityName;
	}

	public void setRarityName(String rarityName) {
		this.rarityName = rarityName;
	}
	
	public void setId(int newId) {
		this.id = newId;
	}

	// toString method used for testing
	public String toString() {
		return "Name: " + this.itemName + "| Description: " + this.itemDesc + "| Price: " + this.price
				+ "| Rarity Level: " + this.rarityName;
	}

}
