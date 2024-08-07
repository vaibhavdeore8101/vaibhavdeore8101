package car_dekho.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import car_dekho.entity.Car;

public class CarOperation {
	
	private static List<Car> Cars=new ArrayList<Car>();
	
	Scanner sc=new Scanner(System.in);
	
	
	public static void getAllCarDetails() {
		if(Cars.isEmpty()) {
			System.out.println("No Car Details Is Found");
		}
		else {
			System.out.println("Total Car Details:"+Cars.size());
			System.out.println("ID\t"+"Name\t"+"Brand\t"+"FuelType\t"+"Price");
			System.out.println("===============");
			for(Car Car:Cars) {
				System.out.println(Car.getCar_id()+"\t"+Car.getName()+"\t"+Car.getBrand()+"\t"+Car.getFuel_type()+"\t"+Car.getPrice());
				
			}
		}
	}

	public static void AddCarDetails() {
		System.out.println("How Many Cars To Add...?");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			Car car=new Car();
			System.out.println("Enter Car Id");
			car.setCar_id(sc.nextInt());
			System.out.println("Enter Car Name");
			car.setName(sc.next());
			System.out.println("Enter Car Brand");
			car.setBrand(sc.next());
			System.out.println("Enter Car Fuel Type");
			car.setFuel_type(sc.next());
			System.out.println("Enter Car Price");
			car.setPrice(sc.nextDouble());
			Cars.add(car);
			System.out.println("\n "+car.getName()+" Car Added");
		}
		getAllCarDetails();
	}
	
	public void RemoveCarDetails() {
		getAllCarDetails();
	
		if(Cars.isEmpty()==false) {
			Car car1=null;
			System.out.println("\n Enter Car Id To Remove");
			int choice=sc.nextInt();
			for(Car car:Cars) {
				if(car.getCar_id()==choice) {
					car1=car;
				}
				if(car1 !=null) {
					Cars.remove(car1);
					System.out.println(car1.getName()+"Removed...!");
				}
				else {
					System.out.println("Invalid Choice.Try Again.....!");
				}
			}
		}
		
		}
	public void EditCarDetails() {
		getAllCarDetails();
		if(Cars.isEmpty()==false) {
			System.out.println("Enter Car id to update");
			int id=sc.nextInt();
			for(Car car:Cars) {
				if(car.getCar_id()==id) {
					System.out.println("Enter New Car Name :");
					car.setName(sc.next());
					System.out.println("Enter New Car Brand :");
					car.setBrand(sc.next());
					System.out.println("Enter New Car Fuel Type :");
					car.setFuel_type(sc.next());
					System.out.println("Enter New Car Price :");
					car.setPrice(sc.nextDouble());
					System.out.println("Car Details Updated....!!");
				}
			}
		}
	}

	
	public void SearchByBrand() {
		if(Cars.isEmpty()) {
			System.out.println("No Cars Are Available To Search..");
		}
		else {
			System.out.println("Enter The Car Brand To Search :");
			String name=sc.next();
			List<Car> AllCars=new ArrayList<Car>();
			for(Car car:Cars) {
				if(car.getBrand().equalsIgnoreCase(name)) {
					AllCars.add(car);
				}
			}
			System.out.println("Total Car Details"+AllCars.size());
			System.out.println("ID\t"+"Name\t"+"Brand\t"+"Fuel Type\t"+"Price");
			System.out.println("=========");
			for(Car car:Cars) {
				System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getBrand()+"\t"+car.getFuel_type()+"\t"+car.getPrice());
			}
		}
		
	}

	public void SearchByPrice() {
		if(Cars.isEmpty()) {
			System.out.println("No Cars Are Available To Search..");
		}
		else {
			System.out.println("Enter The Car price To Search :");
			Double name=sc.nextDouble();
			List<Car> AllCars=new ArrayList<Car>();
			for(Car car:Cars) {
				if(car.getPrice()==name) {
					AllCars.add(car);
				}
			}
			System.out.println("Total Car Details"+AllCars.size());
			System.out.println("ID\t"+"Name\t"+"Brand\t"+"Fuel Type\t"+"Price");
			System.out.println("=========");
			for(Car car:Cars) {
				System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getBrand()+"\t"+car.getFuel_type()+"\t"+car.getPrice());
			}
		}
		
	}

	public void SearchByFuelType() {
		if(Cars.isEmpty()) {
			System.out.println("No Cars Are Available To Search..");
		}
		else {
			System.out.println("Enter The Fuel Type To Search :");
			String name=sc.next();
			List<Car> AllCars=new ArrayList<Car>();
			for(Car car:Cars) {
				if(car.getFuel_type().equalsIgnoreCase(name)) {
					AllCars.add(car);
				}
			}
			System.out.println("Total Car Details"+AllCars.size());
			System.out.println("ID\t"+"Name\t"+"Brand\t"+"Fuel Type\t"+"Price");
			System.out.println("=========");
			for(Car car:Cars) {
				System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getBrand()+"\t"+car.getFuel_type()+"\t"+car.getPrice());
			}
		}
		
	}

	public void SearchCarByName() {
		if(Cars.isEmpty()) {
			System.out.println("No Cars Are Available To Search..");
		}
		else {
			System.out.println("Enter The Car Name To Search :");
			String name=sc.next();
			List<Car> AllCars=new ArrayList<Car>();
			for(Car car:Cars) {
				if(car.getName().equalsIgnoreCase(name)) {
					AllCars.add(car);
				}
			}
			System.out.println("Total Car Details"+AllCars.size());
			System.out.println("ID\t"+"Name\t"+"Brand\t"+"Fuel Type\t"+"Price");
			System.out.println("=========");
			for(Car car:Cars) {
				System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getBrand()+"\t"+car.getFuel_type()+"\t"+car.getPrice());
			}
		}
		
	}
	
}
