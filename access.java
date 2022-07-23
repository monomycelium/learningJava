class access {
	public static void main(String[] args) {
		Vox Vox = new Vox();

		Vox.x = 10;
		// Vox.y = 20;
		Vox.z = 30;

		Vox.print();
	}
}

class Vox {
	public int x;
	private int y = 20; // private means that this line of code cannot be accessed from other classes.
	public int z;

	public void print() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
