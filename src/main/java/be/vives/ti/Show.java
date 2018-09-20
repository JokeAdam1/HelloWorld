package be.vives.ti;

public class Show {
    private String tekst;

    public Show(String tekst) {
        this.tekst = tekst;
    }

    public void setTekst(String nieuwetekst)
    {
        tekst = nieuwetekst;
    }

    public String getTekst()
    {
        return tekst;
    }
}
