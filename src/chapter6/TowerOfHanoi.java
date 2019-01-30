package chapter6;

/**
 * It takes exponential time.
 * For n discs, number of moves are (2^n)-1
 * Number of moves - [1->1, 2->3, 3->7, 4->15, 5->31...]
 */
public class TowerOfHanoi {
	private static int numOfMoves = 0;
	
	public void move(int numberOfDiscs, char from, char to, char inter) {
		if (numberOfDiscs == 1) {
			System.out.println("Moving disc 1 from " + from + " to " + to);
			numOfMoves++;
		} else {
			move(numberOfDiscs - 1, from, inter, to);
			System.out.println("Moving disc " + numberOfDiscs + " from " + from + " to " + to);
			numOfMoves++;
			move(numberOfDiscs - 1, inter, to, from);
		}
	}
	
	public static void main(String[] args) {
		TowerOfHanoi toh = new TowerOfHanoi();
		toh.move(5, 'A', 'C', 'B');
		System.out.println("Number of moves: " + numOfMoves);
	}
}
