package com.example.sez.lalaattendance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    EditText username;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                username = (EditText)findViewById(R.id.loginID);
        btn = (Button)findViewById(R.id.btn_login);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname;
                uname = username.getText().toString().trim().toLowerCase();

                if(uname.equals("2"))
                {
                    Intent intent2 = new Intent(HomeActivity.this,bmm.class);
                    startActivity(intent2);
                    finish();

                }
                else if(uname.equals("5"))
                {
                    Intent intent = new Intent(HomeActivity.this,bscit.class);
                    startActivity(intent);
                    finish();

                }
                else if(uname.equals("4"))
                {
                    Intent intent = new Intent(HomeActivity.this,baf.class);
                    startActivity(intent);
                    finish();

                }
                else if(uname.equals("7"))
                {
                    Intent intent = new Intent(HomeActivity.this,BFM.class);
                    startActivity(intent);
                    finish();

                }
                else if(uname.equals("3"))
                {
                    Intent intent = new Intent(HomeActivity.this,BBI.class);
                    startActivity(intent);
                    finish();

                }
                else if(uname.equals("11"))
                {
                    Intent intent = new Intent(HomeActivity.this,bms.class);
                    startActivity(intent);
                    finish();



                }
                else if(uname.equals("21"))
                {
                    Intent intent = new Intent(HomeActivity.this,sybms.class);
                    startActivity(intent);
                    finish();

                }
                else if(uname.equals("31"))
                {
                    Intent intent = new Intent(HomeActivity.this,tybms.class);
                    startActivity(intent);
                    finish();

                }

                else
                {
                    Toast.makeText(HomeActivity.this, "WRONG ID | CONTACT HOD FOR ID", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
