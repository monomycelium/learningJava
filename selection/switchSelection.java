class switchSelection {
	public static void main(String args[]) {

		// Switch

		/*

		int day = 5;

		switch (day) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Out of range");
				break;
		}

		*/

		// Nested switches

		int day = 1, check = 5;

		switch (day) {
			case 1:
				System.out.println("Sunday");

				switch (check) {
					case 5:
						System.out.println("5");
						break;
					case 6:
						System.out.println("6");
						break;
					default:
						System.out.println("Out of range");
						break;
				}

				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Out of range");
				break;
		}

	}
}