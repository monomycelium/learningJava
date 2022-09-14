class booleans {
	public static void main(String args[]) {
		boolean a = true;
		boolean b = false;
		boolean c = a | b;
		boolean d = a & b;
		boolean e = (a & b) | !(a & !b);
		boolean f = (!a & b) | (a & !b);
		boolean g = !a;

		System.out.println(f);
	}
}
