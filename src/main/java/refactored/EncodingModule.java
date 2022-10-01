package refactored;

import java.io.*;
import java.util.Base64;

public class EncodingModule {
    MyFileWriter myFileWriter = new MyFileWriter("fileEncrypted.txt");
    MyDatabaseWriter myDatabaseWriter = new MyDatabaseWriter();
    MyFileReader myFileReader = new MyFileReader("src/main/java/refactored/fileToBeEncrypted.txt");

    public void encodeFromFileToFile() throws IOException {
        String readFromFile = myFileReader.read();
        String encodedString = Base64.getEncoder().encodeToString(readFromFile.getBytes());
        myFileWriter.write(encodedString);
    }

    public void encodeFromFileToDatabase() throws IOException {
        String readFromFile = myFileReader.read();
        String encodedString = Base64.getEncoder().encodeToString(readFromFile.getBytes());
        myDatabaseWriter.write(encodedString);
    }
}