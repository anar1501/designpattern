package creational.factory;

import static creational.factory.DocumentType.PDF;

public class Main {
    public static void main(String[] args) {
        DocumentFactory factory = DocumentFactory.getInstance(PDF);
        factory.write();
    }
}
