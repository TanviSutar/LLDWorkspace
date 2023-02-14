package OOAD.CardGame;

public class Card {
    protected Suite suite;
    protected FaceValue faceValue;
    protected int numericValue;
    public Card(Suite suite, FaceValue faceValue){
        this.suite = suite;
        this.faceValue = faceValue;
    }
    public Card(Suite suite, FaceValue faceValue, int numericValue) {
        this.suite = suite;
        this.faceValue = faceValue;
        this.numericValue = numericValue;
    }
    public Suite getSuite(){
        return suite;
    }
    public FaceValue getFaceValue(){
        return faceValue;
    }
    public int getNumericValue() {
        return numericValue;
    }
    public String toString(){
        return faceValue.toString()+" of "+suite.toString();
    }
}
