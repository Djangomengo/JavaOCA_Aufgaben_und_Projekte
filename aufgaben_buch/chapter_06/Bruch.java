package aufgaben_buch.chapter_06;

public class Bruch {
    private int zaehler;
    private int nenner;

    Bruch() {
        zaehler = 0;
        nenner = 1;
    }

    public Bruch(int x) {
        zaehler = x;
        nenner = 1;
    }

    public Bruch(int x, int y) {
        zaehler = x;
        nenner = y;
    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public void setZaehler(int z) {
        zaehler = z;
    }

    public void setNenner(int n) {
        nenner = n;
    }

    public void ausgeben() {
        System.out.print(zaehler + "/" + nenner);
    }

    public String bruchToString() {
        return zaehler + "/" + nenner;
    }

    public void kuerzen() {
        var m = Math.abs(zaehler); // speichert in m den Betrag von zaehler
        var n = Math.abs(nenner); // speichert in n den Betrag von nenner
        var r = m % n;
        while (r > 0) { // Berechnung des ggT
            m = n;
            n = r;
            r = m % n;
        }
        zaehler /= n; // in n steht jetzt der ggT
        nenner /= n;
    }

    public void gekuerztausgeben() {
        kuerzen();
        ausgeben();
    }

    public boolean equals(Bruch x) {
        var a = new Bruch(this.zaehler, this.nenner);
        var b = new Bruch(x.zaehler, x.nenner);
        a.kuerzen();
        b.kuerzen();
        if ((a.zaehler == b.zaehler) && (a.nenner == b.nenner)) {
            return true;
        } else {
            return false;
        }
    }

    public Bruch addiren(Bruch bruch){
        int neuerZaehler = (this.getZaehler() * bruch.nenner) + (bruch.zaehler * this.getNenner());
        int neuerNenner = (this.getNenner() * bruch.nenner);

        Bruch neuerBruch = new Bruch(neuerZaehler, neuerNenner);
        neuerBruch.kuerzen();
        return neuerBruch;
    }

    public Bruch subtrahiren (Bruch bruch){

        Bruch addiren = new Bruch(13,15);
        Bruch neurBruch = new Bruch(bruch.zaehler * bruch.getNenner() - bruch.getZaehler() * bruch.nenner);
        neurBruch.kuerzen();
        return neurBruch;
    }

    public double dezimalwert (Bruch bruch){
        double dezimalwert = bruch.getNenner() / bruch.zaehler ;
        return dezimalwert;
    }

}



