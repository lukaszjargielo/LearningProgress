package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NamesReader2 {
    private final String path;

    public NamesReader2(String path) {
        this.path = path;
    }

    public void readNames () throws IOException {
        Path path1 = Paths.get(path);
        List<String> lines = Files.readAllLines(path1);

        for(String line: lines) {
            System.out.println(line);
        }
    }
}
