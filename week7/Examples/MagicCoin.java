import java.util.Random;

public class MagicCoin {
	// The probability that a head on top.
	// -1 indicates the probability is not initialized
	private double probabilityOfHead = -1;
	// A constant for the default probability of head.
	private final double defaultProbOfHead = 0.5;
	
	// Set the probability of head
	public void setProbabilityOfHead(double p) {
		if (p < 0 || p > 1) {
			System.out.println("Invalid probability");
		} else {
			probabilityOfHead = p;
		}
	}

	// Get the probability of head. 
	// If the probability is not set, prompt a message that 
	// the default probability is returned.
	public double getProbabilityOfHead() {
		if (probabilityOfHead == -1) {
			System.out.println("The default probability (" + defaultProbOfHead + ") is used.");
			return defaultProbOfHead;
		}
		return probabilityOfHead;
	}
	
	// Toss the magic coin
	// Return true for head, false for tail.
	public boolean toss() {
		Random rand = new Random();
		return rand.nextDouble() < getProbabilityOfHead();
	}
	
	
	// This main method is for testing purpose.
	// It is not necessary for this class.
	// Uncomment it for testing the class.
	
	public static void main(String[] args) {
		MagicCoin coin = new MagicCoin();
		System.out.println("---- First toss ----");
		if (coin.toss())
			System.out.println("Head on top");
		else
			System.out.println("Tail on top");
		
		coin.setProbabilityOfHead(0.95);
		System.out.println("---- Second toss ----");
		if (coin.toss())
			System.out.println("Head on top");
		else
			System.out.println("Tail on top");		
		
	}
	
}
