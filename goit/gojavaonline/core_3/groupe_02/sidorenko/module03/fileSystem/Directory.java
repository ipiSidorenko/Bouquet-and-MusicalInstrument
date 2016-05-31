package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module03.fileSystem;

import java.util.List;

public class Directory extends File {
    private List<File> files;
    private String name;

    public boolean addFile(File file){
        return files.add(file);
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

