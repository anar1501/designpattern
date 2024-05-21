package structural.decorator;


public class Main {
    public static void main(String[] args) {
        Foo foo = new ApplicationFoo();
        System.out.println(foo.foo());
        BarApplication wrapper=new BarApplication(foo);
        wrapper.bar();
    }
}
