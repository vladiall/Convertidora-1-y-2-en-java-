package com.example.convertidora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertCurrency(View view) {

        EditText cantidad_pesos = findViewById(R.id.cantidad_pesos);
        String cambio = "0.00116";
        TextView mostrar = findViewById(R.id.mostrar);

        if (!cantidad_pesos.getText().toString().equals("")) {
            Float euroValue = Float.parseFloat(cantidad_pesos.getText().toString()) * Float.parseFloat(cambio);
            mostrar.setText(euroValue + "");
        } else {
            mostrar.setText(R.string.Sin_Valor);
        }
    }
}