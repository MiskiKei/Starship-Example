import java.util.Scanner;

public class StarshipGame {
	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter the material of the starship: ");
		String material = scnr.nextLine();

		System.out.print("Enter the manufacturing year of the starship: ");
		int year = scnr.nextInt();

		System.out.print("Enter the remaining fuel of the starship: ");
		double fuel = scnr.nextDouble();

		System.out.print("Enter the position of the starship: ");
		long position = scnr.nextLong();

		Starship starship = new Starship(material, year, fuel, position);

		System.out.println();

		System.out.println("Starship created successfully!");
		System.out.println("Material: " + starship.Material);
		System.out.println("Year: " + starship.Years);
		System.out.println("Remaining Fuel: " + starship.getRemFuel());
		System.out.println("Position: " + starship.getPos());

		System.out.println();
		
        
        System.out.print("Enter the fuel consumption rate: ");
        double consumptionRate = scnr.nextDouble();
        
        starship.setRemFuel(fuel, consumptionRate);
        double formattedRemFuel = Math.round(starship.getRemFuel() * 100.0) / 100.0;
        System.out.println("Updated Remaining Fuel: " + String.format("%.2f", formattedRemFuel));
        
        System.out.println();
        
        System.out.print("Enter the new velocity: ");
        double velocity = scnr.nextDouble();
        starship.setVelocity(velocity);
        double formattedVelocity = Math.round(starship.getVelocity() * 100.0) / 100.0;
        System.out.printf("Velocity: %.2f%n", formattedVelocity);
        
        System.out.println();
        
        System.out.print("Enter the destination coordinates (x, y): ");
        double destX = scnr.nextDouble();
        double destY = scnr.nextDouble();
        starship.setDestination(destX, destY);
        double[] destination = starship.getDestination();
        System.out.println("Destination: (" + destination[0] + ", " + destination[1] + ")");
        
        System.out.println();

		System.out.println("All systems in check, we are ready for linked battle!");

	}

}
