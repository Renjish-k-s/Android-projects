package com.example.login_page_x;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button login;
    EditText username,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.pwd);
        login = (Button)findViewById(R.id.login_button);
        login.setOnClickListener(this);


    }

    public void onClick(View view)
    {
        if(view.getId()==R.id.login_button)
        {
            String a = username.getText().toString();
            String b = password.getText().toString();
            if((a.equals("123")&&b.equals("123")))
                Toast.makeText(this,"Login sucessfully accomplised",Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this,"Login failed",Toast.LENGTH_LONG).show();

        }
    }

}