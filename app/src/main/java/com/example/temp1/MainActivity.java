package com.example.temp1;

import static java.lang.Math.pow;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText input1;
    private Button button1;
    private TextView text2;
    private EditText input2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input_weight);
        input2 = findViewById(R.id.input_height);
        button1 = findViewById((R.id.button1));
        text2 = findViewById(R.id.text_BMI);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String in1 = input1.getText().toString(), in2 = input2.getText().toString();
                double w1 = Double.parseDouble(in1), h1 = Double.parseDouble(in2);
                double bmi = w1 / pow(h1, 2);
                String temp = ", ";
                if(bmi < 15){
                    temp += "too light";
                }else if(bmi < 16){
                    temp += "middle light";
                }else if(bmi < 18.5){
                    temp += "little light";
                }else if(bmi < 25){
                    temp += "normal";
                }else if(bmi < 30){
                    temp += "little fat";
                }else if(bmi < 35){
                    temp += "fat 1 level";
                }else if(bmi < 40){
                    temp += "fat 2 level";
                }else{
                    temp += "fat 3 level";
                }
                String ans = "BMI: " + String.format("%.2f",bmi) + temp;
                text2.setText(ans);
            }
        });
    }
}