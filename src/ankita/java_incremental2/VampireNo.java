package ankita.java_incremental2;

/*
 *A vampire number v is a number with an even number of digits n,
 *that can be factored into two numbers x and y each with n/2 digits
 *and not both with trailing zeroes, where v contains precisely all the digits from x and from y,
 *in any order. Write a java program to print first 100 vampire numbers.

 */


public class VampireNo {
    static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;

        }
        return true;
    }

    static String swap(String num, int index1, int index2) {
        char temp;
        char numArray[] = num.toCharArray();
        temp = numArray[index1];
        numArray[index1] = numArray[index2];
        numArray[index2] = temp;
        num = String.valueOf(numArray);
        return num;
    }

    static int number;

    //multiply two fangs to check whether they equal to number itself
    static boolean checkVampire(String num) {
        String one, two;
        one = num.substring(0, num.length() / 2);
        two = num.substring(num.length() / 2);
        if ((Integer.parseInt(one) * Integer.parseInt(two)) == number) {
            return true;
        }
        return false;
    }


    //forming all the permutations of that number
    static boolean permutationAndCheckVampire(String num, int start, int end) {

        if (start == end) {
            if (checkVampire(num)) {
                return true;
            }
            return false;
        }
        for (int i = start; i <= end; i++) {

            num = swap(num, start, i);

            if (permutationAndCheckVampire(num, start + 1, end))
                return true;
            num = swap(num, start, i);

        }
        return false;
    }


    static boolean isVampire(String num) {
//checking all the permutation of num for finding whether it is vampire or not
        return permutationAndCheckVampire(num, 0, num.length() - 1);

    }


    public static void main(String[] args) {


        int count = 1;
        //as Vampire no are even digit composite no so start checking from 10
        number = 10;
        String num;
        while (count <= 100) {

            num = String.valueOf(number);
            if (num.length() % 2 == 1) {
                num = num.concat("0");
                number = number * 10;

            }
//if number is prime then it cant be a vampire number
            if (!isPrime(number) && isVampire(num)) {
                System.out.println(number);
                count++;
            }

            number++;

        }


    }


}
