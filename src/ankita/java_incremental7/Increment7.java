package ankita.java_incremental7;

import java.io.IOException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.FileWriter;

public class Increment7 {

    public static void main(String[] args) throws IOException {


        Map<Character,Integer> map=new HashMap<Character,Integer>();

        // Initializing FileReader object

        FileReader textFile =new FileReader(args[0]);



        int character;
        while((character=textFile.read()) != -1)
        {
//if character already incurred then increment its frequency by 1
            if(map.containsKey((char)character))
            {
                map.put((char)character,((Integer)map.get((char)character))+1);
            }
            //if character is not a space and new line and occured first time then set its frequency by 1
            else if((char)character!='\n' && (char)character!=' ')
            {
                map.put((char)character,1);
            }

        }

        textFile.close();

        //write  on output file every character(key) present in map with frequency as its value
        FileWriter outputFile =new FileWriter("OutputFile");

        outputFile.write("characters :frequency\n");

        for(Object key :map.keySet())
        {
            outputFile.write((Character)key+"  "+map.get((Character) key));
            outputFile.write("\n");

        }

        outputFile.close();


    }
}
