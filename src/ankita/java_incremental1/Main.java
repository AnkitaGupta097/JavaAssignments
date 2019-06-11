package ankita.java_incremental1;

public class Main {

    public static void main(String[] args) {
        Data d = new Data();
        d.printMember1();
        d.printMember2();
        d.newMethod();

        Singlton s = Singlton.getInstance("Ankita");
        s.getString();
    }
}
