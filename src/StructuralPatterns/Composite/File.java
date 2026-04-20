package StructuralPatterns.Composite;

public class File extends FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void display() {
        System.out.println("File: " + name + " (" + size + " bytes)");
    }
}
