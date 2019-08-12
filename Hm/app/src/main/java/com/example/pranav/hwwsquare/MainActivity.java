package com.example.pranav.hwwsquare;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText et1;
    TextView tv1;

    TextToSpeech tts;

    String numberAsString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        tts=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status!=TextToSpeech.ERROR){
                    tts.setLanguage(Locale.ENGLISH);
                }
            }
        });





        int o = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
        setRequestedOrientation(o);






        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        et1=findViewById(R.id.et1);
        tv1=findViewById(R.id.tv1);




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = et1.getText().toString();

                if(s.length()== 0){

                    Toast.makeText(MainActivity.this, "Enter some number", Toast.LENGTH_SHORT).show();
                    return;
                }


                int a = Integer.parseInt(s);
                int z=a*a;
                Integer sa=z;
                numberAsString = sa.toString();

                Toast.makeText(MainActivity.this, "Reult = "+z, Toast.LENGTH_SHORT).show();
                tv1.setText(numberAsString);
                String msg=tv1.getText().toString();
                tts.speak(msg,TextToSpeech.QUEUE_FLUSH,null);

            }
        });





        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = et1.getText().toString();
                int a = Integer.parseInt(s);
                int z=a*a*a;
                numberAsString = Integer.toString(z);


                Toast.makeText(MainActivity.this, "Reult = "+z, Toast.LENGTH_SHORT).show();


                tv1.setText(numberAsString);
                String msg=tv1.getText().toString();
                tts.speak(msg,TextToSpeech.QUEUE_FLUSH,null);



            }
        });




    }  /*  END OF onCreate(Bundle savedInstanceState)  */





    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Wanna really close ??? ");
        builder.setCancelable(false);


        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });





        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });





        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });






        AlertDialog alert = builder.create();
        alert.setTitle("Exit");
        alert.show();


    }      /* END OF onBackPressed FUNCTION */

    }   /* END OF MainActivity*/