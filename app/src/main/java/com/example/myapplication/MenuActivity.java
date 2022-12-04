package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {


        Button myplant;
        Button mycalender;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu);


            myplant = findViewById(R.id.myplant);

            myplant.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);



                    mycalender= findViewById(R.id.mycalender);

                    mycalender.setOnClickListener(new View.OnClickListener() {


                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), CalenderActivity.class);
                            startActivity(intent);

                        }

                        ;
                    });
                }
            });
        }
    }