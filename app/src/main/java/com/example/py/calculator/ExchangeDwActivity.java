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

public class ExchangeDwActivity extends AppCompatActivity {

    private EditText editTextkm,editTextm;//显示输入的数字
    private String s1="",s2="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange_dw);
        Button buttonReturn=(Button)findViewById(R.id.buttonReturn);
        Button buttonExchange=(Button)findViewById(R.id.buttonExchangeDw);

        buttonExchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextkm=(EditText)findViewById(R.id.editText_km);
                editTextm=(EditText)findViewById(R.id.editText_m);
                s1 = editTextkm.getText().toString();//获取字符串
                s2 = editTextm.getText().toString();//获取字符串
                try {
                    if (!s1.equals("") && s2.equals("")) {
                        double n1 = Double.parseDouble(s1);
                        editTextm.setText(n1 * 1000 + "");
                    }else if(s1.equals("") && !s2.equals("")){
                        double n2 = Double.parseDouble(s2);
                        editTextkm.setText(n2 / 1000 + "");
                    }else{
                    }
                } catch (Exception e) {
                }
            }
        });

        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExchangeDwActivity.this, CalculatorMainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
