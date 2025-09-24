package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

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
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(b){Log.d("switch", "candles");}
        if(!b){Log.d("switch", "no candles");}
        cakeModel.setHasCandles(b);
    }
}
