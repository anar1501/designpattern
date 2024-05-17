package factory;

public class PDFDocument implements Document {
    @Override
    public void write() {
        System.out.println("PDF writed");
    }
}
