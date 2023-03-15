public class DemoClassOne implements DemoInterface {
    @Override
    public void number(int n) {
        System.out.println("Number " + n);
    }

    public static void main(String[] args) {
        DemoClassOne demoOne = new DemoClassOne();
        demoOne.number(25);

        demoOne.printDefault();

    }
}
