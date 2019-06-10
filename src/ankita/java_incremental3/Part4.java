package ankita.java_incremental3;

//interface having abstract method

interface InterfaceCycle {
    void balance();

}

class UnicycleClass implements InterfaceCycle {
    public void balance() {

        System.out.println("Unicycle balance");
    }

}

class BicycleClass implements InterfaceCycle {
    public void balance() {

        System.out.println("Bicycle balance");
    }

}

class TricycleClass implements InterfaceCycle {
    public void balance() {

        System.out.println("Tricycle balance");
    }
}

//factory class producing unicycle,bicycle,tricycle
class CycleFactory {
    InterfaceCycle getCycle(String cycleType) {
        if (cycleType != null) {
            if (cycleType.equalsIgnoreCase("UNICYCLE")) {
                return new UnicycleClass();
            } else if (cycleType.equalsIgnoreCase("BICYCLE")) {
                return new BicycleClass();
            } else if (cycleType.equalsIgnoreCase("TRICYCLE")) {
                return new TricycleClass();
            }
        }
        return null;


    }
}


public class Part4 {
    public static void main(String[] args) {
        InterfaceCycle cycle;

        //use getCycle method to get object of mentioned cycle type

        CycleFactory factory = new CycleFactory();


        cycle = factory.getCycle("unicycle");

        //calling balance method of unicycleClass

        cycle.balance();
        cycle = factory.getCycle("bicycle");

        //calling balance method of biicycleClass

        cycle.balance();
        cycle = factory.getCycle("tricycle");

        //calling balance method of tricycleClass
        cycle.balance();

    }
}