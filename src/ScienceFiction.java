public class ScienceFiction extends Movie {
    private String title;

    public ScienceFiction(String title) {
        this.title = title;
    }

    public void watchMovie() {
        System.out.println("You are watching an science fiction movie titled: " + this.title);
    }
}