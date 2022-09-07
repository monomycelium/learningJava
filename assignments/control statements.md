# control statements

1. get number from user and print if it is positive or negative

```
System.out.print("enter a number: ");
Scanner inputX = new Scanner(System.in);
double numberX = inputX.nextDouble();
if (numberX < 0) {
	System.out.println("number is negative");
} else {
	System.out.println("number is positive");
}
```

2. solve quadratic equations

```
(not sure)
```

3. get three numbers from user and print the greatest number

```
Scanner input = new Scanner(System.in);
System.out.print("enter a number: ");
int x = input.nextInt();
System.out.print("enter a number: ");
int y = input.nextInt();
System.out.print("enter a number: ");
int z = input.nextInt();
int[] arrayX = {x, y, z};
int max = arrayX[0];
for (int i = 0; i < arrayX.length; i ++) {
	if (arrayX[i] > max) {
		max = arrayX[i];
	}
}
System.out.print("greatest number: ");
System.out.println(max);
```

4. get number from user and print its respective day of the week

```
Scanner input = new Scanner(System.in);
System.out.print("enter a number: ");
int day = input.nextInt();
switch (day) {
	case 1:
		System.out.println("sunday");
		break;
	case 2:
		System.out.println("monday");
		break;
	case 3:
		System.out.println("tuesday");
		break;
	case 4:
		System.out.println("wednesday");
		break;
	case 5:
		System.out.println("thursday");
		break;
	case 6:
		System.out.println("friday");
		break;
	case 7:
		System.out.println("saturday");
		break;
	default:
		System.out.println("welcome to earth, martians!");
		break;
}
```

5. check if two decimals are the same up to three decimal points

```
(not sure)
```

6. find the number of days in a month

```
Scanner input = new Scanner(System.in);
System.out.print("enter a number: ");
int month = input.nextInt();
switch (month) {
	case 1, 3, 5, 7, 8, 10, 12:
		System.out.println("thirty-one");
		break;
	case 2:
		System.out.println("twenty-eight");
		break;
	case 4, 6, 9, 11:
		System.out.println("thirty");
		break;
	default:
		System.out.println("welcome to earth, martians!");
		break;
}
```

7. get character from user and print if is a vowel or a consonant and provide an output if the input is invalid

```
Scanner input = new Scanner(System.in);
System.out.print("enter a character: ");
char character = input.next().charAt(0);
while ( ! Character.isLetter(character) ) {
	System.out.println("enter a character!");
	System.exit(1);
}
switch (character) {
	case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
		System.out.println("vowel");
		break;
	default:
		System.out.println("consonant");
		break;
}
```

8. get year from user and print if it is a leap year

```
Scanner input = new Scanner(System.in);
System.out.print("enter a year: ");
int year = input.nextInt();
if ( (year % 4) > 0 ) {
	System.out.println("not a leap year");
} else {
	System.out.println("it's a leap year!");
}
```
