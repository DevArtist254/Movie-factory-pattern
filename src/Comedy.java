public class Comedy extends Movie {
    private String title;

    public Comedy(String title) {
        this.title = title;
    }

    public void watchMovie() {
        System.out.println("You are watching an comedy movie titled: " + this.title);
    }
}
