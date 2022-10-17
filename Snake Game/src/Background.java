import java.util.Set;

public class Background {
	/*
	 * ===== Fields =====
	 */
	// Class Variables
	public static int minTotalOrbsScore; // Minimum score you should get if you ate all the current existing orbs
	public static int minNumOfSnakes; // Minimum number of snake players we want in the game
	// Instance Variables
	public Set<Orb> setOfOrbs; // Set containing all the orbs currently in the game
	public Set<Snake> setOfSnakes; // Set containing all snakes currently in the game
	public String colour; // May change to some image link later
	
	
	/*
	 * ===== Constructor =====
	 */
	public Background() {
		// TODO Auto-generated constructor stub
	}
	
	
	/*
	 * ===== Other Methods =====
	 */
	public void generateOrbs() {
		/*
		 * Generates orbs so that the <minTotalOrbsScore> requirement is met, or slightly
		 * exceeded.
		 */
	}
	public void generateSnakes() {
		/*
		 * Generate enough snakes so that the <minNumOfSnakes> requirement is met, or
		 * slightly exceeded.
		 */
	}
	public void checkTotalOrbsScoreAmount() {
		/*
		 * Checks if the orbs in <setOfOrbs> has a total score >= <minTotalOrbsScore>.
		 * If the total score is less than the minimum required, this method will call
		 * the <generateOrbs> method to create enough orbs until the requirement is met.
		 */
	}
	public void checkTotalNumOfSnakes() {
		/*
		 * Checks if the number of snakes in <setOfSnakes> is >= <minNumOfSnakes>.
		 * If not, then call the <generateSnakes> method to create more snakes.
		 */
	}
}
