package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText input;
    private TextView output;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnadd, btnsub, btnmul, btndiv, btnclear, btnequal;
    private String operand1, operand2, operator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.input);
        output = findViewById(R.id.output);
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
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);
        btnclear = findViewById(R.id.btnclear);
        btnequal = findViewById(R.id.btnequal);

        operand1 = "";
        operand2 = "";
        operator = "";
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                input.setText(input.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "9");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1 = input.getText().toString();
                operator = "+";
                input.setText("");
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1 = input.getText().toString();
                operator = "-";
                input.setText("");
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1 = input.getText().toString();
                operator = "*";
                input.setText("");
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1 = input.getText().toString();
                operator = "/";
                input.setText("");
            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
                operand1 = "";
                operand2 = "";
                operator = "";
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand2 = input.getText().toString();
                double result = 0.0;
                switch (operator) {
                    case "+":
                        result = Double.parseDouble(operand1) + Double.parseDouble(operand2);
                        break;
                    case "-":
                        result = Double.parseDouble(operand1) - Double.parseDouble(operand2);
                        break;
                    case "*":
                        result = Double.parseDouble(operand1) * Double.parseDouble(operand2);
                        break;
                    case "/":
                        result = Double.parseDouble(operand1) / Double.parseDouble(operand2);
                        break;
                }
                output.setText(String.valueOf(result));
                operand1 = "";
                operand2 = "";
                operator = "";
            }
        });
    }
}