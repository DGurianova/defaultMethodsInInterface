public class DemoClassMultInherit implements DemoInterfaceMultInheritOne, DemoInterfaceMultInheritTwo {
    @Override
    public void print() {
        DemoInterfaceMultInheritOne.super.print();
        DemoInterfaceMultInheritTwo.super.print();
    }

    public static void main(String[] args) {
        DemoClassMultInherit demo = new DemoClassMultInherit();
        demo.print();
    }
}
