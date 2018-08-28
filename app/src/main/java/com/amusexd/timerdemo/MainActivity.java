package com.amusexd.timerdemo;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                // Insert code to be run every second
                Log.i("everysec", "runn");
                handler.postDelayed(this, 1000);
            }
        };

        handler.post(run);

        new CountDownTimer(10000, 1000) {
          public void onTick(long millisecondUntilDone) {
              // Countdown is counting down (every second)
              Log.i("Second left", String.valueOf(millisecondUntilDone / 1000));
          }

          public void onFinish() {
              // Counter is finished! (after xxxx millisecond)
              Log.i("Done!", "Countdown timer finish");
          }
        }.start();
    }
}
