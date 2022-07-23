// Static Constructor

/*

class constructor {
	public static void main(String[] args) {
		Vox myObject = new Vox();
		System.out.println(myObject.volume());
	}
}

class Vox {
	int height, width, length;

	Vox() {
		height = 100;
		width = 50;
		length = 40;
	}

	int volume() {
		return height * width * length;
	}
}

*/

// Parametered Constructor

class constructor {
	public static void main(String[] args) {
		Vox myObject = new Vox(10, 20, 30);
		System.out.println(myObject.volume());
	}
}

class Vox {
	int height, width, length;

	Vox(int myHeight, int myWidth, int myLengths) {
		height = myHeight;
		width = myWidth;
		length = myLengths;
	}

	int volume() {
		return height * width * length;
	}
}
