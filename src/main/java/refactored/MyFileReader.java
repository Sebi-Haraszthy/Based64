package refactored;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader implements Readable {
    @Override
    public String read() throws IOException {
        BufferedReader reader;
        StringBuilder result = new StringBuilder();
        reader = new BufferedReader(new FileReader("src/main/java/refactored/fileToBeEncrypted.txt"));
        String aLine;

        while ((aLine = reader.readLine()) != null) {
            result.append(aLine);
        }

        reader.close();
        return result.toString();
    }
}