import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter total number of Vehicles: ");
		int n = sc.nextInt();

		HeavyMotorVehicle[] heavyVehicles = new HeavyMotorVehicle[n];
		LightMotorVehicle[] lightVehicles = new LightMotorVehicle[n];

		for (int i=0; i<n; i++) {
			System.out.print("Enter Vehicle type: ");
			String type = sc.next();

			if ( type.equals("light") ) {
				System.out.print("Enter Company name: ");
				String companyName = sc.next();
				System.out.print("Enter Price: ");
				int price = sc.nextInt();
				System.out.print("Enter Capacity: ");
				int mileage = sc.nextInt();

				lightVehicles[i] = new LightMotorVehicle(companyName, price, mileage);
			}
			else if ( type.equals("heavy") ) {
				System.out.print("Enter Company name: ");
				String companyName = sc.next();
				System.out.print("Enter Price: ");
				int price = sc.nextInt();
				System.out.print("Enter Capacity: ");
				int capacityInTons = sc.nextInt();

				heavyVehicles[i] = new HeavyMotorVehicle(companyName, price, capacityInTons);
			}
		}

		System.out.print("\n");
		for (LightMotorVehicle vehicle : lightVehicles) {
			if (vehicle != null)
				System.out.print(vehicle.toString());
		}

		System.out.print("\n");
		for (HeavyMotorVehicle vehicle : heavyVehicles) {
			if (vehicle != null)
				System.out.print(vehicle.toString());
		}
		System.out.print("\n");
	}
}



/* TEST CASE

2 
heavy
Maruti
250000 
8 
light
Alto
100000
4

*/