package test;

public class Card {
    private String chape;
    private String value;

    public Card(String chape,String value){
        this.chape = chape;
        this.value = value;
    }

    public String getChape() {
        return chape;
    }

    public String getValue() {
        return value;
    }

    public String toString(){
        return String.format("%s (%s)",this.chape,this.value);
    }
}
