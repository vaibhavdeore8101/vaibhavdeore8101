package car_dekho.main;

import java.util.Scanner;

import car_dekho.operation.CarOperation;

public class CarDekhoMenu {
	
	private static CarOperation operation=new CarOperation();
	
	private static boolean loop=true;
	public static void main(String[] args) {
		
		while(loop) {
			CarDekhoMenu();
		}
	}
	private static void CarDekhoMenu() {
		System.out.println("=====MENU====\n"+"1.Add/Remove Car Details \n"
											+"2.Search Car Details\n"
											+"3.Edit Car Details\n"
											+"4.Exit");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice");
		int choice1=sc.nextInt();
		switch(choice1) {
		case 1:
			System.out.println("====Menu===\n"+"1.Add Car Details \n"
											+"2.Remove Car Details \n"
											+"3.Go Back To Main Menu\n");
			System.out.println("Enter Your Choice");
			int choice2=sc.nextInt();
			switch(choice2) {
			case 1:operation.AddCarDetails();
					break;
					
			case 2:operation.RemoveCarDetails();
                    break;
                    
			case 3:CarDekhoMenu();
                    break;
                    
            default:
            	System.out.println("\n Invalid Choice....Try Again...!!");
            	break;
			}
			break;
			
		case 2:
			System.out.println("=====MENU=====\n"+"1.Search Car By Name\n"
												 +"2.Search Car By Brand\n"
												 +"3.Search Car By Price\n"
												 +"4.Search Car By Fuel_Type\n"
												 +"5.Go Back To Main Menu");
			System.out.println("Enter Your Choice");
			int choice3=sc.nextInt();
			switch(choice3) {
			case 1:operation.SearchCarByName();
				   break;
				   
			case 2:operation.SearchByBrand();
				   break;
			
			case 3:operation.SearchByPrice();
			       break;
			       
			case 4:operation.SearchByFuelType();
			       break;
			       
			case 5:CarDekhoMenu();
			       break;
			       
			default:
				System.out.println("\n Invalid Choice....Try Again...!!");       
				break;
			}
			
		case 3:
			operation.EditCarDetails();
			break;
			
		case 4:
			System.out.println("Thank You..!!");
			loop=false;
			sc.close();
			break;
			
		default:
			System.out.println("\n Invalid Choice.Try Again...!!");
			break;
		}
		
	}
	
	

}
