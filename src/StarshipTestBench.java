
public class StarshipTestBench {

	public static void main(String[] args) {

		System.out.print("Starting the testbench for class Starship");

		Starship starship = new Starship("gold", 1998, 85.0, 3456);

		double result = starship.getRemFuel();

		if (result != 85) {
			System.out.println("Problem with getRemFuel");
		}

		starship.setAutoPilot(true);

		boolean result1 = starship.isAutoPilot();

		if (!result1) {
			System.out.println("Problem with setAutoPilot");
		}
        starship.calculateDistanceToBeTraveled(100, 200);

        double result2 = starship.getTotalDistanceTraveled();

        if (result2 != 100.0) {
            System.out.println("Problem with calculateDistanceToBeTraveled");
        }
        starship.setVelocity(50); // Assuming velocity is 50 m/s

        double result3 = starship.calculateETA();

        if (result3 != 2.0) {
            System.out.println("Problem with calculateETA");
        }
    }
}
