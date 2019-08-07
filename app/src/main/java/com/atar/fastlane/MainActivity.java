package com.atar.fastlane;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    Button add,sub,mul;
    int n1=-1,n2=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.textView);
        tv.setText("Build Type : "+BuildConfig.BUILD_TYPE +"\nFlavour : "+BuildConfig.FLAVOR);
        Log.d("atar", "MainActivity...onCreate()...");
        System.out.println("atar MainActivity...onCreate()...");

        num1 = findViewById(R.id.editTextnum1);
        num2 = findViewById(R.id.editTextnum2);
        add = findViewById(R.id.buttonAdd);
        sub = findViewById(R.id.buttonSubtract);
        mul = findViewById(R.id.buttonMul);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());

                if(isValid()){
                    moveToNextScreen(n1,n2,(n1+n2));
                }else{

                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                if(isValid()){
                    moveToNextScreen(n1,n2,(n1-n2));
                }else{

                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                if(isValid()){
                    moveToNextScreen(n1,n2,(n1*n2));
                }else{

                }
            }
        });

    }

    private void moveToNextScreen(int n1, int n2, int i) {
        num1.setText("");
        num2.setText("");
      Intent intent = new Intent(this,ResultActivity.class);
      intent.putExtra("num1",n1);
      intent.putExtra("num2",n1);
      intent.putExtra("result",i);
      startActivity(intent);
    }


    private boolean isValid() {
    return (n1!=-1 && n2 !=- -1);
    }
}
