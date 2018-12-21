
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter an integer greater than or equal to 1");
		int numOfStars = userInput.nextInt();
		if (numOfStars < 1) {
			System.out.println("Invalid input");
		} else {
			System.out.println("");
			hourglass(numOfStars, 0);
			System.out.println("");
		}

	}

	public static void hourglass(int numOfStars, int count) {
		recursion(numOfStars);
		if(numOfStars > 1) {
			spaces(numOfStars, count);
			hourglass(numOfStars-1, count);
			recursion(numOfStars);
		}
	}

	public static void recursion(int numOfStars) {
		System.out.print("* ");
		if (numOfStars > 1)
			recursion(numOfStars - 1);
		else
			System.out.println();
	}
	
	public static void spaces(int count, int numOfStars) {
		if(count < numOfStars) {
			spaces(count -1, numOfStars);
		}
		System.out.print(" ");
	}
}
