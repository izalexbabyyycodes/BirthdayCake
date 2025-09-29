package cs301.birthdaycake;

public class CakeModel {

    //instance variables
    public boolean hasFire = true;
    public int numCandles = 2;
    public boolean hasFrosting = true;
    public boolean hasCandles = true;
    public float pressedX = 100;
    public float pressedY = 100;

    public void setHasFire(boolean b){hasFire = b;}
    public void setHasCandles(boolean b){hasCandles = b;}
    public void setNumCandles(int i){numCandles = i;}
    public void setPressedX(float i){pressedX = i;}
    public void setPressedY(float i){pressedY = i;}

    public boolean getHasFire(){return hasFire;}
    public boolean getHasCandles(){return hasCandles;}
    public int getNumCandles(){return numCandles;}
    public float getPressedX(){return pressedX;}
    public float getPressedY(){return pressedY;}
}
