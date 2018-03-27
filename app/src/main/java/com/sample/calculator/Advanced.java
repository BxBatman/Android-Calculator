package com.sample.calculator;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Bartłomiej on 2018-03-12.
 */

public class Advanced extends AppCompatActivity {
    TextView textView;
    Button coma;


    String currentOperation;
    String firstNumber;
    String secondNumber;

    boolean operationFlag = false;
    boolean isMinus = false;
    boolean oneComaFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advanced);
        textView = (TextView) findViewById(R.id.textView);
        coma = (Button) findViewById(R.id.coma);
        textView.setText("");

    }

    public void backspace(View view) {
        String text = textView.getText().toString();
        if (text != "" && text != null && text.length() > 0) {
            text = text.substring(0, text.length() - 1);
            textView.setText(text);
        }
    }

    public void clear(View view) {
        coma.setEnabled(true);
        textView.setText("");
        firstNumber = "";
        secondNumber = "";
    }

    public void symbolChange(View view) {
        if (isMinus == false) {
            textView.setText("-" + textView.getText());
            isMinus = true;
        } else if (isMinus == true) {
            String text = textView.getText().toString();
            if (text != "" && text != null && text.length() > 0 || text.substring(0, 0) == "-") {
                text = text.substring(1, text.length());
                textView.setText(text);

            }
            isMinus = false;
        }
    }

    public void addComa(View view) {
        if (!textView.getText().equals("")) {
            textView.setText(textView.getText() + ".");
        }
        coma.setEnabled(false);
    }

    public void sum(View view) {
        coma.setEnabled(true);
        if (operationFlag == true) {
            currentOperation = "sum";
            textView.setText("");
        } else {
            operationFlag = true;
            currentOperation = "sum";
            firstNumber = textView.getText().toString();
            textView.setText("");
        }
    }

    public void equal(View view) {
        double equal = 0;
        if (firstNumber.equals("")) {
        } else {
            secondNumber = textView.getText().toString();
            if (currentOperation == "sum") {
                equal = Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
                coma.setEnabled(false);
                textView.setText(Double.toString(equal));
            } else if (currentOperation == "multiplication") {
                equal = Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber);
                coma.setEnabled(false);
                textView.setText(Double.toString(equal));
            } else if (currentOperation == "subtraction") {
                equal = Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber);
                coma.setEnabled(false);
                textView.setText(Double.toString(equal));
            } else if (currentOperation == "division") {
                if (Double.parseDouble(secondNumber) == 0) {
                    Context context = getApplicationContext();
                    CharSequence text = "You can't divide by zero!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else {
                    equal = Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
                    coma.setEnabled(false);
                    textView.setText(Double.toString(equal));
                }
            } else if (currentOperation == "powerToAnother") {
                equal = Math.pow(Double.parseDouble(firstNumber), Double.parseDouble(secondNumber));
                coma.setEnabled(false);
                textView.setText(Double.toString(equal));
            }
            operationFlag = false;
        }
    }


    public void division(View view) {
        coma.setEnabled(true);
        if (operationFlag == true) {
            currentOperation = "division";
            textView.setText("");
        } else {
            operationFlag = true;
            currentOperation = "division";
            firstNumber = textView.getText().toString();
            textView.setText("");
        }
    }

    public void multiplication(View view) {
        coma.setEnabled(true);
        if (operationFlag == true) {
            currentOperation = "multiplication";
        } else {
            operationFlag = true;
            currentOperation = "multiplication";
            firstNumber = textView.getText().toString();
            textView.setText("");
        }
    }

    public void subtraction(View view) {
        coma.setEnabled(true);
        if (operationFlag == true) {
        } else {
            operationFlag = true;
            currentOperation = "subtraction";
            firstNumber = textView.getText().toString();
            textView.setText("");
        }
    }

    public void addNumber_0(View view) {
        textView.setText(textView.getText() + "0");
        if (oneComaFlag == true) {
        } else {
            coma.setEnabled(true);
            oneComaFlag = true;
        }
    }

    public void addNumber_1(View view) {
        textView.setText(textView.getText() + "1");
        if (oneComaFlag == true) {
        } else {
            coma.setEnabled(true);
            oneComaFlag = true;
        }
    }

    public void addNumber_2(View view) {
        textView.setText(textView.getText() + "2");
        if (oneComaFlag == true) {
        } else {
            coma.setEnabled(true);
            oneComaFlag = true;
        }
    }

    public void addNumber_3(View view) {
        textView.setText(textView.getText() + "3");
        if (oneComaFlag == true) {
        } else {
            coma.setEnabled(true);
            oneComaFlag = true;
        }
    }

    public void addNumber_4(View view) {
        textView.setText(textView.getText() + "4");
        if (oneComaFlag == true) {
        } else {
            coma.setEnabled(true);
            oneComaFlag = true;
        }
    }

    public void addNumber_5(View view) {
        textView.setText(textView.getText() + "5");
        if (oneComaFlag == true) {
        } else {
            coma.setEnabled(true);
            oneComaFlag = true;
        }
    }

    public void addNumber_6(View view) {
        textView.setText(textView.getText() + "6");
        if (oneComaFlag == true) {
        } else {
            coma.setEnabled(true);
            oneComaFlag = true;
        }
    }

    public void addNumber_7(View view) {
        textView.setText(textView.getText() + "7");
        if (oneComaFlag == true) {
        } else {
            coma.setEnabled(true);
            oneComaFlag = true;
        }
    }

    public void addNumber_8(View view) {
        textView.setText(textView.getText() + "8");
        if (oneComaFlag == true) {
        } else {
            coma.setEnabled(true);
            oneComaFlag = true;
        }
    }

    public void addNumber_9(View view) {
        textView.setText(textView.getText() + "9");
        if (oneComaFlag == true) {
        } else {
            coma.setEnabled(true);
            oneComaFlag = true;
        }
    }


    //advanced mode


    public void log(View view) {
        coma.setEnabled(true);
        firstNumber = textView.getText().toString();
        double result = Double.parseDouble(firstNumber);
        result = Math.log10(result);
        textView.setText(Double.toString(result));
    }

    public void powerToTwo(View view) {
        coma.setEnabled(true);
        firstNumber = textView.getText().toString();
        double result = Double.parseDouble(firstNumber);
        result = Math.pow(result, 2);
        textView.setText(Double.toString(result));
    }


    public void sqrt(View view) {
        coma.setEnabled(true);
        firstNumber = textView.getText().toString();
        double result = Double.parseDouble(firstNumber);
        result = Math.sqrt(result);
        textView.setText(Double.toString(result));
    }


    public void sin(View view) {
        coma.setEnabled(true);
        firstNumber = textView.getText().toString();
        double result = Double.parseDouble(firstNumber);
        result = Math.sin(result);
        textView.setText(Double.toString(result));
    }


    public void cos(View view) {
        coma.setEnabled(true);
        firstNumber = textView.getText().toString();
        double result = Double.parseDouble(firstNumber);
        result = Math.cos(result);
        textView.setText(Double.toString(result));
    }


    public void tan(View view) {
        coma.setEnabled(true);
        firstNumber = textView.getText().toString();
        double result = Double.parseDouble(firstNumber);
        result = Math.tan(result);
        textView.setText(Double.toString(result));
    }


    public void ln(View view) {
        coma.setEnabled(true);
        firstNumber = textView.getText().toString();
        double result = Double.parseDouble(firstNumber);
        result = Math.log(result);
        textView.setText(Double.toString(result));
    }


    public void powerToAnother(View view) {
        coma.setEnabled(true);
        if (operationFlag == true) {
            currentOperation = "powerToAnother";
            textView.setText("");
        } else {

            firstNumber = textView.getText().toString();
            currentOperation = "powerToAnother";
            textView.setText("");
        }
    }


}
