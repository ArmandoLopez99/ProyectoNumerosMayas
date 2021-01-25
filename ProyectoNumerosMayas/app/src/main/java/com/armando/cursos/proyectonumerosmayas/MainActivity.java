package com.armando.cursos.proyectonumerosmayas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void abrirConversionADecimal(View view) {
        Intent intent=new Intent(this,ConversionADecimal.class);

        startActivity(intent);
    }
    public void abrirConversionAMaya(View view) {
        Intent intent=new Intent(this,ConversionAMaya.class);

        startActivity(intent);
    }
    public void abrirAyuda(View v){
        Intent intent=new Intent(this,Ayuda.class);

        startActivity(intent);
    }

}