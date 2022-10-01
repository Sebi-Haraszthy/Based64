package refactored;

import java.io.*;
import java.util.Base64;

public class EncodingModule {
    public void encodeFromFileToFile() throws IOException {
        String readFromFile = read("src/main/java/refactored/fileToBeEncrypted.txt");
        String encodedString = Base64.getEncoder().encodeToString(readFromFile.getBytes());
        write(encodedString);
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

    public void write(String encodedString) throws IOException {
        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("fileEncrypted.txt"));

        writer.write(encodedString);
        writer.close();
    }

    public void encodeFromFileToDatabase() throws IOException {
        String readFromFile = read("src/main/java/refactored/fileToBeEncrypted.txt");
        String encodedString = Base64.getEncoder().encodeToString(readFromFile.getBytes());
        writeToDatabase(encodedString);
    }

    public void writeToDatabase(String encodedString) {
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
        System.out.println(database);
    }
}