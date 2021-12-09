public class Vehicle {
	private int id;
	static int autoIncr = 100001;
	private String companyName;
	private int price;

	public Vehicle(String companyName, int price) {
		this.id = autoIncr;
		autoIncr++;
		this.companyName = companyName;
		this.price = price;
	}

	public String toString(String vType) {
		return "VehicleType: " + vType + "\nVehicle ID: " + this.id + "\nCompany name: " + this.companyName + "\nPrice: " + this.price;
	}
}