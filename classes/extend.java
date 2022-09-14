class extend {
	public static void main(String[] args) {
		subClass subClass = new subClass(44, 55, 33);
		subClass.printSum();
		subClass.print();
	}
}

final class superClass {
	int i, j;

	superClass(int fetchI, int fetchJ) {
		i = fetchI;
		j = fetchJ;
	}

	protected void printIJ() {
		System.out.println(i + ", " + j);
	}

	void print() {
		System.out.println("super classes rule!");
	}
}

class subClass extends superClass {
	int k;

	subClass(int fetchI, int fetchJ, int fetchK) {
		super(fetchI, fetchJ);
		k = fetchK;
	}

	void printK() {
		System.out.println(k);
	}

	void printSum() {
		System.out.println(i + j + k);
	}

	void print() {
		System.out.println("hello world!");
	}
}
