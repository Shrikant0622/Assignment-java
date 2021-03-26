package seleniumpracticeJ;

import java.util.Scanner;

public class ElectricBill {

	public static void main(String[] args) {
		
		String livingtype;
		int noofunits,Bill;
		
		Scanner input=new Scanner(System.in);
				
		System.out.println("Enter the type of living: House, commercial");	
		livingtype = input.nextLine();
		
		System.out.println("Enter the noofunits");
		noofunits = input.nextInt();
			
	
		switch (livingtype) {
			
			case "House":
				if (noofunits <=100) {
					Bill= noofunits*3;
				}else if(noofunits>=100 && noofunits<=200) {
						Bill = noofunits*4;
				}else {
					System.out.println("Units Out of range");
					}
				break;
				
			case "commercial":
				if (noofunits <=100) {
					Bill= noofunits*10;
				}else if(noofunits>=100 && noofunits<=200) {
						Bill = noofunits*20;
				}else {
					System.out.println("Units Out of range");
					}
				break;
			}
			
		}
	}


