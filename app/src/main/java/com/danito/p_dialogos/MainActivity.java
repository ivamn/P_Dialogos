package com.danito.p_dialogos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bIniciar = findViewById(R.id.botonIniciar);
        bIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater = MainActivity.this.getLayoutInflater();
                View dialogView = inflater.inflate(R.layout.alta_usuario, null);
                builder.setView(dialogView);
                Button bCrear = dialogView.findViewById(R.id.botonCrear);
                bCrear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "Se creará la cuenta", Toast.LENGTH_LONG).show();
                    }
                });

                Button bEntrar = dialogView.findViewById(R.id.botonEntrar);
                bEntrar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "Se iniciará la aplicación", Toast.LENGTH_LONG).show();
                    }
                });
                builder.show();
            }
        });
    }
}
