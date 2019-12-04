package com.example.sez.lalaattendance;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.sez.lalaattendance.Adapters.AttendanceAdapter;
import com.example.sez.lalaattendance.Classes.AttendanceClass;
import com.example.sez.lalaattendance.Classes.ViewSubjectsClass;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bscit_sy extends AppCompatActivity {
    RecyclerView recyclerView;
    Spinner dropdown_subject;
    Button btn_GetAttendance;


    private static String URL = "https://script.google.com/macros/s/AKfycbz8d1T1jWyUt_5mB39k1BbqYjVc-ad2olQ_d3uHAW-1mxY2QILV/exec";

    private WebView webView;
    private TextView mTextMessage;
    public String itemSelected;
    ArrayAdapter<ViewSubjectsClass> arrayAdapter;
    List<ViewSubjectsClass> ViewSubject;
    List<AttendanceClass> ViewAttendance;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bscit_sy);

        mTextMessage = ( TextView ) findViewById(R.id.message);
        ///recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        //dropdown_subject = (Spinner)findViewById(R.id.dropdown_subject);

    }

    private void AssignSubject() {
        ViewSubject = new ArrayList<>();

        ViewSubjectsClass opt = new ViewSubjectsClass("Select Subject ");
        ViewSubject.add(opt);
        ViewSubjectsClass COST = new ViewSubjectsClass("COST ");
        ViewSubject.add(COST);
        ViewSubjectsClass ES = new ViewSubjectsClass("ES");
        ViewSubject.add(ES);
        ViewSubjectsClass JAVA = new ViewSubjectsClass("JAVA ");
        ViewSubject.add(JAVA);
        ViewSubjectsClass SE = new ViewSubjectsClass("SE");
        ViewSubject.add(SE);
        ViewSubjectsClass CG = new ViewSubjectsClass("CG");
        ViewSubject.add(CG);

        arrayAdapter = new ArrayAdapter<ViewSubjectsClass>(this, android.R.layout.simple_spinner_item, ViewSubject);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown_subject.setAdapter(arrayAdapter);


    }

    public void onBackPressed() {

        Toast.makeText(this, "Click on Home Button to go back", Toast.LENGTH_SHORT).show();

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bscit_status,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.present)
        {
            webView = (WebView)findViewById(R.id.webView);

            WebSettings webSettings = webView.getSettings();

            webSettings.setJavaScriptEnabled(true);
            webView.getSettings().setLoadWithOverviewMode(true);
            webView.getSettings().setUseWideViewPort(true);
            webView.setScrollbarFadingEnabled(false);
            webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
            //  webView.getSettings().setBuiltInZoomControls(true);
            webView.setWebViewClient(new WebViewClient());

            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSeqUASbdJB9UR5eZHjycNRRYcgrzw-oIJ4NBC9yoGGWLYXXdA/viewform");
            Toast.makeText(bscit_sy.this, "SYBSCIT PRESENT SELECTED", Toast.LENGTH_SHORT).show();

        }
        if(id == R.id.sheet)
        {

            String url = "https://docs.google.com/spreadsheets/d/1b8_GB9cWXXgqj4FNbpVITuA2dVCPcHMtxKI0EPt6HQs/edit#gid=1812594054";
//            Intent i = new Intent(Intent.ACTION_VIEW);
//            i.setData(Uri.parse(url));
//            startActivity(i);

            //To be used for Volley Spreadsheet
            //RecyclerView wv1 = (RecyclerView) view.findViewById(R.id.recyclerView);
            //btn_GetAttendance = (Button)view.findViewById(R.id.btn_GetAttendance);
            //dropdown_subject = (Spinner)view.findViewById(R.id.dropdown_subject);
            AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);
            LayoutInflater inflater = this.getLayoutInflater();
            View view = inflater.inflate(R.layout.sheet,null);
            WebView wv = (WebView) view.findViewById(R.id.view);
            TextView tv = (TextView) view.findViewById(R.id.layer);
            alertBuilder.setView(view);
            final AlertDialog dialog = alertBuilder.create();
            dialog.show();
            WebSettings webSettings = wv.getSettings();

            webSettings.setJavaScriptEnabled(true);
            wv.getSettings().setLoadWithOverviewMode(true);
            wv.getSettings().setUseWideViewPort(true);
            wv.setScrollbarFadingEnabled(false);
            wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
            //  webView.getSettings().setBuiltInZoomControls(true);
            wv.setWebViewClient(new WebViewClient());

            wv.loadUrl(url);
            //
//            AssignSubject();
//            btn_GetAttendance.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(final View view) {
//                    ViewSubjectsClass subject = (ViewSubjectsClass)dropdown_subject.getSelectedItem();
//                    itemSelected = subject.getSubject().toString();
//                    Snackbar.make(view,"Subject: " + itemSelected,Snackbar.LENGTH_SHORT).show();
//
//                    StringRequest stringRequest = new StringRequest(Request.Method.GET, "https://script.google.com/macros/s/AKfycbz8d1T1jWyUt_5mB39k1BbqYjVc-ad2olQ_d3uHAW-1mxY2QILV/exec?action=getItems&divis="+itemSelected,
//                            new Response.Listener<String>() {
//                                @Override
//                                public void onResponse(String response) {
//                                    try {
//                                        Log.d("DATA",response);
//
//                                        JSONObject jsonObject = new JSONObject(response);
//                                        String success = jsonObject.getString("items");
//                                        JSONArray login = jsonObject.getJSONArray("items");
//                                        if(jsonObject.names().get(0).equals("items"))
//                                        {
//                                            Log.d("INSIDE_DATA",success);
//                                            for(int i = 0;i< login.length() ; i++) {
//                                                JSONObject object = login.getJSONObject(i);
//                                                Log.d("LOGIN_LENGTH: ", String.valueOf(login.length()));
//                                                Log.d("LOGIN1: "+ i,object.getString("Col1"));
//                                                Log.d("LOGIN2: "+ i,object.getString("Col2"));
//                                                Log.d("LOGIN3: "+ i,object.getString("Col3"));
//                                                ViewAttendance.add(new AttendanceClass(
//                                                     object.getString("Col1"),
//                                                        object.getString("Col2"),
//                                                        object.getString("Col3")
//                                                ));
//                                                AttendanceAdapter adapter = new AttendanceAdapter(getApplicationContext(), ViewAttendance);
//                                                recyclerView.setAdapter(adapter);
//                                            }
//
//
//                                        }
//
//                                        else
//                                        {
//                                            Snackbar.make(view,"Failed  to get Attendance",Snackbar.LENGTH_SHORT).show();
//                                        }
//
//                                    }catch(Exception e)
//                                    {
//                                        Toast.makeText(bscit_sy.this, "Error: " + e.toString(), Toast.LENGTH_SHORT).show();
//
//                                    }
//                                }
//                            }, new Response.ErrorListener() {
//                        @Override
//                        public void onErrorResponse(VolleyError error) {
//                            Toast.makeText(bscit_sy.this, "Error: " + error.toString(), Toast.LENGTH_SHORT).show();
//
//                        }
//                    })
//                    {
//                        @Override
//                        protected Map<String, String> getParams() throws AuthFailureError {
//                            Map<String,String> params = new HashMap<>();
//                            params.put("divis",itemSelected);
//                            params.put("action","getItems");
//                            return params;
//                        }
//                    };
//                    RequestQueue requestQueue = Volley.newRequestQueue(bscit_sy.this);
//                    requestQueue.add(stringRequest);
//
//
//
//                }
//            });
//            dropdown_subject.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                @Override
//                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                    itemSelected  = adapterView.getItemAtPosition(i).toString();
//                    Snackbar.make(view,"Subject: " + itemSelected,Snackbar.LENGTH_SHORT).show();
//                }
//            });

            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });








            Toast.makeText(bscit_sy.this, "SYBSCIT ONLINE SHEET SELECTED", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.navigation_home)
        {
            Intent ii = new Intent(getApplicationContext(),bscit.class);
            startActivity(ii);
        }
        return super.onOptionsItemSelected(item);
    }
}
