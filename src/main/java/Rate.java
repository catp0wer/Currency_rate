public class Rate {

    String valuteID;
    String charCode;
    int nominal;
    String name;
    int value;

    public void setValuteID(String valuteID) {
        this.valuteID = valuteID;
    }

    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getValuteID() {

        return valuteID;
    }

    public String getCharCode() {
        return charCode;
    }

    public int getNominal() {
        return nominal;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
