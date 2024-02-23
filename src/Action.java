public class Action extends Movie{
    private String title;

    public Action(String title) {
        this.title = title;
    }

    public void watchMovie() {
        System.out.println("You are watching an action movie titled: " + this.title);
    }
}
