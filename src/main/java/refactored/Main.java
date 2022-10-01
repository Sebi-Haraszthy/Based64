package refactored;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MyFileWriter myFileWriter = new MyFileWriter("fileEncrypted.txt");
        MyDatabaseWriter myDatabaseWriter = new MyDatabaseWriter();
        MyFileReader myFileReader = new MyFileReader("src/main/java/refactored/fileToBeEncrypted.txt");

        EncodingModule encodingModule = new EncodingModule(myFileReader, myFileWriter);
        encodingModule.encode();

        encodingModule = new EncodingModule(myFileReader, myDatabaseWriter);
        encodingModule.encode();
    }
}