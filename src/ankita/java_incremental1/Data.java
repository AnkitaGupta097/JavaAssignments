package ankita.java_incremental1;

public class Data {
    int member1;
    char member2;


    void printMember1() {
        System.out.println(member1);
    }

    void printMember2() {
        System.out.println(member2);
    }

    void newMethod() {
        /*
    since local variable a and b are not initilized
     ther are blank by default and blank variables cannot be used
    calling this method give compile time error.

        int a;
        char b;
      System.out.println(a+b);
         */
    }

}
