package com.example.py.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Scanner;

public class ExchangeJzActivity extends AppCompatActivity {

    private EditText editTexts,editTexte;//显示输入的数字
    private String s1="",s2="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange_jz);
        Button buttonReturn=(Button)findViewById(R.id.buttonReturn);
        Button buttonExchange=(Button)findViewById(R.id.buttonExchangeJz);

        buttonExchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTexts=(EditText)findViewById(R.id.editText_s);
                editTexte=(EditText)findViewById(R.id.editText_e);
                s1 = editTexts.getText().toString();//获取字符串
                s2 = editTexte.getText().toString();//获取字符串
                try {
                    if (!s1.equals("") && s2.equals("")) {
                        int n1 = Integer.parseInt(s1);
                        editTexte.setText(Integer.toBinaryString(n1));
                    }else if(s1.equals("") && !s2.equals("")){
                        Scanner sc = new Scanner(s2);
                        int s = sc.nextInt();
                        int sum = 0;
                        int i = 0;
                        while(s != 0){
                            sum = (int) (sum + s % 10 * (Math.pow(2,i)));
                            s = s / 10;
                            i ++;
                        }
                        editTexts.setText(sum + "");
                    }else{
                    }
                } catch (Exception e) {
                }
            }
        });

        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExchangeJzActivity.this, CalculatorMainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
