package refactored;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter implements Writable {
    @Override
    public void write(String encodedString) throws IOException {
        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("fileEncrypted.txt"));

        writer.write(encodedString);
        writer.close();
    }
}