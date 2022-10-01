package dirty;

import java.util.HashMap;
import java.util.Map;

public class MyDatabase {
    private Map<Integer, String> data = new HashMap<>();
    private int count = 0;

    public int write(String inputString) {
        count++;
        data.put(count, inputString);
        return count;
    }

    @Override
    public String toString() {
        return "MyDatabase: " + "data = " + data + ", count=" + count;
    }
}