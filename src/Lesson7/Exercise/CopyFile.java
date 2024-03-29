package Lesson7.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile extends FileHandler  {
    public CopyFile(String sourceFileName, String targetFileName) {
    super(sourceFileName, targetFileName);
    }

    public void copyFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(super.getSourceFile()));
                FileWriter writer = new FileWriter(super.getTargetFile())) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }
        }
    }
}
