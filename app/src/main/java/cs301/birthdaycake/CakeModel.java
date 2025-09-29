package cs301.birthdaycake;

public class CakeModel {

    //instance variables
    public boolean hasFire = true;
    public int numCandles = 2;
    public boolean hasFrosting = true;
    public boolean hasCandles = true;
    public float pressedX = 100;
    public float pressedY = 100;

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

    public boolean showChecker = false;
    public float checkerCx = 0f;   // center x
    public float checkerCy = 0f;   // center y
    public int checkerRows = 2;
    public int checkerCols = 2;
    public float checkerPixel = 40f; // px per square
}
