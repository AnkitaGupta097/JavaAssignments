package ankita.java_incremental2;

public class Part3 {
Part3(String str)
{
    System.out.println("argument passed is "+str);
}

    public static void main(String[] args) {
        Part3 array[]=new Part3[1];

//if we dont assign objects to references then no message of initailization will be displayed

array[0]=new Part3("string");
    }
}
