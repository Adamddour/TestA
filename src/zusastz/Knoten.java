package zusastz;

public class Knoten {
    private int daten;
    private Knoten naechster;

    public Knoten(int daten) {
        this.daten = daten;
        this.naechster = null;
    }

    public int getDaten() {
        return daten;
    }

    public void setDaten(int daten) {
        this.daten = daten;
    }

    public Knoten getNaechster() {
        return naechster;
    }

    public void setNaechster(Knoten naechster) {
        this.naechster = naechster;
    }
}

