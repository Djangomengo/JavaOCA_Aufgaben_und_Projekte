package aufgaben_buch.chapter_06;

public class Konto {
     public String kontonummer;

     public double kontostand;

     Konto(String kontonummer, double kontostand) {
         this.kontonummer = kontonummer;
         this.kontostand = kontostand;
     }

     public double getKontostand(){
         return this.kontostand;
     }

    public String getKontonummer(){
         return this.kontonummer;
     }

    public void einzahlen( double einzahlung) {
         this.kontostand += einzahlung;
     }

    public void auszahlung (double auszahlung){
         this.kontostand -= auszahlung;
     }

}
