import java.util.ArrayList;

public class Orb {
	/* 
	 * ===== Fields ======
	 */
	public int score;
	public double radius; // Should create a set of possible sizes somewhere
	public String colour;
	public ArrayList<ArrayList<Double>> location;
	
	
	/*
	 * ===== Constructor =====
	 */
	public Orb() {
		/*
		 * Generate an orb with any random score amount (within the default specified limits).
		 */
	}
	
	public Orb(int score) {
		/*
		 * Generate an orb with the exact score specified by <score>.
		 */
	}
	
	
	/*
	 * ===== Other Methods =====
	 */
	public void delete() { // May change return tyoe later to make the code more intuitive
		// Destroy the current orb somehow/Delete all references to the current orb object.
	}
	
}
