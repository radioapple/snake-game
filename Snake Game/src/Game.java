
public class Game {
	/*
	 * ===== Fields =====
	 */
	// Instance Variables
	private Background background; // a <Background> object
	private Player player; // the main <Player> object.
	
	/*
	 * ===== Constructor =====
	 */
	public Game(String background_colour, int minTotalOrbsScore, int minNumOfSnakes) {
		/*
		 * Creates a <Game> object by generating a <Background> object and a <Player> object.
		 */
		this.background = new Background(background_colour, minTotalOrbsScore, minNumOfSnakes); // Creates new background object
		this.player = new Player(); // Creates the main player
		background.generateOrbs(); // generates orbs
		background.generateSnakes(); // generates other snakes
	}
	
	
	/*
	 * ===== Other Methods =====
	 */
	public static void main(String[] args) {
		/*
		 * Create game from here.
		 */
	}
	
}
