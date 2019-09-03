package exercises;

public class _1_SpiceWorld {
	/*
	 * Replace the anonymous inner class with a lambda expression.
	 */

	public static void main(String[] args) {
		SpiceGirl sporty = new SpiceGirl() {
			
			@Override
			public void perform() {
				System.out.println("Do backflips.");
				
			}
		};
		sporty.perform();
	}
}

interface SpiceGirl {
	void perform();
}
