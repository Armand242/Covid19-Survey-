package com.covid_19survey;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import static java.lang.System.out;

public class MainActivity extends AppCompatActivity {

    Button done, showResults, button1, button2, button3, button4, button5;

    TextView age, place, healthyCode, satisfaction;



    private Survey survey = new Survey();

    private String showresults;
    private int Satisfaction = 0;
    private String Result;


    Random r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        done = (Button) findViewById(R.id.done);
        showResults = (Button) findViewById(R.id.showResults);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);


        age = (TextView) findViewById(R.id.age);
        place = (TextView) findViewById(R.id.place);
        healthyCode = (TextView) findViewById(R.id.healthyCode);


        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (done.getText() == done) {
                    Satisfaction++;
                    satisfaction.setText("satisfaction: " + Satisfaction);

                } else {
                    Out();
                }

            }
        });

    }

    private void Out() {
        AlertDialog.Builder alertDialogBuild = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuild
                .setMessage("you have" + Satisfaction + "choice satisfcation");

    }

}
