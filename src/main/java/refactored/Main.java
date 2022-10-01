package refactored;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        MyFileWriter myFileWriter = new MyFileWriter("fileEncrypted.txt");
        MyDatabaseWriter myDatabaseWriter = new MyDatabaseWriter();
        MyFileReader myFileReader = new MyFileReader("src/main/java/refactored/fileToBeEncrypted.txt");
        EncodingModule encodingModule = new EncodingModule(myFileReader, myFileWriter);

        try {
            encodingModule.encode();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        encodingModule = new EncodingModule(myFileReader, myDatabaseWriter);

        try {
            encodingModule.encode();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}