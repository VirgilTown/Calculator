package com.example.py.calculator;

import android.app.Activity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.tan;

public class MainActivity extends Activity {

    private Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine, buttonZero,  buttonPoint,  buttonPlus, buttonMinus,buttonMul,buttonDev, buttonMi, buttonGen, buttonExchange, buttonSin, buttonCos, buttonTan,  buttonEqual,buttonAllClear;
    private EditText editText;//显示输入的数字
    private String opt = "+";//操作符
    private double n1 = 0.0, n2 = 0.0;//操作数
    private int i = 0, j = 0;
    private TextView textView;//显示算式

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //获取按钮的id
        buttonOne = (Button) findViewById(R.id.buttonOne);
        buttonTwo = (Button) findViewById(R.id.buttonTwo);
        buttonThree = (Button) findViewById(R.id.buttonThree);
        buttonFour = (Button) findViewById(R.id.buttonFour);
        buttonFive = (Button) findViewById(R.id.buttonFive);
        buttonSix = (Button) findViewById(R.id.buttonSix);
        buttonSeven = (Button) findViewById(R.id.buttonSeven);
        buttonEight = (Button) findViewById(R.id.buttonEight);
        buttonNine = (Button) findViewById(R.id.buttonNine);
        buttonZero = (Button) findViewById(R.id.buttonZero);
        buttonPoint = (Button) findViewById(R.id.buttonPoint);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDev = (Button) findViewById(R.id.buttonDev);
        buttonMi = (Button) findViewById(R.id.buttonMi);
        buttonGen = (Button) findViewById(R.id.buttonGen);
        buttonExchange = (Button) findViewById(R.id.buttonExchange);
        buttonSin = (Button) findViewById(R.id.buttonSin);
        buttonCos = (Button) findViewById(R.id.buttonCos);
        buttonTan = (Button) findViewById(R.id.buttonTan);
        buttonAllClear = (Button) findViewById(R.id.buttonAllClear);

        //为按钮添加监听器
        buttonOne.setOnClickListener(lisenter);
        buttonPlus.setOnClickListener(lisenter);
        buttonTwo.setOnClickListener(lisenter);
        buttonEqual.setOnClickListener(lisenter);
        buttonThree.setOnClickListener(lisenter);
        buttonFour.setOnClickListener(lisenter);
        buttonFive.setOnClickListener(lisenter);
        buttonSix.setOnClickListener(lisenter);
        buttonSeven.setOnClickListener(lisenter);
        buttonEight.setOnClickListener(lisenter);
        buttonNine.setOnClickListener(lisenter);
        buttonZero.setOnClickListener(lisenter);
        buttonPoint.setOnClickListener(lisenter);
        buttonDev.setOnClickListener(lisenter);
        buttonMul.setOnClickListener(lisenter);
        buttonMinus.setOnClickListener(lisenter);
        buttonMi.setOnClickListener(lisenter);
        buttonGen.setOnClickListener(lisenter);
        buttonExchange.setOnClickListener(lisenter);
        buttonSin.setOnClickListener(lisenter);
        buttonCos.setOnClickListener(lisenter);
        buttonTan.setOnClickListener(lisenter);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonAllClear.setOnClickListener(lisenter);
    }


    //跟据被选择按钮的id设置监听器
    private OnClickListener lisenter = new OnClickListener() {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            editText = (EditText) findViewById(R.id.editText);
            textView = (TextView) findViewById(R.id.textView);
            String s = editText.getText().toString();//获取字符串
            Button btn = (Button) v;
            try {

                switch (btn.getId()) {
                    case R.id.buttonOne://1
                    {
                        String str = editText.getText().toString();
                        editText.setText(str + 1);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.buttonTwo://2
                    {
                        String str = editText.getText().toString();
                        editText.setText(str + 2);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.buttonThree://3
                    {
                        editText.setText(editText.getText().toString() + 3);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.buttonFour://4
                    {
                        editText.setText(editText.getText().toString() + 4);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.buttonFive://5
                    {
                        editText.setText(editText.getText().toString() + 5);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.buttonSix://6
                    {
                        editText.setText(editText.getText().toString() + 6);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.buttonSeven://7
                    {
                        editText.setText(editText.getText().toString() + 7);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.buttonEight://8
                    {
                        editText.setText(editText.getText().toString() + 8);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.buttonNine://9
                    {
                        editText.setText(editText.getText().toString() + 9);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.buttonZero://0
                    {
                        textView.setText(n1 + opt + 10);
                        editText.setText(editText.getText().toString() + 0);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.buttonPoint://.
                    {
                        String str = editText.getText().toString();
                        if (str.indexOf(".") != -1) //判断字符串中是否已经包含了小数点，如果有就什么也不做
                        {

                        } else //如果没有小数点
                        {
                            if (str.equals("0"))//如果开始为0，
                            {
                                editText.setText(("0" + ".").toString());
                            }
                            else if (str.equals(""))//如果初时显示为空，就什么也不做
                            {

                            } else {
                                editText.setText(str + ".");
                            }
                        }
                        break;
                    }
                    case R.id.buttonMul://操作符*
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "*";
                        editText.setText("");
                        textView.setText(n1 + opt);
                        break;
                    }
                    case R.id.buttonDev://操作符 /
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "/";
                        editText.setText("");
                        textView.setText(n1 + opt);
                        break;
                    }
                    case R.id.buttonPlus://+
                    {
                        if (i == 0) {
                            i = i + 1;
                            String str = editText.getText().toString();
                            n1 = Double.parseDouble(str);
                            opt = "+";
                            textView.setText(n1 + opt);
                            editText.setText("");
                        } else {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            n1 = n1 + n2;
                            textView.setText(n1 + opt);
                            editText.setText("");
                        }
                        break;
                    }
                    case R.id.buttonMinus://操作符-
                    {
                        if (j == 0) {
                            j = j + 1;
                            String str = editText.getText().toString();
                            n1 = Double.parseDouble(str);
                            opt = "-";
                            textView.setText(n1 + opt);
                            editText.setText("");
                        } else {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            n1 = n1 - n2;
                            textView.setText(n1 + opt);
                            editText.setText("");
                        }
                        break;
                    }
                    case R.id.buttonMi://操作符^
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "^";
                        editText.setText("");
                        textView.setText(n1 + opt);
                        break;
                    }
                    case R.id.buttonGen://genhao
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        if (n1 < 0) {
                            editText.setText("");
                            textView.setText("负数没有平方根");
                        } else {
                            editText.setText(Math.sqrt(n1) + "");
                            textView.setText(n1 + "的平方根是");
                        }
                        break;
                    }
                    case R.id.buttonSin://Sin
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        editText.setText(sin(n1) + "");
                        textView.setText("sin(" + n1 + ")=");
                        break;
                    }
                    case R.id.buttonCos: {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        editText.setText(cos(n1) + "");
                        textView.setText("cos(" + n1 + ")=");
                        break;
                    }
                    case R.id.buttonTan: {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        editText.setText(tan(n1) + "");
                        textView.setText("tan(" + n1 + ")=");
                        break;
                    }
                    case R.id.buttonExchange://+/-
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        if (str.length() > 0) {
                            editText.setText(-n1 + "");
                        }
                        textView.setText(-n1 + "");
                        break;
                    }
                    case R.id.buttonEqual://操作符=
                    {
                        i = 0;
                        j = 0;
                        if (opt == "+") {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            textView.setText(n1 + opt + n2 + "=");
                            editText.setText((n1 + n2) + "");
                        } else if (opt == "-") {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            textView.setText(n1 + opt + n2 + "=");
                            editText.setText((n1 - n2) + "");
                        } else if (opt == "*") {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            textView.setText(n1 + opt + n2 + "=");
                            editText.setText((n1 * n2) + "");
                        } else if (opt == "/") {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            if (n2 == 0) {
                                editText.setText("");
                                textView.setText("除数不能为0");
                                break;
                            } else {
                                textView.setText(n1 + opt + n2 + "=");
                                editText.setText((n1 / n2) + "");
                            }
                        } else if (opt == "^") {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            textView.setText(n1 + opt + n2 + "=");
                            editText.setText((pow(n1, n2)) + "");
                        }

                        break;
                    }
                    case R.id.buttonAllClear://AC
                    {
                        i = 0;
                        j = 0;
                        String str = editText.getText().toString();
                        if (str.length() > 0)
                            editText.setText("");
                        break;
                    }

                }
            } catch (Exception e) {
            }
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}