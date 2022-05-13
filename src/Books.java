import java.util.Scanner;
import java.util.ArrayList;

public class Books {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<BooksOOP> Books = new ArrayList<BooksOOP>();

    public static void main(String[] args) {

        System.out.println("Enter book name, number of pages, and publication year.");
        System.out.println("Enter nothing to proceed.");

        while (true) {
            System.out.println("Enter book name: ");
            String name = input.nextLine();

            if (name.equalsIgnoreCase("")) {
                break;
            }

            System.out.println("Enter the number of pages: ");
            int pages = Integer.parseInt(input.nextLine());

            System.out.println("Enter the year of publication: ");
            int pub = Integer.parseInt(input.nextLine());

            Books.add(new BooksOOP(name, pages, pub));

        }

        System.out.print("What information are you looking for? (title, pages, publication, or everything?)");
        String search = input.nextLine();

        if (search.equalsIgnoreCase("everything")) {
            for (BooksOOP Books : Books) {
                System.out.println(Books.toString());
            }
        } else if (search.contains("title")) {
            for (BooksOOP Books : Books) {
                System.out.println(Books.getTitle());
            }
        } else if (search.contains("pages")) {
            for (BooksOOP Books : Books) {
                System.out.println(Books.getPage());
            }
        } else if (search.contains("pub")) {
            for (BooksOOP Books : Books) {
                System.out.println(Books.getPub());
            }
        }
    }
}