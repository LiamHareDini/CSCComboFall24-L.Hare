import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MiniProjects {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		// N Bottles of Beer
		System.out.print("Enter the number of bottles to begin with: ");
		int numBottles = scnr.nextInt();
		System.out.println();
		
		for (int i = numBottles; i >= 0; i--) {
			if (i == 1) {
			System.out.println(i + " bottle of beer on the wall, " + i 
					+ " bottle of beer. \nTake one down and pass it around, 0 bottles of beer on the wall.");
			}
			else if (i == 0) {
				System.out.println(i + " bottles of beer on the wall, " + i 
						+ " bottles of beer. \nGo to the store and buy some more, " + numBottles
						+ " bottles of beer on the wall.");
			}
			else {
				System.out.println(i + " bottles of beer on the wall, " + i 
						+ " bottles of beer. \nTake one down and pass it around, " + (i - 1)
						+ " bottles of beer on the wall.");
			}
			if (i != 0) {
				System.out.println();
			}
		}
	} // Keep Code Above This

}
