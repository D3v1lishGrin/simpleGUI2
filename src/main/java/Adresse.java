

//@XmlRootElement
public class Adresse {
    private String strasse;
    private String hausnummer;
    private int plz;
    private String ort;

    public Adresse(){

    }


    //@xmlElement
    public void setStrasee(String strasse){
        this.strasse = strasse;
    }

    public String getStrasse(){
        return this.strasse;
    }

    //@XmlElement
    public void setHausnummer(String hausnummer){
        this.hausnummer = hausnummer;
    }

    public String getHausnumme(){
        return this.hausnummer;
    }

    //@XmlElement
    public void setPlz(int plz){
        this.plz = plz;
    }

    public int getPlz(){
        return this.plz;
    }

    //@XmlElement
    public void setOrt(String ort){
        this.ort = ort;
    }
    public String getOrt(){
        return this.ort;
    }


}
