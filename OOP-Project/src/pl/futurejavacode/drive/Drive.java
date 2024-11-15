package pl.futurejavacode.drive;

import pl.futurejavacode.file.File;

public interface Drive {
    void addFile(File file);

    void listFiles();

    File findFile(String fileName);
}
