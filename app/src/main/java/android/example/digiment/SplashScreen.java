package android.example.digiment;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lusfold.spinnerloading.SpinnerLoading;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT =5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        SpinnerLoading view = findViewById(R.id.spin_load);
        view.setPaintMode(1);
        view.setCircleRadius(30);
        view.setItemCount(8);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, ProgressBar.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
