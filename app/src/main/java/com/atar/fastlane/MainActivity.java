package com.atar.fastlane;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.textView1);
        tv.setText("Build Type : "+BuildConfig.BUILD_TYPE +"\nFlavour : "+BuildConfig.FLAVOR);
    }
}
