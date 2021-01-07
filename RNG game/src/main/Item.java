package main;

public class Item {
	//item class attributes
	private String itemName;
	private String itemDesc;
	int price;						//price == "points"
	int rarityCode;					//0-common, 1-uncommon, 2-rare, 3-legendary, 4-exotic
	private String rarityName;		//0-common, 1-uncommon, 2-rare, 3-legendary, 4-exotic
	
	//Default constructor randomizes ITEM attributes to create item with simple attributes
	public Item(){
		//simple attributes
		String [] simpleNames = {" Common "," Uncommon ", " Rare ", " Legendary ", " Exotic "};
		String [] simpleDesc = {" A COMMON item "," An UNCOMMON item ", " A RARE item ", " A LEGENDARY item ", " An EXOTIC item "};
		int[] simplePrice = {10,20,30,40,50};
		//simple rarity code
		int[] simpleRarity = {0,1,2,3,4};
		//simple rarity name
		String [] simpleRarityName = {" common "," unommon "," rare "," legendary "," exotic "};
		
		//RNG to determine which simple data to use
		int min = 0;
		int max = 4;
		int randomNumber = (int)(Math.random() * (max - min + 1) + min);
		
		//assign random attribute date to ITEM attribute data
		this.itemName = simpleNames[randomNumber];
		
		//reset randomNumber
		randomNumber = 0;
		
		//repeat process for itemDesc
		randomNumber = (int)(Math.random() * (max - min + 1) + min);
		this.itemDesc = simpleDesc[randomNumber];
		randomNumber = 0;
		
		//repeat process for price
		randomNumber = (int)(Math.random() * (max - min + 1) + min);
		this.price = simplePrice[randomNumber];
		randomNumber = 0;
		
		//repeat process for rarity
		randomNumber = (int)(Math.random() * (max - min + 1) + min);
		this.rarityCode = simpleRarity[randomNumber];
		
		//match rarity code with rarity name
		for(int i = 0; i < simpleRarityName.length; i++) {
			if(i == this.rarityCode) {
				this.rarityName = simpleRarityName[i];
			}
		}
		randomNumber = 0;

	 }
}
