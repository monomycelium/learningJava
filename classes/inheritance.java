class inheritance {
	public static void main(String[] args) {
		subClass subClass = new subClass();
		subClass.k = 10;
		subClass.printK();
		subClass.i = 25;
		subClass.j = 50;
		subClass.printIJ();
		subClass.printSum();
		superClass superClass = new superClass();
		superClass.i = 11;
		superClass.j = 22;
		superClass.printIJ();
	}
}

class superClass {
	protected int i, j;
	void printIJ() {
		System.out.println(i);
		System.out.println(j);
	}
}

class subClass extends superClass {
	int k;

	void printK() {
		System.out.println(k);
	}

	void printSum() {
		System.out.println(i + j + k);
	}

}
