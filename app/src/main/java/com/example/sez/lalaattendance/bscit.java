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

public class bscit extends AppCompatActivity {
    Button fy,sy,ty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bscit);

        fy = (Button)findViewById(R.id.fy);
        sy = (Button)findViewById(R.id.sy);
        ty = (Button)findViewById(R.id.ty);

        fy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog dialog = new AlertDialog.Builder(bscit.this)
                        .setTitle("FY BSCIT SELECTED ")
                        .setMessage("SELECT ATTENDANCE TYPE: ")
                        .setPositiveButton("THEORY",null)
                        .setNegativeButton("PRACTICAL",null)
                        .show();

                Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
               positiveButton.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent intent = new Intent(bscit.this,bscit_fy.class);
                       intent.putExtra("action","FY");
                       intent.putExtra("Div","THEORY");
                       startActivity(intent);
                       finish();



                   }
               });

               Button negativeButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
               negativeButton.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
//                       Intent intent11 = new Intent(bscit.this,fybscit_practical.class);
//                       intent11.putExtra("action","FY");
//                       intent11.putExtra("Div","PRACTICAL");
//                       startActivity(intent11);
//                       finish();
                       Toast.makeText(bscit.this, "Practical Schedule Not Updated\n Kindly Contact HOD", Toast.LENGTH_SHORT).show();
                   }
               });


            }
        });
        sy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog dialog = new AlertDialog.Builder(bscit.this)
                        .setTitle("SY BSCIT SELECTED ")
                        .setMessage("SELECT ATTENDANCE TYPE: ")
                        .setPositiveButton("THEORY",null)
                        .setNegativeButton("PRACTICAL",null)
                        .show();

                Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
                positiveButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(bscit.this,bscit_sy.class);
                        intent.putExtra("action","SY");
                        intent.putExtra("Div","THEORY");
                        startActivity(intent);
                        finish();

                    }
                });

                Button negativeButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
                negativeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        Intent intent11 = new Intent(bscit.this,sybscit_practical.class);
//                        intent11.putExtra("action","SY");
//                        intent11.putExtra("Div","PRACTICAL");
//                        startActivity(intent11);
//                        finish();
                        Toast.makeText(bscit.this, "Practical Schedule Not Updated\n Kindly Contact HOD", Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });
        ty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog dialog = new AlertDialog.Builder(bscit.this)
                        .setTitle("TY BSCIT SELECTED ")
                        .setMessage("SELECT ATTENDANCE TYPE: ")
                        .setPositiveButton("THEORY",null)
                        .setNegativeButton("PRACTICAL",null)
                        .show();

                Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
                positiveButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(bscit.this,bscit_ty.class);
                        intent.putExtra("action","TY");
                        intent.putExtra("Div","THEORY");
                        startActivity(intent);
                        finish();

                    }
                });

                Button negativeButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
                negativeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        Intent intent11 = new Intent(bscit.this,tybscit_practical.class);
//                        startActivity(intent11);
//                        intent11.putExtra("action","TY");
//                        intent11.putExtra("Div","PRATICAL");
//                        finish();
                        Toast.makeText(bscit.this, "Practical Schedule Not Updated\n Kindly Contact HOD", Toast.LENGTH_SHORT).show();
                    }
                });


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
            Intent intent = new Intent(bscit.this,HomeActivity.class);
            Toast.makeText(this, "LOGGED OUT SUCCESSFULLY", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();

        }
        return super.onOptionsItemSelected(item);
    }
}
