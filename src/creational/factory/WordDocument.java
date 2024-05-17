package creational.factory;

public class WordDocument implements Document {
    @Override
    public void write() {
        System.out.println("Word writed");
    }
}