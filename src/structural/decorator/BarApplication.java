package structural.decorator;

public class BarApplication extends FooWrapper{

    public BarApplication(Foo foo) {
        super(foo);
    }

    @Override
    public void foo() {
        System.out.println("Although I am using foo method however I am a Bar class because I am a decorator.:))");
    }
}
