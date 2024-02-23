public class Drama extends Movie {
    private String title;

    public Drama(String title) {
        this.title = title;
    }

    public void watchMovie() {
        System.out.println("You are watching an drama movie titled: " + this.title);
    }
}
