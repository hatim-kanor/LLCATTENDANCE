package com.example.sez.lalaattendance;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

public class fybscit_practical extends AppCompatActivity {


    private WebView webView;
    private TextView mTextMessage;
    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fybscit_practical);

        mTextMessage = ( TextView ) findViewById(R.id.message);
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
//        if(id == R.id.present)
//        {
//            webView = (WebView)findViewById(R.id.webView);
//
//            WebSettings webSettings = webView.getSettings();
//
//            webSettings.setJavaScriptEnabled(true);
//            webView.getSettings().setLoadWithOverviewMode(true);
//            webView.getSettings().setUseWideViewPort(true);
//            webView.setScrollbarFadingEnabled(false);
//            webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
//            //  webView.getSettings().setBuiltInZoomControls(true);
//            webView.setWebViewClient(new WebViewClient());
//
//            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfZo-BUMBEjFtsR5dV3b-y3fJY2d4Kj3neAjuaA5CqJyoNT4A/viewform");
//            Toast.makeText(bscit_ty.this, "FYBSCIT PRESENT SELECTED", Toast.LENGTH_SHORT).show();
//
//        }
//        if(id == R.id.sheet)
//        {
//
//            String url = "https://docs.google.com/spreadsheets/d/1idYbyBkE8DRDILapb7lQt0iQ_k_9eSfDn4UmEW-fU-I/edit#gid=952551949";
//            Intent i = new Intent(Intent.ACTION_VIEW);
//            i.setData(Uri.parse(url));
//            startActivity(i);
//
//
//
//
//            Toast.makeText(bscit_ty.this, "FYBSCIT ONLINE SHEET SELECTED", Toast.LENGTH_SHORT).show();
//        }
        return super.onOptionsItemSelected(item);
    }


}
