public abstract class  Osoba {
    protected String imie;
   private int wiek;

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public Osoba() {
    }

    @Override
    public String toString() {
        return "Obiekt klasy Osoba" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek ;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {

        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
