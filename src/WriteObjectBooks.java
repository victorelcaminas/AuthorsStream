import java.io.*;

public class WriteObjectBooks {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new BufferedOutputStream(
                    new FileOutputStream("booksobject.dat")
            ));
            Author author = new Author("Patrick Rothfuss",
                    "p@gmail.com", 'm', 1978);
            Book b1 = new Book("The name of the wind", author, 25, 200);
            Book b2 = new Book("The fear of a wise man", author, 35, 100);
            out.writeObject(b1);
            out.writeObject(b2);

        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

}
