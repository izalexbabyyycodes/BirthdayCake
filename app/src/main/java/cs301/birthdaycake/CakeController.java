package cs301.birthdaycake;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener,
        CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener{

    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView view){
        this.cakeView = view;
        this.cakeModel = cakeView.getCakeModel();
        cakeView.setOnTouchListener(this);
    }

    @Override
    public void onClick (View view){
        Log.d("cake", "click!");
        cakeModel.setHasFire(false);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(b){Log.d("switch", "candles");}
        if(!b){Log.d("switch", "no candles");}
        cakeModel.setHasCandles(b);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        if (b){Log.d("sBar", "seekbar changed");}
        cakeModel.setNumCandles(i);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent ) {
            int a = motionEvent.getActionMasked();
            if (a == MotionEvent.ACTION_DOWN || a == MotionEvent.ACTION_MOVE) {
                cakeModel.checkerCx = motionEvent.getX();
                cakeModel.checkerCy = motionEvent.getY();
                cakeModel.showChecker = true;
                cakeView.invalidate();
                return true;
            }
        return false;
    }
}
