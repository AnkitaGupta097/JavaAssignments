package ankita.java_incremental3;
//interface one having two abstract methods

interface I1 {
    void methodOne();

    void methodTwo();
}

//interface two having two abstract methods
interface I2 {
    void methodThree();

    void methodFour();
}

////interface three having two abstract methods
interface I3 {
    void methodFive();

    void methodSix();
}

//interface extending all three interfaces
interface NewInterface extends I1, I2, I3 {
    void methodSeven();

}

class BaseClass {

    void classMethodOne() {
        System.out.println("BaseClassMethod");
    }
}


//class extending base class and inplementing NewInterface methods

class SubClass extends BaseClass implements NewInterface {
    public void methodOne() {
        System.out.println("method One");
    }

    public void methodTwo() {
        System.out.println("method two");
    }

    public void methodThree() {
        System.out.println("method three");
    }

    public void methodFour() {
        System.out.println("method Four");
    }

    public void methodFive() {
        System.out.println("method five");
    }

    public void methodSix() {
        System.out.println("method six");
    }

    public void methodSeven() {
        System.out.println("method seven");
    }

    //method having interface one as an argument

    void one(I1 i1) {
        i1.methodOne();
        i1.methodTwo();
    }

    ////method having interface two as an argument
    void two(I2 i2) {

        i2.methodThree();
        i2.methodFour();
    }

    ////method having interface three as an argument
    void three(I3 i3) {
        i3.methodFive();
        i3.methodSix();
    }

    ////method having interface NewInterface as an argument
    void four(NewInterface i4) {
        i4.methodSeven();


    }
}

//driver class
public class Part3 {

    public static void main(String[] args) {
        SubClass sub = new SubClass();

        sub.one(sub);
        sub.two(sub);
        sub.three(sub);
        sub.four(sub);
    }

}
