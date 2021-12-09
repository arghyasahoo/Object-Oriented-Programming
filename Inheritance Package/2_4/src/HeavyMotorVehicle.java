class HeavyMotorVehicle extends Vehicle {
	private int capacityInTons;

	public HeavyMotorVehicle(String companyName, int price, int capacityInTons) {
		super(companyName, price);
		this.capacityInTons = capacityInTons;
	}

	public int getCapacity() {
		return capacityInTons;
	}

	public String toString() {
		return super.toString("Heavy Motor Vehicle") + "\nCapacity: " + this.capacityInTons;
	}
}