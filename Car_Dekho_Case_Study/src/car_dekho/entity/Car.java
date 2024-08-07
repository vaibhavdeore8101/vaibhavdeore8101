package car_dekho.entity;

public class Car {
	
	private int Car_id;
	private String name;
	private String brand;
	private String Fuel_type;
	private double price;
	public int getCar_id() {
		return Car_id;
	}
	public void setCar_id(int car_id) {
		Car_id = car_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getFuel_type() {
		return Fuel_type;
	}
	public void setFuel_type(String fuel_type) {
		Fuel_type = fuel_type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
