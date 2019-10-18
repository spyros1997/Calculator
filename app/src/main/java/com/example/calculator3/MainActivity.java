package com.example.calculator3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity<decimalFormat> extends AppCompatActivity {
//δήλωση των κουμπιών και των textview
    private Button one;
    private Button two;
    private Button thre;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button mion;
    private Button epi;
    private Button sin;
    private Button ison;
    private Button clear;
    private Button dia;
    private Button comma;
    private TextView episkopish;
    private TextView apotelesma;
    private TextView episkopish2;
    private int k;
    private  int a1;
    private  int a2;
    private  int apot;
    private String kati;
    private boolean lastNumeric; // Represent whether the lastly pressed key is numeric or not
    private boolean lastDot; // If true, do not allow to add another DOT
    private boolean stateError; // Represent that current state is in error or not

    decimalFormat = new DecimalFormat("#.##########");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            buttons();
            // κωδικας εισαγωγης αριθμών στα textview
            one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    episkopish.setText(episkopish.getText() + "1" );
                }
            });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                episkopish.setText(episkopish.getText() + "2");
            }
        });
        thre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                episkopish.setText(episkopish.getText() +"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                episkopish.setText(episkopish.getText() +"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                episkopish.setText(episkopish.getText() +"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                episkopish.setText(episkopish.getText() +"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                episkopish.setText(episkopish.getText() +"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                episkopish.setText(episkopish.getText() +"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                episkopish.setText(episkopish.getText() +"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                episkopish.setText(episkopish.getText() +"0");
            }
        });
        // Decimal point
        findViewById(R.id.btncomma).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lastNumeric && !stateError && !lastDot) {
                    episkopish.append(".");
                    lastNumeric = false;
                    lastDot = true;
                }
            }

