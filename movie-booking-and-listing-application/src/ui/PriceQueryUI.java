package ui;

import model.PriceUtil;

public class PriceQueryUI {
	public static void printStartingDisplay() {
		 System.out.println("\n**************************************************************************************************");
	        System.out.print("1. Base Price.\n"
	                + "2. Bronze Cinema Multiplier\n"
	                + "3. Silver Cinema Multiplier\n"
	                + "4. Gold Cinema Multiplier\n"
	                + "5. Blockbuster Multipler\n"
	                + "6. Movie in 3D Multipler"
	                + "7. Weekend Multipler\n"
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
			switch(choice) {
				case 1: 
					System.out.println("Base Price is " + PriceUtil.getBasePrice() +"\n");
					break;
				case 2: 
					System.out.println("Bronze Cinema Multipler is " + PriceUtil.getBronzeCinemaMultipler() +"\n");
					break;
				case 3:
					System.out.println("Silver Cinema Multipler is " + PriceUtil.getSilverCinemaMultipler() +"\n");
					break;
				case 4:
					System.out.println("Gold Cinema Multipler is " + PriceUtil.getGoldCinemaMultipler() +"\n");
					break;
				case 5:
					System.out.println("Blockbuster Multipler is " + PriceUtil.getBlockbusterMultipler() +"\n");
					break;
				case 6:
					System.out.println("Movie in 3D Multipler is " + PriceUtil.getMovie3DMultipler() +"\n");
					break;
				case 7:
					System.out.println("Weekend Multipler is " + PriceUtil.getWeekendMultipler() +"\n");
					break;
				case 8:
					System.out.println("Public Holiday Multipler is " + PriceUtil.getPublicHolidayMultipler()+"\n" );
					break;
				case 9:
					System.out.println("Student Multipler is " + PriceUtil.getStudentMultipler() +"\n");
					break;
				case 10:
					System.out.println("Elderly Multipler is " + PriceUtil.getElderlyMultipler() +"\n");
					break;
				case 11: 
					return;
				default: 
					System.out.println("Soemthing went wrong. Help Please.");
					break;
			}
		}
			
	}
}
