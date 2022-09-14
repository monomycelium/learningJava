class statics {
	public static void main(String[] args) {
		Vox.intX = 24;
		Vox.print();
	}
}

class Vox {
	public static int intX;

	public static void print() {
		System.out.println(intX);
	}
}
