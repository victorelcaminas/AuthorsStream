import java.io.*;
import java.util.Scanner;

public class WriteObjectAuthors {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream((
                    new BufferedOutputStream(
                            new FileOutputStream("authorsobject.dat")
                    )
            ));
            String answer = "y";
            Scanner input = new Scanner(System.in);
            while(!answer.equals("n")) {
                System.out.println("Enter Author");
                Author a = Author.readFromKeyboard();
                out.writeObject(a);
                System.out.println("Another author? (Y/N):");
                answer = input.next().toLowerCase();
            }
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
