package com.armando.cursos.proyectonumerosmayas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ConversionAMaya extends AppCompatActivity {
    TextView TextViewp2;
    TextView TextViewp1;
    TextView TextViewp0;
    TextView TextViewResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_a_maya);
        Intent intent=getIntent();
        int p2=intent.getExtras().getInt("p2");
        int p1=intent.getExtras().getInt("p1");
        int p0=intent.getExtras().getInt("p0");
        int numero=intent.getExtras().getInt("numero");

        TextViewp2=findViewById(R.id.textViewP2);
        TextViewp2.setText(String.valueOf(p2));

        TextViewp1=findViewById(R.id.textViewP1);
        TextViewp1.setText(String.valueOf(p1));

        TextViewp0=findViewById(R.id.textViewP0);
        TextViewp0.setText(String.valueOf(p0));

        TextViewResultado=findViewById(R.id.resultado);
        TextViewResultado.setText(String.valueOf(numero));
        if (p2 != 0) {
            Toast.makeText(this, "p2:" + p2 + "|||p1:" + p1 + ",|||p0:" + p0, Toast.LENGTH_LONG).show();
        } else if (p1 != 0)
            Toast.makeText(this, "p1:" + p1 + ",|||p0:" + p0, Toast.LENGTH_LONG).show();
        else {
            Toast.makeText(this, "p0:" + p0, Toast.LENGTH_LONG).show();
        }


    }
}