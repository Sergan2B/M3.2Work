package com.example.m32work;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycleViewSecond;
    private ArrayList<String> namePersonContact = new ArrayList<>();
    private AdapterPerson adapterPersonContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recycleViewSecond = findViewById(R.id.recycleViewSecond);
        loadData();
        adapterPersonContact = new AdapterPerson(namePersonContact);
        recycleViewSecond.setAdapter(adapterPersonContact);
    }

    private void loadData() {
        namePersonContact.add("Leona");
        namePersonContact.add("Reona");
        namePersonContact.add("Tramp");
        namePersonContact.add("Stalin");
        namePersonContact.add("Oda");
        namePersonContact.add("Abubakir");
        namePersonContact.add("Shakhid");
        namePersonContact.add("Miku");
        namePersonContact.add("2B");
        namePersonContact.add("Francia");
        namePersonContact.add("Mehmed");
        namePersonContact.add("Ahmed");
        namePersonContact.add("Suleiman");
        namePersonContact.add("Petr");
        namePersonContact.add("Artoria");
        namePersonContact.add("Islam");
        namePersonContact.add("Mendeleev");
        namePersonContact.add("Verevka");
    }
}