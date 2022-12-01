import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectAuthors {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream out = null;
        try {
            new ObjectOutputStream((
                    new BufferedOutputStream(
                            new FileOutputStream("authorsobject.dat")
                    )
            ));

        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
