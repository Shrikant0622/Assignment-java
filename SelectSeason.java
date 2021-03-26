package seleniumpracticeJ;


import java.util.Scanner;

public class SelectSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter month number :");
		month= input.nextInt();
		
		switch(month) {
		
		case 1: case 2: case 3: case 4:
			System.out.println("This is Summer season");
			
			break;
			
		case 5: case 6: case 7: case 8:
			System.out.println("This is Winter season");
			
			break;
			
		case 9: case 10: case 11: case 12:
			System.out.println("This is raniny season");
			
			break;
		}
	}

}
