package ankita.java_incremental3;



class Cycle {
void balance()
{
    System.out.println("Cycle balance");
}

}


//subclass having balance method()

class Unicycle extends Cycle {
    void balance() {
        System.out.println("Unicycle balance method");
    }

}

//subclass having balance method()
class Bicycle extends Cycle {
    void balance() {
        System.out.println("Bicycle balance method");
    }
}


//subclass not having  balance method()
class Tricycle extends Cycle {


}

public class Part2 {

    public static void main(String args[]) {
        Cycle c[] = new Cycle[3];

        //instantiation  of all three subclass types and upcast them to an array of Cycle.
        c[0] = (Cycle) new Unicycle();
        c[1] = (Cycle) new Bicycle();
        c[2] = (Cycle) new Tricycle();


        //unicycle and Bicycle subclasses balance() is called even after upcasting as they still behave the same

        c[0].balance();
        c[1].balance();


        //tricycle class not having balance method that why Cycle class balance inherited
        c[2].balance();

        //downcasting array of cycle to respective subclass types

        Unicycle uni = (Unicycle) c[0];
        Bicycle bi = (Bicycle) c[1];
        Tricycle tri = (Tricycle) c[2];

        //balance method  of unicycle and bicycle subclass  successfully called
        uni.balance();
        bi.balance();

        //tricycle class not having balance method Cycle class balance inherited
        tri.balance();

    }

}
