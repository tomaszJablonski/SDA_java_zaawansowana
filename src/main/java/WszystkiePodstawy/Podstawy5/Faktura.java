package WszystkiePodstawy.Podstawy5;

public class Faktura {
    private String ID;
    private String NIP;
    private String opis;
    double kwotaNetto;
    double VAT;
    private boolean czykoszt;

//    public Faktura(Scanner faktura){
//        this.ID = ID;
//        String ID = faktura.next();
//        this.NIP = NIP;
//        String NIP = faktura.next();
//        this.opis = opis;
//        String opis = faktura.next();
//        this.kwotaNetto = kwotaNetto;
//        double kwotaNetto = faktura.nextDouble();
//        this.VAT = faktura.nextDouble();
//        this.czykoszt = faktura.nextBoolean();
//
//
//    }

    @Override
    public String toString() {
        return "Faktura{" +
                "faktura1='" + ID + '\'' +
                ", NIP='" + NIP + '\'' +
                ", opis='" + opis + '\'' +
                ", kwotaNetto=" + kwotaNetto +
                ", VAT=" + VAT +
                ", czykoszt=" + czykoszt +
                '}';
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public double getKwotaNetto() {
        return kwotaNetto;
    }

    public void setKwotaNetto(double kwotaNetto) {
        this.kwotaNetto = kwotaNetto;
    }

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }

    public boolean isCzykoszt() {
        return czykoszt;
    }

    public void setCzykoszt(boolean czykoszt) {
        this.czykoszt = czykoszt;
    }

    public double obliczBrutto() {
        return this.kwotaNetto * (100.0 + this.VAT) / 100;
    }


    //    public String getFaktura() {
//        return faktura1;
//    }
//
////    Pattern faktura = Pattern.compile("FW-[0-9]{4}-2021");
////    Matcher odczytF = faktura.matcher(faktura1);
//
//    public Matcher getOdczytF() {
//        return odczytF;
//    }
//}

}