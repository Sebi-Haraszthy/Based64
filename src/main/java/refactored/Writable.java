package refactored;

import java.io.IOException;

public interface Writable {
    void write(String encodedString) throws IOException;
}