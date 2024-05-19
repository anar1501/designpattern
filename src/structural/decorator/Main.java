package structural.decorator;


public class Main {
    public static void main(String[] args) {
        Foo foo = new ApplicationFoo();
        foo.foo();
        FooWrapper wrapper=new BarApplication(foo);
        wrapper.foo();
    }
}
