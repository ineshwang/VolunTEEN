package ines.hwang.volunteen;

import android.Manifest;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class ServicePage extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.servicepage);
        Button etn = findViewById(R.id.call);

        etn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(ServicePage.this, Call.class);
                startActivity(it);
                finish();

                Button call = findViewById(R.id.call);
                call.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String number = "01085043145";
                        if (ContextCompat.checkSelfPermission(ServicePage.this, Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_GRANTED) {
                            Intent it = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + number));
                            startActivity(it);
                        } else {
                            ActivityCompat.requestPermissions(
                                    ServicePage.this,
                                    new String[]{Manifest.permission.CALL_PHONE},
                                    123);
                        }
                    }
                });

            }
        });
        Button ctn = findViewById(R.id.chat);

        ctn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(ServicePage.this, Chat.class);
                startActivity(it);
                finish();

            }
        });
        WebView atn = findViewById(R.id.webview);

        atn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView.loadUrl("https://www.google.com/");
                WebSettings webSettings = WebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                WebView.setWebViewClient(new WebViewClient());
            }
        });

    }
}
