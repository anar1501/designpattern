package creational.factory;



public abstract class DocumentFactory {
    protected DocumentFactory() {
    }

    public static DocumentFactory getInstance(DocumentType documentType) {
        return createDocument(documentType);
    }


    public static DocumentFactory createDocument(DocumentType documentType) {
        DocumentFactory doc = null;
        doc = switch (documentType) {
            case PDF -> new PDFDocument();
            case WORD -> new WordDocument();
            default -> null;
        };
        return doc;
    }

    public abstract void write();
}
