package ankita.java_assignment2;

import java.util.Scanner;

public class ContainAllLetters {
static boolean isContains(String input) {


    // Create a hash table to get frequency of the
    // characters present in the string
    // By default count of all the letters
    //  would be 0.

    int countFrequency[] = new int[26];

    // Traverse all characters of input string

    for (char character : input.toCharArray()) {

        // If lowercase character encounters subtract 'a' or 97 to find index
        //  and then increment by 1 the frequency of that character in array

        if (character >= 'a' && character <= 'z') {
            countFrequency[character - 97]++;

// If upercase character encounters subtract 'A' or 65 to find index
            //  and then increment by 1 the frequency of that character in array


        } else if (character >= 'A' && character <= 'Z') {
            countFrequency[character - 65]++;

        }


    }
    // Return false if any character has frequency 0
    for (int i = 0; i < 26; i++) {
        if (countFrequency[i] == 0) {
            return false;
        }
    }

    // If all characters were present return true
    return true;
}

//driver class
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String inputString=sc.nextLine();
if(isContains(inputString))
{
    System.out.println("yes");
}
else
{
    System.out.println("no");
}
}

}

// Time Complexity is O(n)

//Space Complexity is O(1)