package com.example.m32work;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {

    private TextView namePersonContact;

    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        namePersonContact = itemView.findViewById(R.id.buttonText);
    }

    public void onBind(String nameContact) {
        namePersonContact.setText(nameContact);
    }
}
