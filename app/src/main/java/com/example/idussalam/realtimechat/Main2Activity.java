package com.example.idussalam.realtimechat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final EditText username = (EditText) findViewById(R.id.username);
        Button login = (Button) findViewById(R.id.login);
        Button credit2 = (Button) findViewById(R.id.btncredit);
        Button close = (Button) findViewById(R.id.id.btnexit);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                Intent myIntent = new Intent(Main2Activity.this,MainActivity.class);
                myIntent.putExtra("name",user);

                startActivity(myIntent);
            }
        });


        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
            }
        });


        credit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(Main2Activity.this,credit.class);
                startActivity(pindah);
            }
        });
    }
}
