package com.example.sez.lalaattendance;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class bmm extends AppCompatActivity {

    Button fy,sy,ty,advt,jour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmm);

        fy = (Button)findViewById(R.id.fy);
        sy = (Button)findViewById(R.id.sy);
        ty = (Button)findViewById(R.id.ty);
//        advt = (Button)findViewById(R.id.ty_advt);
//        jour = (Button)findViewById(R.id.ty_jour);

        fy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog dialog = new AlertDialog.Builder(bmm.this)
                        .setTitle("Please Select Division")
                        .setMessage("SELECT Division ")
                        .setPositiveButton("Div A",null)
                        .setNegativeButton("Div B",null)
                        .show();

                Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
                positiveButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(bmm.this,fybmm_A.class);
                        startActivity(intent);
                        finish();



                    }
                });

                Button negativeButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
                negativeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent11 = new Intent(bmm.this,fybmm_B.class);
                        startActivity(intent11);
                        finish();
                    }
                });
            }
        });

        sy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(bmm.this,sybmm.class);
                startActivity(intent1);
                finish();
            }
        });

        ty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog dialog = new AlertDialog.Builder(bmm.this)
                        .setTitle("Please Select Division")
                        .setMessage("Select Division ")
                        .setPositiveButton("TY BMM",null)
                        .setNegativeButton("ADVT",null)
                        .setNeutralButton("JOURNO",null)
                        .show();

                Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
                positiveButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(bmm.this,tybmm.class);
                        startActivity(intent);
                        finish();



                    }
                });

                Button negativeButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
                negativeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent11 = new Intent(bmm.this,tybmm_advt.class);
                        startActivity(intent11);
                        finish();
                    }
                });
                Button neutralButton = dialog.getButton(AlertDialog.BUTTON_NEUTRAL);
                neutralButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent11 = new Intent(bmm.this,tybmm_journalism.class);
                        startActivity(intent11);
                        finish();
                    }
                });
            }
        });

//        advt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent3 = new Intent(bmm.this,tybmm_advt.class);
//                startActivity(intent3);
//                finish();
//            }
//        });
//
//        jour.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent4 = new Intent(bmm.this,tybmm_journalism.class);
//                startActivity(intent4);
//                finish();
//            }
//        });


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
            Intent intent = new Intent(bmm.this,HomeActivity.class);
            Toast.makeText(this, "LOGGED OUT SUCCESSFULLY", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();

        }
        return super.onOptionsItemSelected(item);
    }

}
