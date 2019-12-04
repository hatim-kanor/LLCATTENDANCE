package com.example.sez.lalaattendance;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.nio.file.attribute.BasicFileAttributes;

public class baf extends AppCompatActivity {
    Button fy,sy,ty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baf);

        fy = (Button)findViewById(R.id.fy);
        sy = (Button)findViewById(R.id.sy);
        ty = (Button)findViewById(R.id.ty);

        fy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               AlertDialog dialog = new AlertDialog.Builder(baf.this)
                        .setTitle("Please Select Division")
                        .setMessage("SELECT Division ")
                        .setPositiveButton("Div A",null)
                        .setNegativeButton("Div B",null)
                        .show();

                Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
               positiveButton.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent intent = new Intent(baf.this,baf_fyA.class);
                       startActivity(intent);
                       finish();



                   }
               });

               Button negativeButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
               negativeButton.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent intent11 = new Intent(baf.this,baf_fyB.class);
                       startActivity(intent11);
                       finish();
                   }
               });
            }
        });
        sy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(baf.this,baf_sy.class);
                startActivity(intent);
                finish();
            }
        });
        ty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(baf.this,baf_ty.class);
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
            Intent intent = new Intent(baf.this,HomeActivity.class);
            Toast.makeText(this, "LOGGED OUT SUCCESSFULLY", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();

        }
        return super.onOptionsItemSelected(item);
    }

}
