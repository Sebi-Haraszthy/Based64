package refactored;

import java.io.*;
import java.util.Base64;

public class EncodingModule {
    MyFileWriter myFileWriter = new MyFileWriter();
    MyDatabaseWriter myDatabaseWriter = new MyDatabaseWriter();

    public void encodeFromFileToFile() throws IOException {
        String readFromFile = read("src/main/java/refactored/fileToBeEncrypted.txt");
        String encodedString = Base64.getEncoder().encodeToString(readFromFile.getBytes());
        myFileWriter.write(encodedString);
    }

    public String read(String fileName) throws IOException {
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

    public void encodeFromFileToDatabase() throws IOException {
        String readFromFile = read("src/main/java/refactored/fileToBeEncrypted.txt");
        String encodedString = Base64.getEncoder().encodeToString(readFromFile.getBytes());
        myDatabaseWriter.write(encodedString);
    }
}