import java.util.Set;

public class Background {
	/* TODO:
	 * 1. May need to add an upper limit for total orb score and number of snake players.
	 * 2. Need to possibly add a scoreboard object here or in the <Game> class.
	 * 3. Figure out what to do about the "calling methods from within the constructor" issue.
	 *    => I think it would help to just call the method from the <Game> class constructor.
	 * 4. May need to make the class variables final since there's no need to change them throughout the game.
	 */
	
	
	/*
	 * ===== Fields =====
	 */
	// Class Variables
	public static int minTotalOrbsScore; // Lower limit for score you should get if you add up the scores of the orbs in <setOfOrbs> at any point in time
	public static int minNumOfSnakes; // Lower limit number of snake players that should be in the game at any given time
	public static String background_colour; // May change to some image link later
	// Instance Variables
	public Set<Orb> setOfOrbs; // Set containing all the orbs currently in the game
	public Set<Snake> setOfSnakes; // Set containing all snakes currently in the game
	
	
	/*
	 * ===== Constructor =====
	 */
	public Background(String background_colour, int minTotalOrbsScore, int minNumOfSnakes) {
		/*
		 * Generates the background, a random number of orbs whose score will add up to at least <minTotalOrbsScore>, and
		 * at least <minNumOfSnakes> number of <Snake> objects.
		 */
		
		// --- Set class variables ---
		Background.background_colour = background_colour;
		Background.minTotalOrbsScore = minTotalOrbsScore;
		Background.minNumOfSnakes = minNumOfSnakes;
		
		// --- Generate orbs and snakes ---
		// Generally considered bad practice to call instance methods from within the constructor. Need to consider whether
		// to make the following methods private or static or if I should move them into the <Game> class instead, or if there's
		// another solution entirely.
		// generateOrbs();
		// generateSnakes();
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
