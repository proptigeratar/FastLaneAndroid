package com.atar.fastlane;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity  extends AppCompatActivity {

    TextView resulttv ;
    int result = -1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resulttv = findViewById(R.id.textViewResult);

        if(getIntent()!=null){
            result = getIntent().getIntExtra("result",-99);
        }
        resulttv.setText(result+"");

    }
}
