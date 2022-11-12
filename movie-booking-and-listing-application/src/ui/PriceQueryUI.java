package ui;

import model.PriceUtil;

/**
 * Serves as UI Menu for admin to change the ticket price.
 */
public class PriceQueryUI {
	public static void printStartingDisplay() {
		 System.out.println("\n**************************************************************************************************");
	        System.out.print("1. Base Price.\n"
	                + "2. Bronze Cinema Multiplier\n"
	                + "3. Silver Cinema Multiplier\n"
	                + "4. Gold Cinema Multiplier\n"
	                + "5. Blockbuster Multiplier\n"
	                + "6. Movie in 3D Multiplier"
	                + "7. Weekend Multiplier\n"
	                + "8. Public Holiday Multiplier\n"
	                + "9. Student Multiplier\n"
	                + "10. Elderly Multiplier\n"
	                + "11. Exit\n");
	        System.out.println("**************************************************************************************************\n");
	        //System.out.println("**************************************************************************************************");
	}
	
	public static void display() {
		int choice;
		printStartingDisplay();
		while(true) {
			choice = CheckUserInput.loopUntilValidInt("Please choose an option from the menu: " , 1, 11);
			System.out.println("");
			switch(choice) {
				case 1: 
					System.out.println("Base Price is " + PriceUtil.getBasePrice() +"\n");
					break;
				case 2: 
					System.out.println("Bronze Cinema Multiplier is " + PriceUtil.getBronzeCinemaMultiplier() +"\n");
					break;
				case 3:
					System.out.println("Silver Cinema Multiplier is " + PriceUtil.getSilverCinemaMultiplier() +"\n");
					break;
				case 4:
					System.out.println("Gold Cinema Multiplier is " + PriceUtil.getGoldCinemaMultiplier() +"\n");
					break;
				case 5:
					System.out.println("Blockbuster Multiplier is " + PriceUtil.getBlockbusterMultiplier() +"\n");
					break;
				case 6:
					System.out.println("Movie in 3D Multiplier is " + PriceUtil.getMovie3DMultiplier() +"\n");
					break;
				case 7:
					System.out.println("Weekend Multiplier is " + PriceUtil.getWeekendMultiplier() +"\n");
					break;
				case 8:
					System.out.println("Public Holiday Multiplier is " + PriceUtil.getPublicHolidayMultiplier()+"\n" );
					break;
				case 9:
					System.out.println("Student Multiplier is " + PriceUtil.getStudentMultiplier() +"\n");
					break;
				case 10:
					System.out.println("Elderly Multiplier is " + PriceUtil.getElderlyMultiplier() +"\n");
					break;
				case 11: 
					return;
				default: 
					System.out.println("Something went wrong. Help Please.");
					break;
			}
		}
			
	}
}
