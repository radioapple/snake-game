import java.util.ArrayList;

public class Snake {
	/*
	 * ===== Fields =====
	 */
	// CLass variables
	public static double defaultSpeed;
	public static double defaultDoubleSpeed;
	// Instance variables
	public double width;
	public double length;
	public int score;
	public double direction; // in degrees
	public double speed; // need to define unit of time and space for this, also static because all snakes have same speed
	public ArrayList<ArrayList<Double>> bodyLocation;
	// public someImageType snakeSkin;
	
	
	/*
	 * ===== Constructor =====
	 */
	public Snake() {
		// TODO Auto-generated constructor stub
	}
	
	
	/*
	 * ===== Other Methods =====
	 */
	public void turn() { // Need to take in mouse data as input
		// Need to then take that input and change the direction field
	}
	public void eat(Orb orb) { // This should be called by the sense method somehow, and fed the orb object
		/*
		 * Takes in the <Orb> object that was sensed and "eats" it by adding the orb's stored score into the
		 * snake's score <score>, and then destroys all references to the <Orb> object.
		 */
		score += orb.score; // may switch fields to private later so may need to use getter method later
		orb.delete(); // delete orb now that it's been absorbed
	}
	public void doubleSpeed() {
		/*
		 * Changes this snake object's speed to twice the default speed.
		 * At double speed, the snake will have to use up some of its
		 * existing score as fuel, and some of that score will have to
		 * be excreted into orbs (orb size and frequency of emission to be
		 * determined later).
		 */
		
	}
	public void sense() {
		/*
		 * This method is to be used to sense orbs and other snakes. It will call
		 * the <eat> or <die> methods depending on whether this snake object ran into
		 * another orb or another snake.
		 */
		
	}
	public void draw() {
		/*
		 * Draws the snake. Will come back to this method later.
		 */
	}
	public void die() {
		/*
		 * Kill the snake by deleting its reference from <Background>'s snake list.
		 * 
		 * If the current snake object is the main player's snake, need to also end
		 * the game, otherwise, keep the game going.
		 * 
		 * If the snake dies, it needs to turn into a set of orbs in the last known
		 * shape of the snake, with the orbs total score being equal to the snake's
		 * last known score.
		 */
	}

}
