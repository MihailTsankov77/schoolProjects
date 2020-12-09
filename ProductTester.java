package Project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductTester {

	private static Scanner in;

	public static void main(String[] args) {
		//create a Scanner object for keyboard input
		in = new Scanner(System.in);
		int maxSize, menuChoice;
		maxSize = getNumProducts(in);
		if(maxSize ==0) {
		//Display a no products message if zero is entered
		System.out.println("No products required!");
		}else{
		Product[] products = new Product[maxSize];
		addToInventory (in, products);
		
		
		
		
		
		
		do {
		menuChoice = getMenuOption(in);
		executeMenuChoice(in, products, menuChoice);
		}while(menuChoice!=0);
		}//endif
		
		
		}//end method main
	
	private static void displayInventory (Product[] products) {
		for(Product product: products)
        	System.out.println(product);
	}
	
	private static void addToInventory(Scanner in, Product [] products) {
		int tempNumber;
		String tempName;
		int tempQty;
		double tempPrice;
		
		 for(int i = 0; i<products.length; i++) {
		in.nextLine();
    	//ask the user to enter the product information
		System.out.print("\n\nPlease enter the product name: ");
		tempName = in.nextLine();
		System.out.print("Please enter the quantity of stock for this product: ");
		tempQty = in.nextInt();
		System.out.print("Please enter the price for this product: ");
		tempPrice = in.nextDouble();
		System.out.print("Please enter the item number: ");
		tempNumber = in.nextInt();
		//create a product object and store it in the products array
		products[i] = new Product(tempNumber, tempName, tempQty, tempPrice);
		 }//endfor
	}
	
	//You may have to clear the input buffer before you ask for any values. 

	private static void addDVDToInventory(Scanner in, Product [] products, int i) {
		int tempNumber;
		String tempName;
		int tempQty;
		double tempPrice;
		int length;
		int  ageRating;
		String studio;
		
		
		in.nextLine();
    	//ask the user to enter the product information
		System.out.print("\n\nPlease enter the product name: ");
		tempName = in.nextLine();
		System.out.print("Please enter the quantity of stock for this product: ");
		tempQty = in.nextInt();
		System.out.print("Please enter the price for this product: ");
		tempPrice = in.nextDouble();
		System.out.print("Please enter the item number: ");
		tempNumber = in.nextInt();
		System.out.print("Please enter the length: ");
		length = in.nextInt();
		System.out.print("Please enter the age Rating: ");
		ageRating = in.nextInt();
		System.out.print("Please enter the film studio: ");
		studio = in.nextLine();
		
		//create a product object and store it in the products array
		products[i] = new DVD(tempNumber, tempName, tempQty, tempPrice, length, ageRating, studio);
	
	}
	
	private static void addCDToInventory(Scanner in, Product [] products, int i) {
		int tempNumber;
		String tempName;
		int tempQty;
		double tempPrice;
		String artist; 
		int numS;
		String label;
		
		 
		in.nextLine();
    	//ask the user to enter the product information
		System.out.print("\n\nPlease enter the product name: ");
		tempName = in.nextLine();
		System.out.print("Please enter the quantity of stock for this product: ");
		tempQty = in.nextInt();
		System.out.print("Please enter the price for this product: ");
		tempPrice = in.nextDouble();
		System.out.print("Please enter the item number: ");
		tempNumber = in.nextInt();
		System.out.print("Please enter artist: ");
		artist = in.nextLine();
		System.out.print("Please enter the number of songs: ");
		numS = in.nextInt();
		System.out.print("Please enter the label: ");
		label = in.nextLine();
		
		
		//create a product object and store it in the products array
			products[i] = new CD(tempNumber, tempName, tempQty, tempPrice, artist, numS, label);
		
	}
	
	
	private static int getNumProducts(Scanner in) {
		
		int maxSize=-1;
		
		//prompt the user until they enter a number >= zero
		do {
			try{
				//display prompt to user		
				System.out.println("Enter the number of products you would like to add.");
				System.out.print("Enter 0 (zero) if you do not wish to add products: ");
				//assume that the user enters a valid 
				maxSize = in.nextInt();	
				if(maxSize<0)
					System.out.println("Incorrect Value entered");
				//endif
			}
			catch(InputMismatchException e) {
				System.out.println("Incorrect data type entered!");
				in.nextLine();
			}
			catch(Exception e){
				System.out.println(e);
				in.nextLine();
			}
		}while(maxSize<0);
		return maxSize;
	}
	 
	private static int getMenuOption (Scanner sc) {
		int choice;
		do {
			System.out.print("1. View Inventory\r\n" + 
					"2. Add Stock\r\n" + 
					"3. Deduct Stock\r\n" + 
					"4. Discontinue Product\r\n" + 
					"0. Exit\r\n" + 
					"Please enter a menu option:");
			choice = sc.nextInt();
		}while(choice<0 || choice>4);
		// try catch
		return choice;
	}
	
	private static int getProductNumber (Scanner sc, Product products[]) {
		int productChoice =-1;
		
		for(int i = 0; i<products.length; i++) {
			System.out.println(i + " :  " + products[i].getName());
		}
		
		do {
			System.out.print("Choose : ");
			productChoice = sc.nextInt();
		}while(productChoice<0 || productChoice>products.length-1);

		return productChoice;
	}
	
	private static void addInventory(Scanner sc, Product products[]) {
		int pruductChoice = getProductNumber(sc, products);
		int updateValue = -1;
		
		do {
			System.out.print("How many products do you want to add?");
			updateValue = sc.nextInt();
		}while(updateValue<0);
		
		products[pruductChoice].addToInventory(updateValue);
		
	}
	
	private static void deductInventory(Scanner sc, Product products[]) {
		int pruductChoice = getProductNumber(sc, products);
		int updateValue = -1;
		
		do {
			System.out.print("How many products do you want to add?");
			updateValue = sc.nextInt();
		}while(updateValue<0);
		
		products[pruductChoice].deductFromInventory(updateValue);
		
	}
	
	private static void discontinueInventory (Scanner sc, Product products[]) {
		int pruductChoice = getProductNumber(sc, products);
		
		products[pruductChoice].setActive(false);
		
	}
	
	private static void executeMenuChoice (Scanner sc, Product products[], int menuChoice) {
		switch(menuChoice) {
			case 1: System.out.println("View Product List");
			displayInventory(products); break;
			
			case 2: System.out.println("Add Stock");
			addInventory(sc, products); break;
			
			case 3: System.out.println("Deduct Stock");
			deductInventory(sc, products); break;
			
			case 4: System.out.println("Discontinue Stock");
			discontinueInventory(sc, products); break;
		}
		
	}
	
	
	

}//end class ProductTaster
