import java.io.*;

public class ReadObjectAuthors {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream input = null;
        try {
            input = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("" +
                                    "authorsobject.dat")
                    )
            );
            while(true) {
                Author a = (Author) input.readObject();
                System.out.println(a);
            }
        }  catch (EOFException ex) {

        }
        finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
