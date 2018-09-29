package seanmichael.lao.com.laoseanlab5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class BackgroundService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background_service);

        Log.i("LaoSeanLab4", "I am writing logs");
        Log.i("LaoSeanLab4", "We are writing logs");
        Log.i("LaoSeanLab4", "they are writing logs");
    }
}
