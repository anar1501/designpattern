package creational.factory;

public class PDFDocument extends DocumentFactory {

    @Override
    public void write() {
        System.out.println("PDF written");
    }
}
