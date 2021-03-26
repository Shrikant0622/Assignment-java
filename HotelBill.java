package seleniumpracticeJ;

import java.util.Scanner;

public class HotelBill {

	public static void main(String[] args) {
		
		int itemno;
		int noplates, Bill;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the item number:");
		itemno = input.nextInt();
		
		System.out.println("Enter the number of plates you need:");
		noplates= input.nextInt();
		
		switch(itemno) {
		
		case 1:
			Bill = noplates*20;
			System.out.println("Total Dosa costs you:" + Bill);
			
			break;
			
		case 2:
			Bill = noplates*10;
			System.out.println("Total idli costs you:" + Bill);
			
			break;
			
		case 3:
			Bill = noplates*30;
			System.out.println("Total Dosa costs you:" + Bill);
			
		}
	}

}
