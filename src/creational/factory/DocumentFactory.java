package creational.factory;

public class DocumentFactory {
    public Document createDocument(DocumentType documentType) {
        if (documentType.equals(DocumentType.PDF)) {
            return new PDFDocument();
        } else {
            return new WordDocument();
        }
    }
}
