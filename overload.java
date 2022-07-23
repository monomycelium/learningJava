class overload {
	public static void main(String[] args) {
		Vox myObject = new Vox();
		myObject.print(34, 35);
	}
}


class Vox {
	void print() {
		System.out.println("Hello World!");
	}

	void print(double doubleX) {
		System.out.println("Double: " + doubleX);
	}

	void print(int intX) {
		System.out.println("Integer: " + intX);
	}

	void print(int intX, int intY) {
		System.out.println("intX: " + intX);
		System.out.println("intY: " + intY);
		System.out.println("Sum: "  + (intX + intY));
	}
}
