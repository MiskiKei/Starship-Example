import java.util.Random;

public class Starship {
	static Random randGen = new Random();

	public String Material = "Steel"; // These are initialized
	public int Years = 1999;
	private double RemFuel = 100;
	private long Pos = 789012893;
	

	public Starship(String inputMat, int inputYear, double inputRemFuel, long inputPos) { // This is a constructor
		Material = inputMat;
		if (inputYear > 1999 && inputYear < 2900) {
			Years = inputYear;
		} else
			Years = 1999;
		RemFuel = inputRemFuel;
		Pos = inputPos;
	}

	public Starship(String inputMat) { // Second constructor
		Material = inputMat;
	}

	// sets the remaining fuel after checking current fuel and fuel consumption rate
	  public void setRemFuel(double inputFuel, double fuelConsumptionRate) {
	        if (inputFuel > 0) {
	            RemFuel = inputFuel - (fuelConsumptionRate * randGen.nextDouble());
	        } else {
	            System.out.println("Wrong input - must be greater than zero");
	        }
	    }

	public void setPos(long inputPos) {
		if (inputPos > 0) {
			Pos = inputPos;
		} else {
			System.out.println("Wrong input - must be greater than zero");
		}
	}

	// returns the remaining fuel
	public double getRemFuel() {

		return RemFuel;
	}

	// returns the position in space
	public long getPos() {

		return Pos;
	}

} 
