package com.example.administrator.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Info = (TextView)findViewById(R.id.textView);
        Login = (Button)findViewById(R.id.btnLogin);

        Info.setText("No of attempts remaining: 5");


        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                validate(Name.getText().toString(), Password.getText().toString());

            }
        });
    }
        private void validate(String userName, String userPassword)
        {
            if ((userName == "Admin") && (userPassword == "1234")) {
                //if this matches, let the user enter into this activity
                Intent intent = new Intent(MainActivity3.this, SecondActivity.class);
                startActivity(intent);
            } else {
                //everytime the wrong password is entered the counter decrements
                counter--;
                Info.setText("No of attempts remaining: " + String.valueOf(counter));
                //string.valueof(converts int to string)

                if (counter == 0) {
                    //the button should get disabled
                    Login.setEnabled(false);
                }

            }
        }

}
