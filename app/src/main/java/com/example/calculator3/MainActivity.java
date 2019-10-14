package com.example.calculator3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
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
    private TextView episkopish;
    private TextView apotelesma;
    private int k;
    private  int a1;
    private  int a2;
    private  int apot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            buttons();
            // κωδικας εισαγωγης αριθμών στα textview
            one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    episkopish.setText(episkopish.getText() +"1");
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

        //κωδικας  μετατροπης του string se int, αναθεση σε μεταβλιτή κα ορισμός αριθμου πραξης
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1 = Integer.parseInt(episkopish.getText().toString());
               // apotelesma.setText(episkopish.getText() +"+");
                episkopish.setText(null);
                k=1;


            }
        });
        mion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1 = Integer.parseInt(episkopish.getText().toString());
                // apotelesma.setText(episkopish.getText() +"+");
                episkopish.setText(null);
                k=2;


            }
        });
        epi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1 = Integer.parseInt(episkopish.getText().toString());
                // apotelesma.setText(episkopish.getText() +"+");
                episkopish.setText(null);
                k=3;


            }
        });
        dia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1 = Integer.parseInt(episkopish.getText().toString());
                // apotelesma.setText(episkopish.getText() +"+");
                episkopish.setText(null);
                k=4;


            }
        });
        //καθαρισμος των textview kai των μεταβλητών
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apotelesma.setText(null);
                episkopish.setText(null);
                a1= 0;
                a2= 0;
                k=0;

            }
        });
        // ελεγχος πράξης  υπολογισμός πράξης, μετατροπη απο int se string και εισαγωγη του αποτελεσματος
        // στα textview
        ison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a2 = Integer.parseInt(episkopish.getText().toString());

                if(k==1){
                    apot= a1 + a2;
                    apotelesma.setText(String.valueOf(apot));
                }
                else if (k == 2){
                    apot = a1 - a2;
                    apotelesma.setText(String.valueOf(apot));
                }
                else if (k == 3){
                    apot = a1 * a2;
                    apotelesma.setText(String.valueOf(apot));
                }
                else if (k == 4){
                    apot = a1 / a2;
                    apotelesma.setText(String.valueOf(apot));
                }
            }
        });


    }

    // συνάρτηση στην οποία γινετε ανάθεση των κουμπιών που δηλώσαμε με τα κουμπιά του layout μεσω των id
    private void buttons(){
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        thre = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight= (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        zero = (Button)findViewById(R.id.btnz);
        epi = (Button)findViewById(R.id.btnx);
        mion = (Button)findViewById(R.id.btnplin);
        sin = (Button)findViewById(R.id.btnsin);
        ison = (Button)findViewById(R.id.btne);
        clear = (Button)findViewById(R.id.btnc);
        dia = (Button)findViewById(R.id.btnd);
        episkopish = (TextView)findViewById(R.id.textView);
        apotelesma = (TextView)findViewById(R.id.textView2);



    }
}
