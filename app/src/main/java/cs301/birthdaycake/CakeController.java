package cs301.birthdaycake;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;


public class CakeController implements View.OnClickListener,View.OnTouchListener,
        CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener{

    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView view){
        this.cakeView = view;
        this.cakeModel = cakeView.getCakeModel();
    }

    @Override
    public void onClick (View view){
        Log.d("cake", "click!");
        cakeModel.setHasFire(false);
        cakeView.invalidate();
    }

    public boolean onTouch(View v, MotionEvent event){
        float x = event.getX();
        float y= event.getY();

        cakeModel.setTouch(x,y);
        cakeModel.setShowCoords(true);
        cakeView.invalidate();
        return true;
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(b){Log.d("switch", "candles");}
        if(!b){Log.d("switch", "no candles");}
        cakeModel.setHasCandles(b);
        cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        if (b){Log.d("sBar", "seekbar changed");}
        cakeModel.setNumCandles(i);
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

}
