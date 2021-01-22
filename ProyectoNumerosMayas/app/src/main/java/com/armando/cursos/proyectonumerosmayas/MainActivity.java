package com.armando.cursos.proyectonumerosmayas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumeroParaConvertir;
    public int base2 = 400;
    public int base1 = 20;
    public int base0 = 1;
    public int numeroRestante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumeroParaConvertir = findViewById(R.id.editTextNumeroParaConvertir);
    }

    public void convertirNumero(View view) {
        int numeroAConvertir= Integer.parseInt(editTextNumeroParaConvertir.getText().toString());
        numeroRestante = Integer.parseInt(editTextNumeroParaConvertir.getText().toString());

        int p2 = obtenerNumeroPosicion(numeroRestante, base2);
        int p1 = obtenerNumeroPosicion(numeroRestante, base1);
        int p0 = obtenerNumeroPosicion(numeroRestante, base0);
        Log.i("NUMEROSSSSS", "p2=" + p2 + "|||p1=" + p1 + "|||p0=" + p0);

        Intent intent=new Intent(this,ConversionAMaya.class);
        intent.putExtra("p2",p2);
        intent.putExtra("p1",p1);
        intent.putExtra("p0",p0);
        intent.putExtra("numero",numeroAConvertir);
        startActivity(intent);
    }

    public int obtenerNumeroPosicion(int numero, int base) {
        int pActual = 0;
        if (numero >= base) {
            pActual = numero / base;

        }
        numeroRestante = numero % base;

        return pActual;
    }
}