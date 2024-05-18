package creational.factory;

public class WordDocument extends DocumentFactory{

    @Override
    public void write() {
        System.out.println("Word written");
    }
}