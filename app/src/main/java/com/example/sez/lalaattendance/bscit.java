package com.example.sez.lalaattendance;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class bscit extends AppCompatActivity {
    Button fy,sy,ty;
    LinearLayout fy_pracs;
    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bscit);

        fy = (Button)findViewById(R.id.fy);
        sy = (Button)findViewById(R.id.sy);
        ty = (Button)findViewById(R.id.ty);
        fy_pracs = (LinearLayout)findViewById(R.id.fy_pracs);
        b1 = (Button)findViewById(R.id.fy_b1);
        b2 = (Button)findViewById(R.id.fy_b2);
        fy_pracs.setVisibility(View.GONE);
        fy.setText("FY IT");

        fy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog dialog = new AlertDialog.Builder(bscit.this)
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
                       fy_pracs.setVisibility(View.VISIBLE);
                       fy.setText("FY PRACS");
                       dialog.dismiss();

                   }
               });


            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ib1 = new Intent(bscit.this,fybscit_practical.class);
                ib1.putExtra("Batch","B1");
                startActivity(ib1);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ib2 = new Intent(bscit.this,fybscit_practical.class);
                ib2.putExtra("Batch","B2");
                startActivity(ib2);
                finish();
            }
        });

        sy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fy_pracs.setVisibility(View.GONE);
                fy.setText("FY IT");
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
                fy_pracs.setVisibility(View.GONE);
                fy.setText("FY IT");
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
