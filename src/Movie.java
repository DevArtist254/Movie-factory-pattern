public class Movie {

    public static Movie getMovie(String title, String type){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Action(title);
            case 'C' -> new Comedy(title);
            case 'D' -> new Drama(title);
            case 'H' -> new Horror(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie();
        };
    }
    public void watchMovie() {
        System.out.println("You are watching a movie");
    }
}
