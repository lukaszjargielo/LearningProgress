package pl.futurejavacode.file.image;

import pl.futurejavacode.file.AbstractFile;
import pl.futurejavacode.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    public AbstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
