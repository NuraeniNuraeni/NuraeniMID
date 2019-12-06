package com.example.nuraeni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nuraeni extends AppCompatActivity {
Button lanjut1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuraeni);
        lanjut1 = findViewById(R.id.lanjut1);
        lanjut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(nuraeni.this,eni.class);
                startActivity(i);
                finish();
            }
        });
    }
}
