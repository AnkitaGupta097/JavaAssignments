package ankita.java_assignment3;

/*
Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment3 {

    static float computeMean(String host) throws IOException {

        int Number_OF_PING_MESSAGES = 5, index = 0;
        String line;

        //array to store time taken to ping each time
        float pingTimeArray[] = new float[Number_OF_PING_MESSAGES];


        String NUM_PINGS = String.valueOf(Number_OF_PING_MESSAGES);

        //create a new seperate process

        ProcessBuilder process = new ProcessBuilder("ping", "-c", NUM_PINGS, host);

        //starting the created process
        Process pingProcess = process.start();

        //reading the output of command after running
        BufferedReader commandOutput = new BufferedReader(new InputStreamReader(pingProcess.getInputStream()));

        //forming the RegEx to find time from outputline
        Pattern pattern = Pattern.compile("time=([0-9]+[.]?[0-9]*)");

        while ((line = commandOutput.readLine()) != null) {

            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {

                //extract the time value in string format
                String pingTime = matcher.group(1);
                float time = Float.parseFloat(pingTime);

                pingTimeArray[index++] = time;
            }
        }

        //sort the array having ping time
        Arrays.sort(pingTimeArray);
        int length = pingTimeArray.length;

        int midIndex = (int) length / 2;

        //finding median in case of even no of terms (midTerm+midTerm+1)/2
        if (length % 2 == 0) {
            return (pingTimeArray[midIndex] + pingTimeArray[midIndex - 1]) / 2;

//finding median in case of odd no of terms (midTerm)
        } else {
            return pingTimeArray[midIndex];
        }
    }


    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        //inputing the hostname
        String host = sc.next();
        System.out.println(computeMean(host));


    }
}
