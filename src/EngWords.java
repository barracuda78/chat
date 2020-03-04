import java.io.Serializable;

public class EngWords implements Serializable {
    private String engWord1;
    private String engWord2;
    private String engWord3;
    private String engWord4;
    private String engWordPlural1;
    private String engWordPlural2;
    private String engSinonim1;
    private String engAntonim1;
    private String engEtymology1;
    private String rusWord1;
    private String rusWord2;
    private String rusWord3;
    private String rusWord4;
    private String rusWordPlural1;
    private String rusWordPlural2;
    private String rusSinonim1;
    private String rusAntonim1;
    private String rusEtymology1;
    private static int generalIdCount = 0;
    private final static String NAME = "английское слово";
    private int id;

    public void setEngWord1(String engWord1) {
        this.engWord1 = engWord1;
    }

    public void setEngWord2(String engWord2) {
        this.engWord2 = engWord2;
    }

    public void setEngWord3(String engWord3) {
        this.engWord3 = engWord3;
    }

    public void setEngWord4(String engWord4) {
        this.engWord4 = engWord4;
    }

    public void setRusWord1(String rusWord1) {
        this.rusWord1 = rusWord1;
    }

    public void setRusWord2(String rusWord2) {
        this.rusWord2 = rusWord2;
    }

    public void setRusWord3(String rusWord3) {
        this.rusWord3 = rusWord3;
    }

    public void setRusWord4(String rusWord4) {
        this.rusWord4 = rusWord4;
    }



    public String getEngWord1() {
        return engWord1;
    }

    public String getEngWord2() {
        return engWord2;
    }

    public String getEngWord3() {
        return engWord3;
    }

    public String getEngWord4() {
        return engWord4;
    }

    public String getRusWord1() {
        return rusWord1;
    }

    public String getRusWord2() {
        return rusWord2;
    }

    public String getRusWord3() {
        return rusWord3;
    }

    public String getRusWord4() {
        return rusWord4;
    }

    public EngWords(){
        this.id = generalIdCount;
        generalIdCount++;
    }
    public void setEngWordPlural1(String engWordPlural1) {
        this.engWordPlural1 = engWordPlural1;
    }

    public void setEngWordPlural2(String engWordPlural2) {
        this.engWordPlural2 = engWordPlural2;
    }

    public void setRusWordPlural1(String rusWordPlural1) {
        this.rusWordPlural1 = rusWordPlural1;
    }

    public void setRusWordPlural2(String rusWordPlural2) {
        this.rusWordPlural2 = rusWordPlural2;
    }
    public void setEngSinonim1(String engSinonim1) {
        this.engSinonim1 = engSinonim1;
    }

    public void setRusSinonim1(String rusSinonim1) {
        this.rusSinonim1 = rusSinonim1;
    }

    public String getEngWordPlural1() {
        return engWordPlural1;
    }

    public String getEngWordPlural2() {
        return engWordPlural2;
    }

    public String getRusWordPlural1() {
        return rusWordPlural1;
    }

    public String getRusWordPlural2() {
        return rusWordPlural2;
    }

    public String getEngSinonim1() {
        return engSinonim1;
    }

    public String getRusSinonim1() {
        return rusSinonim1;
    }
    public String getEngAntonim1() {
        return engAntonim1;
    }

    public void setEngAntonim1(String engAntonim1) {
        this.engAntonim1 = engAntonim1;
    }

    public String getRusAntonim1() {
        return rusAntonim1;
    }

    public void setRusAntonim1(String rusAntonim1) {
        this.rusAntonim1 = rusAntonim1;
    }
    public String getEngEtymology1() {
        return engEtymology1;
    }

    public void setEngEtymology1(String engEtymology1) {
        this.engEtymology1 = engEtymology1;
    }

    public String getRusEtymology1() {
        return rusEtymology1;
    }

    public void setRusEtymology1(String rusEtymology1) {
        this.rusEtymology1 = rusEtymology1;
    }

    public String toString(){
        return "русский перевод слова: " + this.getRusWord1() + " ; английский перевод слова: " + this.getEngWord1();
    }

}
