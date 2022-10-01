package dirty;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        EncodingModule encodingModule = new EncodingModule();
        encodingModule.encodeFromFileToFile();
        encodingModule.encodeFromFileToDatabase();
    }
}