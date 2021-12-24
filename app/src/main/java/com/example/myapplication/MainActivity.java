package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button button;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        button= (Button) findViewById(R.id.btn1);
        textView = (TextView) findViewById(R.id.tv1);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                int number1 = Integer.parseInt(num1.getText() .toString());
                int number2 = Integer.parseInt(num2.getText() .toString());
                double pow =  Math.pow(number1, number2);
                textView.setText("Answer: " + String.valueOf(pow));

            }
        });
    }
}