public class Rate {

//    private String Valute;
    private int NumCode;
    private String CharCode;
    private int Nominal;
    private String Name;
    private float Value;
//    private String ValCurs;

    public void setNumCode(int numCode) {
        NumCode = numCode;
    }

    public int getNumCode() {
        return NumCode;
    }

//    public String getValCurs() {
//        return ValCurs;
//    }



//    public void setValCurs(String valCursDate) {
//        ValCurs = valCursDate;
//    }
//
//    public String getValCursDate() {
//
//        return ValCurs;
//    }

//    public void setValute(String valute) {
//        this.Valute = Valute;
//    }

    public void setCharCode(String charCode) {
        this.CharCode = charCode;
    }

    public void setNominal(int nominal) {
        this.Nominal = nominal;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setValue(int value) {
        this.Value = value;
    }

//    public String getValute() {
//
//        return Valute;
//    }

    public String getCharCode() {
        return CharCode;
    }

    public int getNominal() {
        return Nominal;
    }

    public String getName() {
        return Name;
    }

    public float getValue() {
        return Value;
    }
}
