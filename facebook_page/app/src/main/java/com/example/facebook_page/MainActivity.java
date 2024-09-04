package com.example.facebook_page;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

     EditText firstno;
     EditText secondnumber;

     TextView text_res;
     RadioButton add,sub,div,mul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the views
        firstno = findViewById(R.id.fno);
        secondnumber = findViewById(R.id.sno);
        text_res = findViewById(R.id.result);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.multi);
        div=findViewById(R.id.div);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);



        // Set up RadioGroup listener

    }

    @Override
    public void onClick(View v) {

        double result = 0;

        if(v.getId()==R.id.add)
        {

            String first = firstno.getText().toString();
            String second = secondnumber.getText().toString();
            double number1 = Double.parseDouble(first);
            double number2 = Double.parseDouble(second);
            result=number2+number1;
            text_res.setText("result="+String.valueOf(result));

        }
        if(v.getId()==R.id.sub)
        {

            String first = firstno.getText().toString();
            String second = secondnumber.getText().toString();
            double number1 = Double.parseDouble(first);
            double number2 = Double.parseDouble(second);
            result=number2-number1;
            text_res.setText("result="+String.valueOf(result));

        }
        if (v.getId() == R.id.div) {

            String first = firstno.getText().toString();
            String second = secondnumber.getText().toString();

            // Check if inputs are not empty
            if (first.isEmpty() || second.isEmpty()) {
                text_res.setText("Please enter both numbers.");
                return;
            }

            double number1 = Double.parseDouble(first);
            double number2 = Double.parseDouble(second);

            // Check for division by zero
            if (number2 == 0) {
                text_res.setText("Cannot divide by zero.");
            } else {
                result = number1 / number2;
                text_res.setText("Result = " + result);
            }
        }
        if(v.getId()==R.id.div)
        {

            String first = firstno.getText().toString();
            String second = secondnumber.getText().toString();
            double number1 = Double.parseDouble(first);
            double number2 = Double.parseDouble(second);
            result=number2*number1;
            text_res.setText("result="+String.valueOf(result));

        }
    }
}
