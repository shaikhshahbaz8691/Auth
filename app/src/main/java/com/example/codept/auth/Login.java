package com.example.codept.auth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private static EditText username,password;
    private static Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login();

    }
    public void login()
    {
        btnLogin=(Button) findViewById(R.id.button_login);
        username=(EditText) findViewById(R.id.editText_username);
        password=(EditText) findViewById(R.id.editText_password);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                String user=username.getText().toString();
                String pass=username.getText().toString();

                if(user.equals("Admin") && pass.equals("Admin"))
                {
                    Toast.makeText(getApplicationContext(),"Successfully Logined...!",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Incorrect Password",Toast.LENGTH_LONG).show();

                }
            }
        });


    }
}
