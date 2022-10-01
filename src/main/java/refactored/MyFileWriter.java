package refactored;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter implements Writable {
    private String fileName;

    public MyFileWriter(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void write(String encodedString) throws IOException {
        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter(fileName));

        writer.write(encodedString);
        writer.close();
    }
}