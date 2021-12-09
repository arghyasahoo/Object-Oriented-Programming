class LightMotorVehicle extends Vehicle {
	private int mileage = 0;

	public LightMotorVehicle(String companyName, int price, int mileage) {
		super(companyName, price);
		this.mileage = mileage;
	}

	public int getMileage() {
		return mileage;
	}

	public String toString() {
		return super.toString("Light Motor Vehicle") + "\nMileage: " + this.getMileage() + '\n';
	}
}