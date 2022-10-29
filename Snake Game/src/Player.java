
public class Player {
	/* TODO:
	 * 1. Might need to move the <score> variable to the <Snake> class, or might have to remove <score> from the <Snake> class
	 *    and instead use the score from the <Player> object to inform the <length> field of the <Snake> object. The <defaultScore>
	 *    field makes sense in the <Snake> class, so I'm not sure if the change will be necessary.
	 * 2. Add a parameter for choice of snake skin in the constructor and in the <Snake> class.
	 */
	
	
	/*
	 * ===== Fields =====
	 */
	// Instance variables
	public Snake snake; // snake object
	public int score; // total score (might be redundant since snake already has this field)
	
	
	/*
	 * ===== Constructor =====
	 */
	public Player() {
		/*
		 * Generate <Snake> object and set <score>.
		 */
		this.snake = new Snake(); // Creates a default snake object
		this.score = Snake.defaultScore; // The initial score is the default score
	}

}
