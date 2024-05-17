package factory;

import static factory.DocumentType.PDF;
import static factory.DocumentType.WORD;

public class Main {
    public static void main(String[] args) {
        DocumentFactory factory = new DocumentFactory();

        Document pdf = factory.createDocument(PDF);
        pdf.write(); // Output: PDF writed

        Document word = factory.createDocument(WORD);
        word.write(); // Output: Word writed
    }
}
