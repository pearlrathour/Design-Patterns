package Structural.Composite;

// Client
public class Main {
    public static void main(String[] args) {
        FileSystem file1 = new File("Resume.pdf");
        FileSystem file2 = new File("Photo.png");
        FileSystem file3 = new File("Notes.txt");

        Folder folder1 = new Folder("Documents");
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        Folder folder2 = new Folder("My Folder");
        folder2.addComponent(folder1);
        folder2.addComponent(file3);

        folder2.showDetails("");
    }
}
