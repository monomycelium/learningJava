class newClass {
    public static void main(String[] args) {
        System.out.println("This is a test script.");
        try {
            System.out.println(0 / 0);
            System.out.println("hey");
        } catch(ArithmeticException e) {
            System.out.println("Not possible.");
        }        
    }
}
