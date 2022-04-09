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

                Intent it = new Intent(Main2.this, Feed.class);
                startActivity(it);
                finish();

            }
        });
        Button atn = findViewById(R.id.home);

        atn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Main2.this, Home.class);
                startActivity(it);
                finish();

            }
        });
        Button ctn = findViewById(R.id.my);

        ctn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Main2.this, My.class);
                startActivity(it);
                finish();

            }
        });
    }
}
