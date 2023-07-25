// An example of recursion that solve the towers of Hanoi problem.
// We simply use number to represent a disc (according to width)

public class Hanoi {
	public static int[][] pegs = new int[3][];
	
	public static void moveDiscs(int n, int[] fromPeg, int[] toPeg, int[] bufferPeg) throws InterruptedException {
		if (n <= 0) // Base case: No disc to be moved
			return ;

		// Solve the subproblem, move the top n-1 discs of fromPeg to bufferPeg
		moveDiscs(n-1, fromPeg, bufferPeg, toPeg);
		
		// Move the largest disc of the current problem to toPeg
		boolean moved = false;
		for (int j = 0; j < toPeg.length && !moved; j++)
			if (toPeg[j] == 0) {
				int topIndex = getTopIndex(fromPeg);
				toPeg[j] = fromPeg[topIndex];
				fromPeg[topIndex] = 0;
				moved = true;
			}
		printPegs();
		// move the discs in the bufferPeg to toPeg
		moveDiscs(n-1, bufferPeg, toPeg, fromPeg);
	}
	
	// Get the index of the disc on top of a peg
	public static int getTopIndex(int[] peg) {
		for (int i = peg.length-1; i >= 0; i--)
			if (peg[i] != 0)
				return i;
		return 0;
	}
	
	// Print the current pegs status.
	// Sleep for 1 second after printing
	public static void printPegs() throws InterruptedException {
		int numDiscs = pegs[0].length;
		
		for (int j = numDiscs-1; j >= 0; j--) {
			for (int i = 0; i < 3; i++)
				if (pegs[i][j] != 0)
					System.out.printf("%4s%d%4s"," ",pegs[i][j]," ");
				else
					System.out.printf("%4s%s%4s"," "," "," ");
			System.out.println();
		}
		for (int i = 0; i < 3; i++)
			System.out.printf("%2s%s%2s", " ", "Peg " + (i+1), " ");
		System.out.println();
		System.out.println();
		Thread.sleep(1000);
	}
	
	public static void main(String[] args) throws InterruptedException {
		int numDiscs = 4;
		
		// create the three peg arrays
		for (int i = 0; i < 3; i++)
			pegs[i] = new int[numDiscs];
		
		// set discs to peg 1
		for (int i = 0;  i < numDiscs; i++)
			pegs[0][i] = numDiscs - i;
		
		// Call move discus to solve the problem, i.e. move all discs from peg 0 to peg 2 with peg 1 as buffer
		printPegs();
		moveDiscs(numDiscs, pegs[0], pegs[2], pegs[1]);
	}
}