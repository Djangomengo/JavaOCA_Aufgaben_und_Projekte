package aufgaben_buch.chapter_05.kreis;

public class Kreis {
    double radius;

    public Kreis(){

        this.radius = 0;
    }

    public Kreis(double radius){

        this.radius = radius;
    }

    public double getRadius(){

        return this.radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public double getUmfang(){
        double umfang = 2 * Math.PI * this.radius;
        return umfang;
    }

    public double getFlaeche() {
        double flaeche = Math.PI * Math.pow(this.radius, 2);
        return flaeche;
    }

    public void setUmfang(double umfang){
        this.radius = umfang / 2 * Math.PI;
    }

    public void  setFlaeche(double flaeche){
        this.radius = Math.sqrt(flaeche / Math.PI);
    }
}
