// 2022_08_06 Java Class 16

class interfacesTwo {
	public static void main(String[] args) {
		subClass subClass = new subClass();
		subClass.print();
		subClass.normalMethod();
		subClass.interfaceMethod();
		subClass.anotherMethod();
		subClass.methodX();
	}
}

abstract class superClass {
	abstract void abstractMethod(); // abstract method can only be in abstract classes
	void normalMethod() { // normal method can be in either type
		System.out.println("hello from normalMethod");
	}
}

class subClass extends superClass implements newInterface, interfaceX { // java cannot inherit multiple classes, but can implement multiple interfaces.
	void abstractMethod() {
		System.out.println("hello from abstractMethod");
	}
	public void print() {
		System.out.println("hello from subClass");
	}
	public void interfaceMethod() {
		System.out.println("hello from interfaceMethod");
	}
	public void anotherMethod() {
		System.out.println("hello from anotherMethod");
	}
	public void methodX() {
		System.out.println("hello from methodX");
	}
}

interface newInterface extends myInterface { // create interface to declare method
	public void interfaceMethod();
}

interface myInterface {
	public void anotherMethod();
}

interface interfaceX {
	public void methodX();
}
