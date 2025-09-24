package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener{

    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView view){
        this.cakeView = view;
        this.cakeModel = cakeView.getCakeModel();
    }

    public void onClick (View view){
        Log.d("cake", "click!");
        cakeModel.setHasFire(false);
    }

}
