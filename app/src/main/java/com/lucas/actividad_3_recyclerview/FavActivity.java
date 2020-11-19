package com.lucas.actividad_3_recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FavActivity extends AppCompatActivity {

    private ArrayList mascotaList;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav);
        Toolbar actionBar = (Toolbar) findViewById(R.id.layoutActionBar);
        setSupportActionBar(actionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        inicializaMascotas();

        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerViewFav);
        this.recyclerView.setHasFixedSize(true);
        this.layoutManager = new LinearLayoutManager(this);
        this.recyclerView.setLayoutManager(this.layoutManager);
        this.adapter = new MascotaAdapter(this.mascotaList);
        this.recyclerView.setAdapter(this.adapter);
    }

    private void inicializaMascotas() {
        this.mascotaList = new ArrayList();
        this.mascotaList.add(new Mascota(R.drawable.perro, "perro", 0));
        this.mascotaList.add(new Mascota(R.drawable.gato, "gato", 0));
        this.mascotaList.add(new Mascota(R.drawable.raton, "raton", 0));
        this.mascotaList.add(new Mascota(R.drawable.conejo, "conejo", 0));
        this.mascotaList.add(new Mascota(R.drawable.pez, "pez", 0));
    }
}
