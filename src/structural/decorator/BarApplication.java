package structural.decorator;

public class BarApplication extends FooWrapper {

    public BarApplication(Foo foo) {
        super(foo);
    }

    public void bar() {
        System.out.println(foo() + " " + "bar");
    }
}
