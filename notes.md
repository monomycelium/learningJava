### Constructor

#### Static

To run commands when calling objects, use `constructor`. Constructor is basically a method named the same as the class. The method will be automatically executed when calling the object.

```
class constructor {
	public static void main(String[] args) {
		Vox myObject = new Vox(); // integers are set here
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
```

#### Parametered

```
class constructor {
	public static void main(String[] args) {
		Vox myObject = new Vox(10, 20, 30); // parameters for integers are taken here
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
```

### Overloading Methods

Multiple methods with the same name and class can have different parameters (types and quantities), a form of polymorphism.

### Access Control

Advanced sandboxes. `public` is set by default.
