package com.example.activity_main.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.activity_main.Controller.ControllerPais;
import com.example.activity_main.R;

public class MainActivity extends AppCompatActivity {

    private Button btSincronizar;

    private Button btExibir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btExibir = findViewById(R.id.btExibir);
        btSincronizar = findViewById(R.id.btSincronizar);
        btSincronizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ControllerPais.getViaPais(MainActivity.this);
            }
        });

        btExibir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, lista_activity.class);
                startActivity(intent);
            }
        });
    }
}