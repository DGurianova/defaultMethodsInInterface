public interface DemoInterface {
    void number(int n);

    default void printDefault() {
        System.out.println("Here is default method.");
    }

    static void printStatic() {
        System.out.println("Here is static method");
    }

}
