package ines.hwang.volunteen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button btn = findViewById(R.id.parent);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Login.this, Login2.class);
                startActivity(it);
                finish();

            }
        });
        Button atn = findViewById(R.id.student);

        atn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Login.this, Login2.class);
                startActivity(it);
                finish();

            }
        });
        Button ctn = findViewById(R.id.service_organization);

        ctn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Login.this, Login2.class);
                startActivity(it);
                finish();

            }
        });
    }
}
