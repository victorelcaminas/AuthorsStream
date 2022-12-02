import java.io.*;

public class ReadObjectBooks {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream input = null;
        try {
            input = new ObjectInputStream(new BufferedInputStream(
                    new FileInputStream("booksobject.dat")
            ));
            while (true) {
                Book b = (Book) input.readObject();
                System.out.println(b);
            }
        } catch (EOFException ex) {

        }
        finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
