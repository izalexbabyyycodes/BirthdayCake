package cs301.birthdaycake;

public class CakeModel {

    //instance variables
    public boolean hasFire = true;
    public int numCandles = 2;
    public boolean hasFrosting = true;
    public boolean hasCandles = true;

    public void setHasFire(boolean b){hasFire = b;}
    public void setHasCandles(boolean b){hasCandles = b;}

    public boolean getHasFire(){return hasFire;}
    public boolean getHasCandles(){return hasCandles;}
}
