package com.example.sez.lalaattendance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class bms extends AppCompatActivity {
    Button divA,divB,divC,divD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bms);

        divA = (Button)findViewById(R.id.a);
        divB = (Button)findViewById(R.id.b);
        divC = (Button)findViewById(R.id.c);
        divD = (Button)findViewById(R.id.d);


        divA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(bms.this,FyBms_a.class);
                startActivity(intent);
                finish();

            }
        });


        divB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(bms.this,fybms_b.class);
                startActivity(intent);
                finish();

            }
        });

        divC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bms.this,fybms_c.class);
                startActivity(intent);
                finish();

            }
        });

        divD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bms.this,fybms_d.class);
                startActivity(intent);
                finish();

            }
        });
    }

    @Override
    public void onBackPressed() {

        Toast.makeText(this, "Back Key Pressed \n Click on Logout Button", Toast.LENGTH_SHORT).show();

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.logout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.logout)
        {
            Intent intent = new Intent(bms.this,HomeActivity.class);
            Toast.makeText(this, "LOGGED OUT SUCCESSFULLY", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();

        }
        return super.onOptionsItemSelected(item);
    }

}
