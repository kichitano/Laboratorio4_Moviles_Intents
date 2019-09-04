package com.example.intents_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_llamar = findViewById(R.id.btn_call);
        Button btn_location = findViewById(R.id.btn_location);

        btn_llamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri number = Uri.parse("tel: 996522055");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
            }
        });

        btn_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri location = Uri.parse("geo:0,0?q=Universidad+Privada+de+Tacna+Granada,+Tacna");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                startActivity(mapIntent);
            }
        });
    }
}
