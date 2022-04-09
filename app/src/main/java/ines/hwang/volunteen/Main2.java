package ines.hwang.volunteen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        Button btn = findViewById(R.id.feed);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Feed.this, ServicePage.class);
                startActivity(it);
                finish();

            }
        });
        Button btn = findViewById(R.id.home);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Feed.this, ServicePage.class);
                startActivity(it);
                finish();

            }
        });
        Button btn = findViewById(R.id.my);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Feed.this, ServicePage.class);
                startActivity(it);
                finish();

            }
        });
    }
}
