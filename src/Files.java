import java.io.*;
import java.util.Date;

public class Files {
    public static void main(String[] args) throws IOException {
        File f = new File("booksobject.dat");
        f.createNewFile();
    }
}
