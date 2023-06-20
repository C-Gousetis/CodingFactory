package gr.aueb.cf.ch07;

/**
 * Replaces a string.
 */
public class ReplaceApp {

    public static void main(String[] args) {
        String title = "Coding Factory";
        String dashedTitle;

        dashedTitle = title.replace(" ", "-");
        System.out.println(dashedTitle);
    }
}
