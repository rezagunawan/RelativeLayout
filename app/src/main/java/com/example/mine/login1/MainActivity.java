package com.example.mine.login1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button loginButton;
    Button eyeButton;
    public	static	final	String	EXTRA_MESSAGE	= "com.example.mine.login1.extra.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        loginButton = (Button) findViewById(R.id.loginButton);
        eyeButton = (Button) findViewById(R.id.eyeButton);
    }


    public void loginClicked(View view) {
        Intent	intent	=	new Intent(this,SecondActivity.class);
        String	message	=	username.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,	message);
        startActivity(intent);
    }
}
