import java.util.Scanner;

class control {
	public static void main(String[] args) {

		// get number from user and print if it is positive or negative

		// System.out.print("enter a number: ");
		// Scanner inputX = new Scanner(System.in);
		// double numberX = inputX.nextDouble();
		// if (numberX < 0) {
		// 	System.out.println("number is negative");
		// } else if (numberX > 0) {
		// 	System.out.println("number is positive");
		// } else {
		// 	System.out.println("number is neither positive nor negative");
		// }

		// solve quadratic equations

		// get three numbers from user and print the greatest number

		Scanner input = new Scanner(System.in);
		System.out.print("enter a number: ");
		int x = input.nextInt();
		System.out.print("enter a number: ");
		int y = input.nextInt();
		System.out.print("enter a number: ");
		int z = input.nextInt();
		int[] arrayX = {x, y, z};
		int max = arrayX[0];
		for (int i = 0; i < arrayX.length; i ++) {
			if (arrayX[i] > max) {
				max = arrayX[i];
			}
		}
		System.out.print("greatest number: ");
		System.out.println(max);
	}
}
