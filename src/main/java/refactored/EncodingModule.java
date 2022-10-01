package refactored;

import java.io.*;
import java.util.Base64;

public class EncodingModule {
    private Readable readable;
    private Writable writable;

    public EncodingModule(Readable readable, Writable writable) {
        this.readable = readable;
        this.writable = writable;
    }

    public void encode() throws IOException {
        String readFromFile = readable.read();
        String encodedString = Base64.getEncoder().encodeToString(readFromFile.getBytes());

        writable.write(encodedString);
    }
}