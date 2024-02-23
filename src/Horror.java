public class Horror extends Movie {
    private String title;

    public Horror(String title) {
        this.title = title;
    }

    public void watchMovie() {
        System.out.println("You are watching an horror movie titled: " + this.title);
    }
}