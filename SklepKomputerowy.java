public class SklepKomputerowy {
    private Produkt[] produkty = new Produkt[10];
    private Klient[] klienci = new Klient[10];
    private Zamowienie[] zamowienia = new Zamowienie[10];
    private int liczbaProduktow;
    private int liczbaKlientow;
    private int liczbaZamowien;


    public void dodajKlienta(Klient klient1) {
        //TODO
        if (liczbaKlientow < klienci.length) {
            klienci[liczbaKlientow++] = klient1;
        } else {
            System.out.println("Nie można dodać więcej klientów.");
        }
    }

    public Zamowienie utworzZamowienie(
            Klient klient1,
            Produkt[] produktyZamowienia1,
            int[] ilosciZamowienia1) {

        Zamowienie zamowienie = new Zamowienie();
        zamowienie.setKlient(klient1);
        zamowienie.setProdukty(produktyZamowienia1);
        zamowienie.setIlosci(ilosciZamowienia1);
        zamowienie.setId(0);
        zamowienie.setStatus("Nowe");

        return zamowienie;
    }

    public void dodajProdukt(Produkt produkt1) {
        //TODO
        if (liczbaProduktow < produkty.length) {
            produkty[liczbaProduktow++] = produkt1;
        } else {
            System.out.println("Nie można dodać więcej produktów.");
        }
    }
    }
