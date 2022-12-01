import java.io.Serializable;
import java.util.Scanner;

public class Author implements Serializable {
    static final long serialVersionUID = 1L;

    private String name;
    private String email;
    private char gender;
    private int year;

    public Author(String name, String email, char gender, int year) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.year = year;
    }

    public static Author readFromKeyboard() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Enter gender (M/F): ");
        char gender = input.next().toUpperCase().charAt(0);
        System.out.print("Birth year: ");
        int year = input.nextInt();

        return new Author(name, email, gender, year);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public int getYear() {
        return year;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + "(" + gender + ") at " + email +
                " [" + year + "]";
    }
}
