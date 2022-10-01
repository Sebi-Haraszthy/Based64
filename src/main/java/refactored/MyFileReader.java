package refactored;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader implements Readable {
    private String fileName;

    public MyFileReader(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String read() throws IOException {
        BufferedReader reader;
        StringBuilder result = new StringBuilder();
        reader = new BufferedReader(new FileReader(fileName));
        String aLine;

        while ((aLine = reader.readLine()) != null) {
            result.append(aLine);
        }

        reader.close();
        return result.toString();
    }
}