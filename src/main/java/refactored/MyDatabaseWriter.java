package refactored;

public class MyDatabaseWriter implements Writable {
    @Override
    public void write(String encodedString) {
        MyDatabase database = new MyDatabase();

        database.write(encodedString);
        System.out.println(database);
    }
}