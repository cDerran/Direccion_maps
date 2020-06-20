package com.example.direccion_maps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText la, lo;
    EditText la2, lo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn_puntos);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                la = (EditText) findViewById(R.id.latitud);
                lo = (EditText) findViewById(R.id.longitud);

                la2 = (EditText) findViewById(R.id.latitud2);
                lo2 = (EditText) findViewById(R.id.longitud2);

                i.putExtra("latitud", la.getText().toString());
                i.putExtra("longitud", lo.getText().toString());

                i.putExtra("latitud2", la2.getText().toString());
                i.putExtra("longitud2", lo2.getText().toString());
                startActivity(i);
            }
        });


    }
}
