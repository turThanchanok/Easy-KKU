package com.example.csitgis.easykku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //การประกาศตัวแปร Explicit
    private Button signInButton, signUpButton; //Shift+Ctrl+Enter=;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget การผูก widget กับตัวแปร
        signInButton = (Button) findViewById(R.id.button3);
        signUpButton = (Button) findViewById(R.id.button4); //Alt+Enter ให้หาย Error

        //Sign Up Controller
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SignUpActivity.class));
            }
        });

    } //Main Method

}   //Main Class
