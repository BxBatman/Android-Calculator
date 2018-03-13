package com.sample.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Bartłomiej on 2018-03-12.
 */

public class Simple extends AppCompatActivity {
    TextView textView ;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button coma;

    String currentOperation;
    String firstNumber;
    String secondNumber;
    boolean operationFlag = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple);
        textView = (TextView)findViewById(R.id.summary);
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.seven);
        eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);
        textView.setText("");
    }



    public void backspace(View view){
        String text = textView.getText().toString();
        if(text != "" && text !=null && text.length() > 0){
            text = text.substring(0,text.length()-1);
            textView.setText(text);
        }
    }

    public void clear(View view){
        textView.setText("");
    }

    public void sum(View view){
        operationFlag = true;
        currentOperation = "sum";
        firstNumber = textView.getText().toString();
        textView.setText("");

    }

    public void equal(View view){
        secondNumber=textView.getText().toString();
        int equal = Integer.parseInt(firstNumber)+Integer.parseInt(secondNumber);
        textView.setText(Integer.toString(equal));
    }

    public void addNumber_0(View view){
        textView.setText(textView.getText()+"0");

    }

    public void addNumber_1(View view){
        textView.setText(textView.getText()+"1");

    }

    public void addNumber_2(View view){
        textView.setText(textView.getText()+"2");

    }

    public void addNumber_3(View view){
        textView.setText(textView.getText()+"3");

    }

    public void addNumber_4(View view){
        textView.setText(textView.getText()+"4");

    }
    public void addNumber_5(View view){
        textView.setText(textView.getText()+"5");

    }

    public void addNumber_6(View view){
        textView.setText(textView.getText()+"6");

    }

    public void addNumber_7(View view){
        textView.setText(textView.getText()+"7");

    }

    public void addNumber_8(View view){
        textView.setText(textView.getText()+"8");

    }

    public void addNumber_9(View view){
        textView.setText(textView.getText()+"9");

    }

}
