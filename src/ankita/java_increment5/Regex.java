package ankita.java_increment5;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *Using the documentation for java.util.regex.Pattern as a resource,
 * write and test a regular expression that checks a sentence to see that
 * it begins with a capital letter and ends with a period.


 */


public class Regex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        //regex if sentence starts with small letter
        Pattern smallLetter = Pattern.compile("^[a-z]");

        Matcher m = smallLetter.matcher(sentence);
//regex if sentence starts with capital letter and ends with fullstop

        Pattern regex = Pattern.compile("^[A-Z].*[.]$");

        Matcher matcher = regex.matcher(sentence);
        if (matcher.matches()) {
            System.out.println("Valid sentence");
        } else if (m.find()) {
            System.out.println("First Letter should be Capital in sentence");
        } else {
            System.out.println("Sentence should end with fullStop");
        }
    }
}
