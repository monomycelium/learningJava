class mover {
	public static void main(String[] args) {
		Vox Vox = new Vox();
		Vox.print(28, 47);
	}
}

class Vox {
	void print(double doubleX, double doubleY) {
		System.out.println(doubleX);
		System.out.println(doubleY);
	}

	void print(double doubleX, double doubleY, double doubleZ) {
		System.out.println(doubleX);
		System.out.println(doubleY);
		System.out.println(doubleZ);
	}
}
