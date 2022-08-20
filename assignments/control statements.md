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

4. get number from user and print its respective weekday

```
```

5. check if two decimals are the same up to three decimal points

```
```

6. find the number of days in a month

```
```

7. get character from user and print if is a vowel or a consonant and provide an output if the input is incorrect

```
```

8. get year from user and print if it is a leap year

```
```
