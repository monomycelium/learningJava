class area {
	public static void main(String[] args) {
		Vox Vox = new Vox();
		Vox.calc(20, 30);
		Vox.calc(33.33);
	}
}

class Vox {
	void calc(double base, double height) {
		System.out.println("area of triangle: " + ((base * height)/2));
	}

	void calc(double radius) {
		System.out.println("area of circle: " + (3.1416 * radius * radius));
	}
}
