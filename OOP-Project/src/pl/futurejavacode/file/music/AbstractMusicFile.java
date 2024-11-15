package pl.futurejavacode.file.music;

import pl.futurejavacode.file.AbstractFile;
import pl.futurejavacode.file.FileType;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile{
    protected String bandName;
    protected String title;

    public AbstractMusicFile(String name, int size, String bandName, String title) {
        super(name, size);
        this.bandName = bandName;
        this.title = title;
    }

    @Override
    public FileType getType() {
        return FileType.MUSIC;
    }
}
