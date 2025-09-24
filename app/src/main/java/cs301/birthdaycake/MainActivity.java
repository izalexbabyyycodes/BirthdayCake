package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView myCakeView = findViewById(R.id.cakeview);
        CakeController myCakeController = new CakeController(myCakeView);
        Button blowout = findViewById(R.id.button5);
        blowout.setOnClickListener(myCakeController);
        CompoundButton candles = findViewById(R.id.switch2);
        candles.setOnCheckedChangeListener(myCakeController);
        SeekBar numCandles = findViewById(R.id.seekBar);
        numCandles.setOnSeekBarChangeListener(myCakeController);
    }

    public void goodbye (View Button){
        Log.i("button", "Goodbye");
    }
}
