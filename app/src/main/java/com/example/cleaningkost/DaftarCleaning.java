package com.example.cleaningkost;


import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DaftarCleaning extends AppCompatActivity{
    private Object logo_register;
    private View id_hi;
    private View id_selamatdatang;
    private View komplit;
    private View btn_komplit;
    private View KM;
    private View kmr;
    private View id_kalimat;
    private View btn_KM;
    private  View btn_kmr;
    private Object cleaningkost;
    private Object DaftarCleaning;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar_cleaning);
        logo_register = findViewById(R.id.logo_register);
        id_hi = findViewById(R.id.id_hi);
        id_selamatdatang = findViewById(R.id.id_selamatdatang);
        komplit = findViewById(R.id.komplit);
        KM = findViewById(R.id.KM);
        kmr = findViewById(R.id.kmr);
        id_kalimat = findViewById(R.id.id_kalimat);
        btn_komplit = findViewById(R.id.btn_komplit);
        btn_KM = findViewById(R.id.btn_KM);
        btn_kmr = findViewById(R.id.btn_kmr);
        Bundle bundle = getIntent().getExtras();
        if (bundle !=null){
            cleaningkost = (cleaningkost) bundle.get("cleaning kost");
            if (cleaningkost != null){
                this.DaftarCleaning(cleaningkost());
            }
        }
        btn_kmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onSaveInstanceState();
            }
        });


    }

