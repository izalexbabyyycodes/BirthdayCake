package cs301.birthdaycake;

public class CakeModel {

    //instance variables
    public boolean hasFire = true;
    public int numCandles = 2;
    public boolean hasFrosting = true;
    public boolean hasCandles = true;

    private boolean showCoords = false;
    private float touchX = 0f;
    private float touchY = 0f;


    public void setHasFire(boolean b){hasFire = b;}
    public void setHasCandles(boolean b){hasCandles = b;}
    public void setNumCandles(int i ){numCandles = i;}

    // Getter / setters
    public boolean getShowCoords() {return showCoords;}
    public void setShowCoords(Boolean show) {
        this.showCoords = show;
    }

    public float getTouchX(){ return touchX;}
    public float getTouchY(){ return touchY;}
    public void setTouch(float x, float y){
        this.touchX= x;
        this.touchY = y;
    }

    public boolean getHasFire(){return hasFire;}
    public boolean getHasCandles(){return hasCandles;}
    public int getNumCandles(){return numCandles;}








}
