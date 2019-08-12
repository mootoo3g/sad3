package com.example.pranav.oddev;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNumber;
    Button btnFind;
    TextView tvResult;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber = findViewById(R.id.etNumber);
        btnFind = findViewById(R.id.btnFind);
        tvResult = findViewById(R.id.tvResult);

        btnFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = etNumber.getText().toString();
                int num = Integer.parseInt(s);
                String msg = "";
                if(num % 2 ==0)
                    msg="Even";
                else
                    msg = "odd";
                tvResult.setText("Resultt = "+msg);
            }
        });



    }
}
