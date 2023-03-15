public class DemoClassTwo implements DemoInterface {
    @Override
    public void number(int n) {
        System.out.println("Number " + n);
    }


    public static void main(String[] args) {
        DemoClassTwo demoTwo = new DemoClassTwo();
        demoTwo.number(26);
        DemoInterface.printStatic();
    }
}
