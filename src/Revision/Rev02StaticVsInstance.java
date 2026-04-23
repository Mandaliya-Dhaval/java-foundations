public class Rev02StaticVsInstance {

    // static: belongs to class
    static int add(int a, int b) {
        return a + b;
    }

    // instance: belongs to object
    int multiply(int a, int b) {
        return a * b;
    }

    // instance state example
    private int counter = 0;

    void increment() {
        counter++;
        System.out.println("counter = " + counter);
    }

    public static void main(String[] args) {
        // calling static method (no object needed)
        System.out.println("add(2,3) = " + add(2, 3));

        // calling instance method (object needed)
        Rev02StaticVsInstance obj = new Rev02StaticVsInstance();
        System.out.println("multiply(2,3) = " + obj.multiply(2, 3));

        // instance state changes
        obj.increment();
        obj.increment();
        obj.increment();
    }
}