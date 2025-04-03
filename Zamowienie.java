public class Zamowienie {
    private int id;
    private Klient klient;
    private Produkt[] produkty;
    private int[] ilosci;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Produkt[] getProdukty() {
        return produkty;
    }

    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }

    public int[] getIlosci() {
        return ilosci;
    }

    public void setIlosci(int[] ilosci) {
        this.ilosci = ilosci;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double obliczWartoscZamowienia() {
        //TODO
        double suma = 0.0;
        for (int i = 0; i < produkty.length; i++) {
            suma += produkty[i].getCena() * ilosci[i];
        }
        return 0.0;
    }

    public void zastosujZnizke() {
        //TODO
        if (klient.isCzyStaly()) {
            double wartosc = obliczWartoscZamowienia();
            System.out.println("Cena po zniżce: " + (wartosc * 0.9));
        }
    }

    public void wyswietlSzczegoly() {
        //TODO
        System.out.println("Zamówienie ID: " + id);
        System.out.println("Klient: " + klient.getImie() + " " + klient.getNazwisko());
        for (int i = 0; i < produkty.length; i++) {
            System.out.println("Produkt: " + produkty[i].getNazwa() + ", Ilość: " + ilosci[i]);
        }
        System.out.println("Status: " + status);
        System.out.println("Łączna wartość: " + obliczWartoscZamowienia());
    }
}