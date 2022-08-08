class exceptions {
	public static void main(String[] args) {
		// cannot divide by 0:

		// int a = 20, b = 0;
		// double c;
		// System.out.println(a / b);

		// for (int i = 10; i > -10; i --) {
		// 	System.out.println(50 / i);
		// }

		// cannot go beyond index 4:

		// int arrayX[] = {11, 22, 33, 44, 55};
		// for (int intX = 0; intX < 10; intX ++) {
		// 	System.out.println(arrayX[intX]);
		// }

		// handling exceptions:

			// cannot divide by 0:

		// int a = 20, b = 10;
		// try {
		// 	System.out.println(a / b);
		// } catch(ArithmeticException e) {
		// 	System.out.println("Numbers cannot be divided by zero, okay?");
		// }

			// cannot go beyond index 4:

		int arrayX[] = {11, 22, 33, 44, 55};
		try {
			for (int intX = 0; intX < 10; intX ++) {
				System.out.println(arrayX[intX]);
			}
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Index out of range.");
		}

		System.out.println("[Process completed]");
	}
}
