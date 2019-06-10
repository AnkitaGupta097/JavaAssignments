package ankita.java_incremental3;

//Super Class Rodent is abstract class having abstract methods


abstract class Rodent {
    String speciesName;

    Rodent() {
        speciesName = "Rodent";
        System.out.println("Rodent class  Constructer Calling");
    }

    void running() {
        System.out.println("rodent is running");
    }

    void eating() {
        System.out.println("rodent is eating");
    }

    // different implementation in different child classes
    abstract void tailSize();

    abstract void skinColour();

    //common method in all child classes

    void characterisics() {
        System.out.println(speciesName + " have sharp incisors that they use to gnaw wood,break into food, and bite predators.");
    }

}

class Mouse extends Rodent {


    Mouse() {
        speciesName = "Mouse";
        System.out.println("Mouse class  Constructer Calling");
    }

    //overriden methods
    void running() {
        System.out.println("Mouse is running");
    }

    void eating() {
        System.out.println("Mouse is eating");
    }

    //implementation of abstract methods
    void tailSize() {
        System.out.println(speciesName + " tailSize is large");
    }


    void skinColour() {
        System.out.println(speciesName + " skin Color is white");

    }

}


class Gerbil extends Rodent {

    Gerbil() {
        speciesName = "Gerbil";
        System.out.println(speciesName + " class  Constructer Calling");
    }

    //overriden methods
    void running() {
        System.out.println("Gerbil is running");
    }


    void eating() {
        System.out.println("Gerbil is eating");
    }

    //implementation of abstract methods

    void tailSize() {
        System.out.println(speciesName + " tailSize is very large");
    }


    void skinColour() {
        System.out.println(speciesName = " skin Color is black");

    }

}


class Hamester extends Rodent {
    Hamester() {
        speciesName = "Hamester";
        System.out.println(speciesName + " class  Constructer Calling");
    }

    //overriden methods
    void running() {
        System.out.println("Hamester is running");
    }

    void eating() {
        System.out.println("Hamester is eating");
    }

    //implementation of abstract methods
    void tailSize() {
        System.out.println(speciesName + " tailSize is large");
    }


    void skinColour() {
        System.out.println(speciesName + " skin Color is light red");
    }

}


public class Part1  {

    public static void main(String args[]) {

        //array of Rodent, refer to different specific types of Rodents
        Rodent rodents[] = new Rodent[3];

        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamester();

//calling  base-class methods
        for (int i = 0; i < 3; i++) {
            rodents[i].running();
            rodents[i].eating();
            rodents[i].tailSize();
            rodents[i].skinColour();
            rodents[i].characterisics();


        }

    }

}