package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

// Composite
class Folder implements FileSystem {
    private String name;
    private List<FileSystem> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystem component) {
        components.add(component);
    }

    public void removeComponent(FileSystem component) {
        components.remove(component);
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "Folder: " + name);
        for (FileSystem c : components) {
            c.showDetails(indent + " ");
        }
    }
}
