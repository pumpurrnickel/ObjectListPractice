import java.util.Scanner;
import java.util.ArrayList;

public class TVshows {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<TVShowsOOP> TVshows = new ArrayList<>();
    public static void main(String[] args) {

        System.out.println("Enter nothing to proceed.");

        while(true) {
            System.out.println("Enter name of the show: ");
            String showName = input.nextLine();

            if(showName.equalsIgnoreCase("")){
                break;
            }

            System.out.println("Enter how many episodes there are: ");
            int numEpisode = Integer.parseInt(input.nextLine());

            System.out.println("Enter the genre of the show: ");
            String showGenre = input.nextLine();

            TVshows.add(new TVShowsOOP(showName, numEpisode, showGenre));

        }

        for (TVShowsOOP TVshows : TVshows) {
            System.out.println(TVshows.toString());
        }
    }
}