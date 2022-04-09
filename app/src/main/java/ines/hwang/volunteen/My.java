package ines.hwang.volunteen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class My extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my);
        Button btn = findViewById(R.id.profile_edit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(My.this, Profile.class);
                startActivity(it);
                finish();

            }
        });
        Button etn = findViewById(R.id.share);

        etn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(My.this, Share.class);
                startActivity(it);
                finish();

            }
        });
        Button dtn = findViewById(R.id.statistics);

        dtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(My.this, Statistics.class);
                startActivity(it);
                finish();

            }
        });
        Button ctn = findViewById(R.id.access);

        ctn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(My.this, Access.class);
                startActivity(it);
                finish();

            }
        });

        Button atn = findViewById(R.id.back);

        atn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(My.this, Main2.class);
                startActivity(it);
                finish();

            }
        });
    }
}
