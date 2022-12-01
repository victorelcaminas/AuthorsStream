import java.io.*;

public class ReadAuthors {
    public static void main(String[] args) throws IOException {
        DataInputStream input = null;

        try {
            input = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream("authors.dat")
                    )
            );
            while (true) {
                String name = input.readUTF();
                String email = input.readUTF();
                char gender = input.readChar();
                int year = input.readInt();
                Author a = new Author(name, email, gender, year);
                System.out.println(a);
            }

        } catch (EOFException ex) {

        }
    }
}
