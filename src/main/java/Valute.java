public class Valute {

    private String NumCode;
    private String CharCode;
    private int Nominal;
    private String Name;
    private float Value;


    public void setNumCode(String numCode) {
        NumCode = numCode;
    }
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

    public String getNumCode() {
      return NumCode;
  }
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

    public String toString(){
        String result = String.format("%s (%s) = %f", this.CharCode, this.Name, this.Value);
        return result;
    }
}
