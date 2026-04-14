package StructuralPatterns.Adapter;

public class Client {

    public static void clientCode(Printer printer){
        printer.print();
    }
    public static void main(String[] args) {
        PrinterAdapter printerAdapter = new PrinterAdapter();
        clientCode(printerAdapter);
    }
}
