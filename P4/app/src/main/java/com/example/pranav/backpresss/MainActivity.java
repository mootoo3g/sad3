 package com.example.pranav.backpresss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
    Button b1;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
        b1=findViewById(R.id.b1);
        
        
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "YEllo", Toast.LENGTH_SHORT).show();
            }




        });
    }


     long bpt;

     public void onBackPressed(){
        if(bpt+1500> System.currentTimeMillis()){
            super.onBackPressed();
        }
        else{
            Toast.makeText(this, "Press back again  "+bpt, Toast.LENGTH_SHORT).show();


        }
         bpt=System.currentTimeMillis();



     }


}
