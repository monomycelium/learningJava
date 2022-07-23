class constructorOverload {
	public static void main(String[] args) {
		Vox Vox = new Vox(54685);
		Vox Vox2 = new Vox('c');		
	}
}

class Vox {
	Vox() {
		System.out.println("Hello World");
	}

	Vox(int intX) {
		System.out.println("Hello Java! " + intX);
	}

	Vox(char charX) {
		System.out.println(charX);
	}
}
