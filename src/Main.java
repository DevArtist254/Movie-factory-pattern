import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a movie you would like to watch or Q to quit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title of the movie");
        var title = sc.nextLine();
        System.out.println("Enter the type of the movie");
        var type = sc.nextLine();
        Movie movie = Movie.getMovie(title,type);
        movie.watchMovie();
    }
}