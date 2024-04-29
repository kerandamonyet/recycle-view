package com.universitaskuningan.recycle_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements KontakAdapter.OnContactClickListener {
    private RecyclerView rv;
    private KontakAdapter contactAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<Kontak> listContact = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rvContact);

        // Menambahkan data kontak
        addDummyData();

        // Inisialisasi adapter dan layout manager
        contactAdapter = new KontakAdapter(listContact);
        contactAdapter.setListener(this);
        layoutManager = new LinearLayoutManager(getApplicationContext());

        // Mengatur adapter dan layout manager pada RecyclerView
        rv.setAdapter(contactAdapter);
        rv.setLayoutManager(layoutManager);
    }

    // Metode untuk menambahkan data kontak dummy
    private void addDummyData() {
        listContact.add(new Kontak("Iron Man",
                "081312700100",
                "https://cdn4.iconfinder.com/data/icons/famous-characters-add-on-vol-1-flat/48/Famous_Character_-_Add_On_1-14-512.png"));
        listContact.add(new Kontak("Bat Man",
                "089606941238",
                "https://cdn4.iconfinder.com/data/icons/famous-characters-add-on-vol-1-flat/48/Famous_Character_-_Add_On_1-22-512.png"));
        listContact.add(new Kontak("Bat Man",
                "089606941238",
                "https://cdn4.iconfinder.com/data/icons/famous-characters-add-on-vol-1-flat/48/Famous_Character_-_Add_On_1-22-512.png"));
        listContact.add(new Kontak("Groot",
                "08988798768",
                "https://cdn4.iconfinder.com/data/icons/famous-characters-add-on-vol-1-flat/48/Famous_Character_-_Add_On_1-21-512.png"));
        listContact.add(new Kontak("Sonic",
                "08766588798",
                "https://cdn4.iconfinder.com/data/icons/famous-characters-add-on-vol-1-flat/48/Famous_Character_-_Add_On_1-26-512.png"));
    }

    // Implementasi metode dari interface OnContactClickListener
    @Override
    public void onClick(View view, int position) {
        Kontak kontak = listContact.get(position);
        Toast.makeText(this, kontak.getNama(), Toast.LENGTH_LONG).show();
    }
}
