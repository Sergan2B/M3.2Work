package com.example.m32work;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterPerson extends RecyclerView.Adapter<PersonViewHolder> {
    private ArrayList<String> namePersonContact;

    public AdapterPerson(ArrayList<String> namePersonContact) {
        this.namePersonContact = namePersonContact;
    }
    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PersonViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_holder_people, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        holder.onBind(namePersonContact.get(position));
    }

    @Override
    public int getItemCount() {
        return namePersonContact.size();
    }
}
