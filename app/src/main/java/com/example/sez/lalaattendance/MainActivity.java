package com.example.sez.lalaattendance;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        username = (EditText)findViewById(R.id.);
//        btn = (Button)findViewById(R.id.button2);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname;
                uname = username.getText().toString().trim().toLowerCase();

                if(uname.equals("2"))
                {
                    Intent intent2 = new Intent(MainActivity.this,bmm.class);
                    startActivity(intent2);
                    finish();

                }
                else if(uname.equals("5"))
                {
                    Intent intent = new Intent(MainActivity.this,bscit.class);
                    startActivity(intent);
                    finish();

                }
                else if(uname.equals("4"))
                {
                    Intent intent = new Intent(MainActivity.this,baf.class);
                    startActivity(intent);
                    finish();

                }
                else if(uname.equals("7"))
                {
                    Intent intent = new Intent(MainActivity.this,BFM.class);
                    startActivity(intent);
                    finish();

                }
                else if(uname.equals("3"))
                {
                    Intent intent = new Intent(MainActivity.this,BBI.class);
                    startActivity(intent);
                    finish();

                }
                else if(uname.equals("11"))
                {
                    Intent intent = new Intent(MainActivity.this,bms.class);
                    startActivity(intent);
                    finish();

                }
                else if(uname.equals("21"))
                {
                    Intent intent = new Intent(MainActivity.this,sybms.class);
                    startActivity(intent);
                    finish();

                }
                else if(uname.equals("31"))
                {
                    Intent intent = new Intent(MainActivity.this,tybms.class);
                    startActivity(intent);
                    finish();

                }

                else
                {
                    Toast.makeText(MainActivity.this, "WRONG ID | CONTACT HOD FOR ID", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
