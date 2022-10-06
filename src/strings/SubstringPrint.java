package strings;

/**
 * To print substring of a string
 *
 * @author Vinod John
 */
public class SubstringPrint {
    public static void main(String[] args) {
        String s = "Estonia is a beautiful country!";
        System.out.println(s);

        System.out.println(s.substring(0, 22));
        System.out.println(s.substring(23));
        System.out.println(s.substring(13, 22));
        System.out.println(s.substring(0,12) + s.substring(23));

        System.out.println(s.substring(s.indexOf("beau")));

        System.out.println(s.startsWith("Estonia"));
    }
}
