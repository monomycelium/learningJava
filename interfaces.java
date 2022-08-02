class interfaces {
	public static void main(String[] args) {
		classY objectY = new classY();
		objectY.battery();
	}
}

interface classA {
	void wheel();
	void fuels();
	// void next() {
	// 	System.out.println("Raspberry Pi 4B");
	// }
}

interface classX {
	void battery();
	void display();
	// void news() {
	// 	System.out.println("Pop!_OS is amazing!");
	// }
}

class classY implements classA {
	// void battery() {
	// 	// news();
	// 	System.out.println("Battery Method");
	// }
	// void display() {
	// 	System.out.println("Display Method");
	// }
	void wheel() {
		System.out.println("Wheel Method");
	}
	void fuels() {
		System.out.println("Fuels Method");
	}
}
