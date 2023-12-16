package com.example.activity_main.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.activity_main.Adapter.adapter_Pais;
import com.example.activity_main.Controller.ControllerPais;
import com.example.activity_main.Model.Pais;
import com.example.activity_main.R;

import java.util.ArrayList;

public class lista_activity extends AppCompatActivity {
    private ControllerPais controller;
    private RecyclerView rvPais;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        rvPais = findViewById(R.id.rvPais);
        carregarListadePaisesCadastrados();
    }
    private void carregarListadePaisesCadastrados(){
        ArrayList<Pais> listaPais = controller.retornar(this);
        adapter_Pais adapter = new adapter_Pais(this, listaPais);

        rvPais.setLayoutManager(new LinearLayoutManager(this));
        rvPais.setAdapter(adapter);
    }
}

