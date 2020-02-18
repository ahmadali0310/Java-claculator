package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ans;
    Button b1 , b2 , b3 , b4 , b5 , b6 , b7 , b8,b9, b0,badd,bsub,bmul,bdiv,bequal,bdot,bclear,squre,percent,bracket;
    double value1 , value2;
    int percentvalue=0 ;
    boolean add , sub , mul , div , open , close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.bt1);
        b2 = findViewById(R.id.bt2);
        b3 = findViewById(R.id.bt3);
        b4 = findViewById(R.id.bt4);
        b5 = findViewById(R.id.bt5);
        b6 = findViewById(R.id.bt6);
        b7 = findViewById(R.id.bt7);
        b8 = findViewById(R.id.bt8);
        b9 = findViewById(R.id.bt9);
        b0 = findViewById(R.id.bt0);
        bdot = findViewById(R.id.btdot);
        badd = findViewById(R.id.btadd);
        bsub = findViewById(R.id.btsub);
        bmul = findViewById(R.id.btmul);
        bdiv = findViewById(R.id.btdiv);
        bequal = findViewById(R.id.btequal);
        bclear = findViewById(R.id.btclear);
        squre = findViewById(R.id.squre);
        percent = findViewById(R.id.percent);
        bracket= findViewById(R.id.brackets);
        ans = findViewById(R.id.ans);

        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText("");
                value1 = 0;
                value2=0;
                add=false;
                sub=false;
                mul= false;
                div = false;
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+ "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + ".");
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    value1 = Double.parseDouble(ans.getText()+ "");
                    add= true;
                    ans.setText(null);
                }
              catch (Exception e){
                    ans.setText("");
              }
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    value1 = Double.parseDouble(ans.getText() + "");
                    sub= true;
                    ans.setText(null);
                }
                catch (Exception e){
                    ans.setText("");
                }

            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    value1 = Double.parseDouble(ans.getText() + "");
                    mul= true;
                    ans.setText(null);
                }
               catch (Exception e){
                    ans.setText("");
               }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    value1 = Double.parseDouble(ans.getText() +"");
                    div= true;
                    ans.setText(null);
                }
                catch (Exception e){
                    ans.setText("");
                }
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    value2 = Double.parseDouble(ans.getText() + "");
                    if (add==true){
                        long res = (long) (value1+value2);
                        ans.setText(res+"");
                        add = false;
                    }
                    if (sub == true){
                        long res1 = (long)(value1-value2);
                        ans.setText(res1+"");
                        sub = false;
                    }
                    if (mul == true){
                        long res2 = (long)(value1*value2);
                        ans.setText(res2+"");
                        mul= false;
                    }
                    if (div == true){
                        double res = value1/value2;
                        ans.setText(res+"");
                        div = false;
                    }
                }
                catch (Exception e){
                    ans.setText("");
                }

            }
        });

        squre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    value1 = Double.parseDouble(ans.getText() +"");
                    long res = (long) (value1*value1);
                    ans.setText(res+"");
                }
                catch (Exception e){
                    ans.setText("");
                }
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if (add==true){
                        value2 = Double.parseDouble(ans.getText() +"");
                        double per = (value2/100)*value1;
                        double res = value1+per;
                        ans.setText(res+"");
                    }
                    else if (sub==true){
                        value2 = Double.parseDouble(ans.getText() +"");
                        double per = (value2/100)*value1;
                        double res = value1-per;
                        ans.setText(res+"");
                    }
                    else if (mul==true){
                        value2 = Double.parseDouble(ans.getText() +"");
                        double per = (value2/100)*value1;
                        double res = value1*per;
                        ans.setText(res+"");
                    }
                    else {
                        value2 = Double.parseDouble(ans.getText() +"");
                        double per = (value2/100)*value1;
                        double res = value1/per;
                        ans.setText(res+"");
                    }




                }
                catch (Exception e){
                    ans.setText("");
                }
            }
        });

        bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    String value = ans.getText().toString() +"";
                    if (value.length()>0){
                        value = value.substring(0,value.length()-1);
                        ans.setText(value);
                    }

                }
                catch (Exception e){
                    ans.setText("");
                }



            }
        });

    }
}
