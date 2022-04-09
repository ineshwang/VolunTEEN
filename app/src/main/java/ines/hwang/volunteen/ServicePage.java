package ines.hwang.volunteen;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

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
        Button atn = findViewById(R.id.web);

        atn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(ServicePage.this, WebView.class);
                startActivity(it);
                finish();

            }
        });
    }
}
