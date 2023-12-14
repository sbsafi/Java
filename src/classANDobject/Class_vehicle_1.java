package classANDobject;

public class Class_vehicle_1 {

	String model;
	String make;
	double price;
	String color;
	String licensePlate;

	public Class_vehicle_1() {

		model = "";
		make = "";
		price = 0;
		color = "";
		licensePlate = "";
	}

	public Class_vehicle_1(String mod, String makee, double pricee, String colour, String licenseplate) {
		model = mod;
		make = makee;
		price = pricee;
		color = colour;
		licensePlate = licenseplate;

	}

	public String toString() {
		return "Model: " + model + ", Make:" + make + ", Price: " + price;
	}
}
