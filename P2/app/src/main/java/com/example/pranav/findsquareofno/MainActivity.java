package com.example.pranav.findsquareofno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.function.DoubleBinaryOperator;

public class MainActivity extends AppCompatActivity {
    EditText etNumber;
    Button btnSquare;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumber = findViewById(R.id.etNumber);
        btnSquare = findViewById(R.id.btnSquare);

        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = etNumber.getText().toString();
                double num = Double.parseDouble(s);
                double res = num*num;
                Toast.makeText(MainActivity.this, "Square = " + res, Toast.LENGTH_SHORT).show();

            }
        });



    }
}
