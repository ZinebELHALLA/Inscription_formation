package com.example.inscription_formation;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class NextActivity extends AppCompatActivity {

    private TextView resultsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        resultsTextView = findViewById(R.id.resultsTextView);

        // Récupérer les données envoyées par MainActivity
        String name = getIntent().getStringExtra("NAME");
        String email = getIntent().getStringExtra("EMAIL");
        String phone = getIntent().getStringExtra("PHONE");
        String address = getIntent().getStringExtra("ADDRESS");

        // Récupérer la ville sélectionnée
        String city = getIntent().getStringExtra("CITY");

        // Afficher les résultats dans le TextView
        String results = "Nom: " + name + "\nEmail: " + email + "\nTéléphone: " + phone +
                "\nAdresse: " + address + "\nVille: " + city;
        resultsTextView.setText(results);
    }
}
