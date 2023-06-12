package aufgaben_buch.chapter_05.rechteck;

public class Rechteck {
    double laenge;
    double breite;

    public Rechteck(){
        this.laenge = 0;
        this.breite = 0;
    }

    public Rechteck(double laenge, double breite){
        this.laenge = laenge;
        this.breite = breite;
    }

    public void setLaenge(double laenge){
        this.laenge = laenge;
    }

    public void setBreite(double breite){
        this.breite = breite;
    }

    public void setSeiten(double breite, double laenge){
        this.breite = breite;
        this.laenge = laenge;
    }

    public double getLaenge(){
        return this.laenge;
    }

    public double getBreite(){
        return this.breite;
    }

    public double getKurtzeSeite(){
        if (this.breite < this.laenge){
            return this.breite;
        }else {
            return this.laenge;
        }
    }
    public double getLangeSeite() {
        if (this.breite < this.laenge) {
            return this.laenge;
        } else {
            return this.breite;
        }
    }

    public double getDiagonale (){
        double diagonale = Math.sqrt(Math.pow(this.laenge, 2) + Math.pow(this.breite, 2)) ;

        return diagonale;
    }

    public double getFLaeche (){
        double flaeche = this.laenge * this.breite;

        return flaeche;
    }

    public double getUmfang(){
        double umfange = (this.breite * 2) + (this.breite * 2);

        return umfange;
    }

    public  void langeVergrossern(double laenge){
        setLaenge(this.laenge + laenge);
    }

    public void breiteVergrossern(double breite){

        setBreite(this.breite +breite);
    }

    public  void langeVerkleinern(double laengeDown){

        this.laenge -= laengeDown;
    }

    public  void breiteVerkleinern(double breiteDown){

        this.breite -= breiteDown;
    }
}
