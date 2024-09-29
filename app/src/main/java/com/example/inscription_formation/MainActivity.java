package com.example.inscription_formation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText, emailEditText, phoneEditText, addressEditText;
    private TextView cityTextView;
    private Button sendButton;

    // Liste des villes
    private String[] cities = {"Agadir", "Casablanca", "Marrakech", "Rabat", "Fès"};
    private int selectedCityIndex = -1;  // Variable to store the selected city's index
    private String selectedCity = "";  // Variable to store the selected city

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialisation des champs
        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        phoneEditText = findViewById(R.id.phoneEditText);
        addressEditText = findViewById(R.id.addressEditText);
        cityTextView = findViewById(R.id.cityTextView);
        sendButton = findViewById(R.id.sendButton);

        // Gestion du clic sur cityTextView pour afficher la boîte de dialogue de sélection unique
        cityTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCitySelectionDialog();
            }
        });

        // Gestion du bouton Envoyer
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NextActivity.class);

                // Envoyer les données saisies vers NextActivity
                intent.putExtra("NAME", nameEditText.getText().toString());
                intent.putExtra("EMAIL", emailEditText.getText().toString());
                intent.putExtra("PHONE", phoneEditText.getText().toString());
                intent.putExtra("ADDRESS", addressEditText.getText().toString());

                // Ajouter la ville sélectionnée à l'intent
                intent.putExtra("CITY", selectedCity);

                startActivity(intent); // Rediriger vers NextActivity
            }
        });
    }

    private void showCitySelectionDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Sélectionnez votre ville");

        builder.setSingleChoiceItems(cities, selectedCityIndex, (dialog, which) -> {
            selectedCityIndex = which;  // Mettre à jour l'indice de la ville sélectionnée
            selectedCity = cities[which];  // Mettre à jour le nom de la ville sélectionnée
        });

        // Bouton OK
        builder.setPositiveButton("OK", (dialog, which) -> cityTextView.setText(selectedCity));

        // Bouton Annuler
        builder.setNegativeButton("Annuler", (dialog, which) -> dialog.dismiss());

        builder.show();
    }
}
