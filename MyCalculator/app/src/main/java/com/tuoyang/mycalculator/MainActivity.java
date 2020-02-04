package com.tuoyang.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    float num1, num2;

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDot;
    Button btnAdd, btnSub, btnDelivery, btnDiv, btnMulti, btnClear;
    Button btnEqual, btnAuthor;
    TextView editText;
    String opt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnDelivery = findViewById(R.id.btnDelivery);
        btnDiv = findViewById(R.id.btnDiv);
        btnMulti = findViewById(R.id.btnMulti);
        btnEqual = findViewById(R.id.btnEqual);
        editText = findViewById(R.id.editText);
        btnClear = findViewById(R.id.btnClear);
        btnDot = findViewById(R.id.btnDot);
        btnAuthor = findViewById(R.id.btnAuthor);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnDelivery.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnAuthor.setOnClickListener(this);

        num1 = 0.0f;
        opt = "";
    }

    @Override
    public void onClick(View v) {
        String str = editText.getText().toString();

        //清除数据
        if (v.getId() == R.id.btnClear)
        {
            num1 = 0.0f;
            num2 = 0.0f;
            opt ="";
            editText.setText("0");
        }
        //处理第一个数
        if (str.equals("0") && opt.equals("") && num1 == 0.0f) {
            switch (v.getId()) {
                case R.id.btn1: {
                    editText.setText("1");
                    break;
                }
                case R.id.btn2: {
                    editText.setText("2");
                    break;
                }
                case R.id.btn3: {
                    editText.setText("3");
                    break;
                }
                case R.id.btn4: {
                    editText.setText("4");
                    break;
                }
                case R.id.btn5: {
                    editText.setText("5");
                    break;
                }
                case R.id.btn6: {
                    editText.setText("6");
                    break;
                }
                case R.id.btn7: {
                    editText.setText("7");
                    break;
                }
                case R.id.btn8: {
                    editText.setText("8");
                    break;
                }
                case R.id.btn9: {
                    editText.setText("9");
                    break;
                }
                case R.id.btnDot:
                {
                    editText.setText("0.");
                    break;
                }
            }
        }
        else if (!str.equals("0") && opt.equals("")) {
            switch (v.getId()) {
                case R.id.btn0: {
                    editText.setText(editText.getText() + "0");
                    break;
                }
                case R.id.btn1: {
                    editText.setText(editText.getText() + "1");
                    break;
                }
                case R.id.btn2: {
                    editText.setText(editText.getText() + "2");
                    break;
                }
                case R.id.btn3: {
                    editText.setText(editText.getText() + "3");
                    break;
                }
                case R.id.btn4: {
                    editText.setText(editText.getText() + "4");
                    break;
                }
                case R.id.btn5: {
                    editText.setText(editText.getText() + "5");
                    break;
                }
                case R.id.btn6: {
                    editText.setText(editText.getText() + "6");
                    break;
                }
                case R.id.btn7: {
                    editText.setText(editText.getText() + "7");
                    break;
                }
                case R.id.btn8: {
                    editText.setText(editText.getText() + "8");
                    break;
                }
                case R.id.btn9: {
                    editText.setText(editText.getText() + "9");
                    break;
                }
                case R.id.btnDot: {
                    editText.setText(editText.getText() + ".");
                    break;
                }
                case R.id.btnAdd: {
                    opt = "+";
                    num1 = Float.parseFloat(editText.getText().toString());
                    num2 = 0.0f;
                    editText.setText("0");
                    break;
                }
                case R.id.btnMulti: {
                    opt = "*";
                    num1 = Float.parseFloat(editText.getText().toString());
                    num2 = 0.0f;
                    editText.setText("0");
                    break;
                }
                case R.id.btnSub: {
                    opt = "-";
                    num1 = Float.parseFloat(editText.getText().toString());
                    num2 = 0.0f;
                    editText.setText("0");
                    break;
                }
                case R.id.btnDiv: {
                    opt = "/";
                    num1 = Float.parseFloat(editText.getText().toString());
                    num2 = 0.0f;
                    editText.setText("0");
                    break;
                }
                case R.id.btnDelivery: {
                    opt = "%";
                    num1 = Float.parseFloat(editText.getText().toString());
                    num2 = 0.0f;
                    editText.setText("0");
                    break;
                }
            }
        }
        //处理第二个操作数
        if (num1 != 0.0f && !opt.equals("") && num2 == 0.0f) {
            editText.setText("");
            switch (v.getId()) {
                case R.id.btn0: {
                    editText.setText(editText.getText() + "0");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btn1: {
                    editText.setText(editText.getText() + "1");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btn2: {
                    editText.setText(editText.getText() + "2");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btn3: {
                    editText.setText(editText.getText() + "3");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btn4: {
                    editText.setText(editText.getText() + "4");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btn5: {
                    editText.setText(editText.getText() + "5");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btn6: {
                    editText.setText(editText.getText() + "6");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btn7: {
                    editText.setText(editText.getText() + "7");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btn8: {
                    editText.setText(editText.getText() + "8");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btn9: {
                    editText.setText(editText.getText() + "9");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btnDot: {
                    editText.setText(editText.getText() + ".");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
            }
        }else if (num1 != 0.0f && !opt.equals("") && !str.equals("0"))
        {
            switch (v.getId()) {
                case R.id.btn0: {
                    editText.setText(editText.getText() + "0");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btn1: {
                    editText.setText(editText.getText() + "1");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btn2: {
                    editText.setText(editText.getText() + "2");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btn3: {
                    editText.setText(editText.getText() + "3");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btn4: {
                    editText.setText(editText.getText() + "4");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btn5: {
                    editText.setText(editText.getText() + "5");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btn6: {
                    editText.setText(editText.getText() + "6");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btn7: {
                    editText.setText(editText.getText() + "7");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btn8: {
                    editText.setText(editText.getText() + "8");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btn9: {
                    editText.setText(editText.getText() + "9");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btnDot: {
                    editText.setText(editText.getText() + ".");
                    num2 = Float.parseFloat(editText.getText().toString());
                    break;
                }
                case R.id.btnEqual:
                {
                    float r = 0.0f;
                    num2 = Float.parseFloat(editText.getText().toString());
                    switch (opt)
                    {
                        case "+":
                        {
                            r = num1 + num2;
                            editText.setText(Float.toString(r));
                            num1 = 0.0f;
                            num2 = 0.0f;
                            opt = "";
                            break;
                        }
                        case "-":
                        {
                            r = num1 - num2;
                            editText.setText(String.valueOf(r));
                            num1 = 0.0f;
                            num2 = 0.0f;
                            opt = "";
                            break;
                        }
                        case "*":
                        {
                            r = num1 * num2;
                            editText.setText(String.valueOf(r));
                            num1 = 0.0f;
                            num2 = 0.0f;
                            opt = "";
                            break;
                        }
                        case "/":
                        {
                            r = num1 / num2;
                            editText.setText(String.valueOf(r));
                            num1 = 0.0f;
                            num2 = 0.0f;
                            opt = "";
                            break;
                        }
                        case "%":
                        {
                            r = num1 % num2;
                            editText.setText(String.valueOf(r));
                            num1 = 0.0f;
                            num2 = 0.0f;
                            opt = "";
                            break;
                        }
                    }
                }
            }
        }

        if (v.getId() == R.id.btnAuthor)
        {
            Toast.makeText(this,"作者Codeb299，QQ2316670081",Toast.LENGTH_LONG).show();
        }
    }
}




