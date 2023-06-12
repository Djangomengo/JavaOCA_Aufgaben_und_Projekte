package aufgaben_buch.chapter_06;

public class BruchTest {
    public static void main(String[] args) {
        Bruch meinBruch = new Bruch(8,8);
        Bruch addiren = new Bruch(8,6);

        Bruch neuerBruch = meinBruch.addiren(addiren);
        neuerBruch.ausgeben();
        System.out.println(neuerBruch.dezimalwert(neuerBruch));
    }
}
