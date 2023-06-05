
public class StarshipTestBench {

	public static void main(String[] args) {
		
		System.out.print("Starting the testbench for class Starship");
		
		Starship ship1 = new Starship ("gold", 1998, 85.0, 3456);
		
		double result = ship1.getRemFuel();
		
		/*if (result == 85) {
			System.out.println("looks like your function is working");
		}else {
			System.out.println("Problem with getRemFuel");
		} */
		
		if (result != 85) {
			System.out.println("Problem with getRemFuel");
		}
	}
}
