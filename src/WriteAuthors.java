import java.io.*;
import java.util.Scanner;

public class WriteAuthors {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = null;

        try {
            out = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("authors.dat")
                    ));

            String answer = "y";
            Scanner input = new Scanner(System.in);
            while(!answer.equals("n")) {
                System.out.println("Enter Author");
                Author a = Author.readFromKeyboard();
                out.writeUTF(a.getName());
                out.writeUTF(a.getEmail());
                out.writeChar(a.getGender());
                out.writeInt(a.getYear());
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
