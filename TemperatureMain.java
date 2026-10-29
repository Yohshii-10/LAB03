package LAB03;
import java.util.ArrayList;
import java.util.Scanner;

public class TemperatureMain { 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<City> cities = new ArrayList<>();


		System.out.print("Enter number of cities (N): ");
		int n = input.nextInt();
		input.nextLine(); 

		for (int i = 0; i < n; i++) {
			System.out.println("\n--- City " + (i + 1) + " ---");
			System.out.print("City name           : ");
			String name = input.nextLine();
			System.out.print("Temperature (Celsius): ");
			double celsius = input.nextDouble();
			input.nextLine(); 

			cities.add(new City(name, celsius));
		}

		
		System.out.println("\n===== TEMPERATURE RESULTS =====");
		for (City city : cities) {
			city.display();
		}

		input.close();
	}
}


