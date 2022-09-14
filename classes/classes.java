class vox {
	int height, width, depth;

	// void myMethod() {
	// 	System.out.println("I am inside a class. This is my height: " + height);
	// }

	int myMethod() {
		return height;
	}
}

class classes {
	public static void main(String[] args) {
		vox myObject = new vox();
		vox myObjectTwo = new vox();
		myObject.height = 160;
		// myObject.myMethod();
		// myObjectTwo.height = 100;
		// myObjectTwo.myMethod();
		int myHeight = myObject.myMethod();
		System.out.println(myHeight);
	}
}
