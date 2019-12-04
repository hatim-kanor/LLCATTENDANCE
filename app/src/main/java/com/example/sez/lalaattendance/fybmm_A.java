package com.example.sez.lalaattendance;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

public class fybmm_A extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fybmm_a);
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

            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSeKZ66GLvQijCRFJNjkISpRj3UPMKNrlXkCoDl1Q_GUUKoaXg/viewform");
            Toast.makeText(fybmm_A.this, "FY BMM PRESENT SELECTED", Toast.LENGTH_SHORT).show();

        }
        if(id == R.id.sheet)
        {

            String url = "https://docs.google.com/spreadsheets/d/1K-PVkrWTmLiLLiM9B8uErkaDH9ImEhEdal3abRI3zAE/edit#gid=950792616";
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

            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });








            Toast.makeText(fybmm_A.this, "FY BMM ONLINE SHEET SELECTED", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.navigation_home)
        {
            Intent ii = new Intent(getApplicationContext(),bmm.class);
            startActivity(ii);
        }
        return super.onOptionsItemSelected(item);
    }


}
