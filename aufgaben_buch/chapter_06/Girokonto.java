package aufgaben_buch.chapter_06;

public class Girokonto extends Konto {
    Girokonto(String kontonummer, double kontostand) {
        super(kontonummer, kontostand);
    }

    double limit;

    Girokonto(String kontonummer, double kontostand, double limit){
        super(kontonummer, kontostand);
        this.limit = limit;
    }

    double getLimit(){
        return this.limit;
    }

    void setLimit(double limit){
        this.limit = limit;
    }

}

