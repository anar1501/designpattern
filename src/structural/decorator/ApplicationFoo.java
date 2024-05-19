package structural.decorator;

public class ApplicationFoo implements Foo {
    @Override
    public void foo() {
        System.out.println("I am doing one thing because I am original object");
    }
}
