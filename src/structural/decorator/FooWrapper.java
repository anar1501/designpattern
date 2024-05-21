package structural.decorator;

public class FooWrapper implements Foo {
    private Foo foo;

    public FooWrapper(Foo foo) {
        if (foo == null) {
            throw new IllegalArgumentException("nullFoo");
        }
        this.foo = foo;
    }

    @Override
    public String foo() {
        return foo.foo();
    }
}
