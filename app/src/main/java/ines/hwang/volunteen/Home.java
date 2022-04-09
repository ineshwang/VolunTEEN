package ines.hwang.volunteen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Button btn = findViewById(R.id.homeorganization);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Home.this, ServicePage.class);
                startActivity(it);
                finish();

                Button btn = findViewById(R.id.back);

                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent it = new Intent(Home.this, Main2.class);
                        startActivity(it);
                        finish();

                    }
                });

            }
        });

    }
}

