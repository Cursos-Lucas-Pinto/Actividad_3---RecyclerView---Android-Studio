package com.lucas.actividad_3_recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List mascotaList;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar actionBar = (Toolbar) findViewById(R.id.layoutActionBar);
        setSupportActionBar(actionBar);
        inicializaMascotas();
        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerViewMain);
        this.recyclerView.setHasFixedSize(true);
        this.layoutManager = new LinearLayoutManager(this);
        this.recyclerView.setLayoutManager(this.layoutManager);
        this.adapter = new MascotaAdapter(this.mascotaList);
        this.recyclerView.setAdapter(this.adapter);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    private void inicializaMascotas() {
        this.mascotaList = new ArrayList();
        this.mascotaList.add(new Mascota(R.drawable.perro, "perro", 0));
        this.mascotaList.add(new Mascota(R.drawable.gato, "gato", 0));
        this.mascotaList.add(new Mascota(R.drawable.raton, "raton", 0));
        this.mascotaList.add(new Mascota(R.drawable.conejo, "conejo", 0));
        this.mascotaList.add(new Mascota(R.drawable.pez, "pez", 0));
        this.mascotaList.add(new Mascota(R.drawable.oso, "oso", 0));
    }

    public void onMenuItemClick(MenuItem item) {
        if (item.getItemId() == R.id.action_view_fav) {
            goToFavActivity();
        }
    }
    public void goToFavActivity() {
        Intent intent = new Intent(this, FavActivity.class);
        startActivity(intent);
    }
}
