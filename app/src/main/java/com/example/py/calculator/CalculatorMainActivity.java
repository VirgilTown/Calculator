package com.example.py.calculator;



import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import static java.lang.Math.sin;
import static java.lang.Math.cos;

public class CalculatorMainActivity extends Activity {

    private TextView mShowTextView = null;
    private StringBuffer mExpressBuffer = new StringBuffer();
    private String mResult = "";
    private static CalculatorMathUtil mCalculatorMathUtil = new CalculatorMathUtil(20);
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_main);

        mShowTextView = (TextView) findViewById(R.id.tv_calculator_result);


    }

    public void clickMe(View v) {
        if (mResult.length() > 0 && mExpressBuffer.toString().contains("=")) {
            mExpressBuffer = new StringBuffer();
        }
        Button btn = (Button) v;
        switch (btn.getId()) {
            case R.id.btn_calculator_num_0:
                if (mExpressBuffer.length() != 0 && mExpressBuffer.charAt(mExpressBuffer.length() - 1) == ')') {
                    break;
                }
                mExpressBuffer.append(0);
                break;
            case R.id.btn_calculator_num_1:
                if (mExpressBuffer.length() != 0 && mExpressBuffer.charAt(mExpressBuffer.length() - 1) == ')') {
                    break;
                }
                mExpressBuffer.append(1);
                break;
            case R.id.btn_calculator_num_2:
                if (mExpressBuffer.length() != 0 && mExpressBuffer.charAt(mExpressBuffer.length() - 1) == ')') {
                    break;
                }
                mExpressBuffer.append(2);
                break;
            case R.id.btn_calculator_num_3:
                if (mExpressBuffer.length() != 0 && mExpressBuffer.charAt(mExpressBuffer.length() - 1) == ')') {
                    break;
                }
                mExpressBuffer.append(3);
                break;
            case R.id.btn_calculator_num_4:
                if (mExpressBuffer.length() != 0 && mExpressBuffer.charAt(mExpressBuffer.length() - 1) == ')') {
                    break;
                }
                mExpressBuffer.append(4);
                break;
            case R.id.btn_calculator_num_5:
                if (mExpressBuffer.length() != 0 && mExpressBuffer.charAt(mExpressBuffer.length() - 1) == ')') {
                    break;
                }
                mExpressBuffer.append(5);
                break;
            case R.id.btn_calculator_num_6:
                if (mExpressBuffer.length() != 0 && mExpressBuffer.charAt(mExpressBuffer.length() - 1) == ')') {
                    break;
                }
                mExpressBuffer.append(6);
                break;
            case R.id.btn_calculator_num_7:
                if (mExpressBuffer.length() != 0 && mExpressBuffer.charAt(mExpressBuffer.length() - 1) == ')') {
                    break;
                }
                mExpressBuffer.append(7);
                break;
            case R.id.btn_calculator_num_8:
                if (mExpressBuffer.length() != 0 && mExpressBuffer.charAt(mExpressBuffer.length() - 1) == ')') {
                    break;
                }
                mExpressBuffer.append(8);
                break;
            case R.id.btn_calculator_num_9:
                if (mExpressBuffer.length() != 0 && mExpressBuffer.charAt(mExpressBuffer.length() - 1) == ')') {
                    break;
                }
                mExpressBuffer.append(9);
                break;
            case R.id.btn_calculator_num_point:
                if (mExpressBuffer.length() != 0) {
                    char c = mExpressBuffer.charAt(mExpressBuffer.length() - 1);
                    if (c >= '0' && c <= '9') {
                        mExpressBuffer.append(".");
                    }
                }
                break;
            case R.id.btn_calculator_brackets_left:
                if (mExpressBuffer.length() == 0) {
                    mExpressBuffer.append("(");
                } else {
                    char c = mExpressBuffer.charAt(mExpressBuffer.length() - 1);
                    if (c == '+' || c == '-' || c == '*' || c == '/' || c == '(') {
                        mExpressBuffer.append("(");
                    }
                }
                break;
            case R.id.btn_calculator_brackets_right:
                if (mExpressBuffer.length() != 0) {
                    char c = '\0';
                    int n1 = 0;// '('的个数
                    int n2 = 0;// ')'的个数
                    for (int i = 0; i < mExpressBuffer.length(); i++) {
                        c = mExpressBuffer.charAt(i);
                        if (c == '(') {
                            n1++;
                        } else if (c == ')') {
                            n2++;
                        }
                    }
                    if (n2 < n1 && (c >= '0' && c <= '9' || c == ')')) {
                        mExpressBuffer.append(")");
                    }
                }
                break;
            case R.id.btn_calculator_back_space:
                if (mExpressBuffer.length() != 0) {
                    mExpressBuffer.deleteCharAt(mExpressBuffer.length() - 1);
                }
                break;
            case R.id.btn_calculator_operator_0:
                mExpressBuffer = new StringBuffer();
                mResult = "";
                break;
            case R.id.btn_calculator_operator_1:
                if (mResult.length() != 0) {
                    mExpressBuffer.append(mResult);
                    mResult = "";
                }
                if (mExpressBuffer.length() == 0) {
                    mExpressBuffer.append("+");
                } else {
                    char c = mExpressBuffer.charAt(mExpressBuffer.length() - 1);
                    if (c >= '0' && c <= '9' || c == ')') {
                        mExpressBuffer.append("+");
                    }
                }
                break;
            case R.id.btn_calculator_operator_2:
                if (mResult.length() != 0) {
                    mExpressBuffer.append(mResult);
                    mResult = "";
                }
                if (mExpressBuffer.length() == 0) {
                    mExpressBuffer.append("-");
                } else {
                    int len = mExpressBuffer.length();
                    char c = mExpressBuffer.charAt(len - 1);
                    if (c >= '0' && c <= '9' || c == '(' || c == ')') {
                        mExpressBuffer.append("-");
                    } else if (len >= 2) {
                        c = mExpressBuffer.charAt(len - 2);
                        if (c >= '0' && c <= '9' || c == '(' || c == ')') {
                            mExpressBuffer.append("-");
                        }
                    }
                }
                break;
            case R.id.btn_calculator_operator_3:
                if (mResult.length() != 0) {
                    mExpressBuffer.append(mResult);
                    mResult = "";
                }
                if (mExpressBuffer.length() != 0) {
                    char c = mExpressBuffer.charAt(mExpressBuffer.length() - 1);
                    if (c >= '0' && c <= '9' || c == ')') {
                        mExpressBuffer.append("*");
                    }
                }
                break;
            case R.id.btn_calculator_operator_4:
                if (mResult.length() != 0) {
                    mExpressBuffer.append(mResult);
                    mResult = "";
                }
                if (mExpressBuffer.length() != 0) {
                    char c = mExpressBuffer.charAt(mExpressBuffer.length() - 1);
                    if (c >= '0' && c <= '9' || c == ')') {
                        mExpressBuffer.append("/");
                    }
                }
                break;
            case R.id.btn_calculator_operator_5:
                if (mExpressBuffer.length() != 0) {
                    char c = '\0';
                    int n1 = 0;// '('的个数
                    int n2 = 0;// ')'的个数
                    for (int i = 0; i < mExpressBuffer.length(); i++) {
                        c = mExpressBuffer.charAt(i);
                        if (c == '(') {
                            n1++;
                        } else if (c == ')') {
                            n2++;
                        }
                    }
                    if (n1 == n2 && (c >= '0' && c <= '9' || c == ')')) {
                        mExpressBuffer.append("=");
                        try {
                            mResult = mCalculatorMathUtil.getResult(mExpressBuffer.toString());
                            mExpressBuffer.append(mResult);
                        } catch (Exception e1) {
                            mExpressBuffer.deleteCharAt(mExpressBuffer.length() - 1);
                            Toast.makeText(this, "表达式错误", Toast.LENGTH_LONG).show();
                        }

                    }
                }
                break;
            case R.id.btn_calculator_vector_1:
                if (mExpressBuffer.length() != 0) {
                    double n1 = Double.parseDouble(mExpressBuffer.toString());
                    mExpressBuffer = new StringBuffer();
                    mExpressBuffer.append("sin(" + n1 + ")=" + sin(n1) + "");
                }
                break;
            case R.id.btn_calculator_vector_2:
                if (mExpressBuffer.length() != 0) {
                    double n1 = Double.parseDouble(mExpressBuffer.toString());
                    mExpressBuffer = new StringBuffer();
                    mExpressBuffer.append("cos(" + n1 + ")=" + cos(n1) + "");
                }
                break;
            case R.id.btn_calculator_vector_3:
                if (mResult.length() != 0) {
                    mExpressBuffer.append(mResult);
                    mResult = "";
                }
                if (mExpressBuffer.length() != 0) {
                    char c = mExpressBuffer.charAt(mExpressBuffer.length() - 1);
                    if (c >= '0' && c <= '9' || c == ')') {
                        mExpressBuffer.append("^");
                    }
                }
                break;
            case R.id.btn_calculator_exchange_1:
                Intent intentdw = new Intent(CalculatorMainActivity.this,ExchangeDwActivity.class);
                startActivity(intentdw);
                break;
            case R.id.btn_calculator_exchange_2:
                Intent intentjz = new Intent(CalculatorMainActivity.this, ExchangeJzActivity.class);
                startActivity(intentjz);
                break;
            default:
                break;
        }
        mShowTextView.setText(mExpressBuffer.toString());
    }

}