package com.armando.cursos.proyectonumerosmayas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class ConversionAMaya extends AppCompatActivity {
    TextView numeroP2;
    TextView resultadoP2;

    TextView numeroP1;
    TextView resultadoP1;

    TextView numeroP0;
    TextView resultadoP0;

    TextView resultadoTotal;

    ImageView imageViewP2;
    ImageView imageViewP1;
    ImageView imageViewP0;

    TableRow layoutP2;
    TableRow layoutP1;
    TableRow layoutP0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_a_maya);
        //Recibir datos del activity
        Intent intent=getIntent();
        int p2=intent.getExtras().getInt("p2");
        int p1=intent.getExtras().getInt("p1");
        int p0=intent.getExtras().getInt("p0");
        int numero=intent.getExtras().getInt("numero");
        asignarValores(p2,p1,p0,numero);
        actualizarImagenesNumeros(p2,p1,p0);
        if (p2 != 0) {
            Toast.makeText(this, "p2:" + p2 + "|||p1:" + p1 + ",|||p0:" + p0, Toast.LENGTH_LONG).show();


        } else if (p1 != 0) {
            Toast.makeText(this, "p1:" + p1 + ",|||p0:" + p0, Toast.LENGTH_LONG).show();
            layoutP2 = findViewById(R.id.layoutP2);
            layoutP2.setVisibility(View.INVISIBLE);
        }

        else {
            Toast.makeText(this, "p0:" + p0, Toast.LENGTH_LONG).show();
            layoutP2 = findViewById(R.id.layoutP2);
            layoutP2.setVisibility(View.INVISIBLE);
            layoutP1 = findViewById(R.id.layoutP1);
            layoutP1.setVisibility(View.INVISIBLE);


        }


    }

    private void actualizarImagenesNumeros(int p2,int p1, int p0) {
        imageViewP2=findViewById(R.id.imageViewP2);
        imageViewP1=findViewById(R.id.imageViewP1);
        imageViewP0=findViewById(R.id.imageViewP0);

        seleccionarImagen(imageViewP2,p2);
        seleccionarImagen(imageViewP1,p1);
        seleccionarImagen(imageViewP0,p0);


    }

    private void seleccionarImagen(ImageView imageView, int p) {
        switch(p){
            case 0:
                imageView.setImageResource(R.drawable.numero_0);
                break;
            case 1:
                imageView.setImageResource(R.drawable.numero_1);
                break;
            case 2:
                imageView.setImageResource(R.drawable.numero_2);
                break;
            case 3:
                imageView.setImageResource(R.drawable.numero_3);
                break;
            case 4:
                imageView.setImageResource(R.drawable.numero_4);
                break;
            case 5:
                imageView.setImageResource(R.drawable.numero_5);
                break;
            case 6:
                imageView.setImageResource(R.drawable.numero_6);
                break;
            case 7:
                imageView.setImageResource(R.drawable.numero_7);
                break;
            case 8:
                imageView.setImageResource(R.drawable.numero_8);
                break;
            case 9:
                imageView.setImageResource(R.drawable.numero_9);
                break;
            case 10:
                imageView.setImageResource(R.drawable.numero_10);
                break;
            case 11:
                imageView.setImageResource(R.drawable.numero_11);
                break;
            case 12:
                imageView.setImageResource(R.drawable.numero_12);
                break;
            case 13:
                imageView.setImageResource(R.drawable.numero_13);
                break;
            case 14:
                imageView.setImageResource(R.drawable.numero_14);
                break;
            case 15:
                imageView.setImageResource(R.drawable.numero_15);
                break;
            case 16:
                imageView.setImageResource(R.drawable.numero_16);
                break;
            case 17:
                imageView.setImageResource(R.drawable.numero_17);
                break;
            case 18:
                imageView.setImageResource(R.drawable.numero_18);
                break;
            case 19:
                imageView.setImageResource(R.drawable.numero_19);
                break;
        }
    }

    private void asignarValores(int p2,int p1,int p0,int numero) {
        //Identificar elementos
        numeroP2=findViewById(R.id.numeroP2);
        numeroP2.setText(String.valueOf(p2));

        resultadoP2=findViewById(R.id.resultadoP2);
        resultadoP2.setText(String.valueOf(obtenerResultado(p2,400)));

        numeroP1=findViewById(R.id.numeroP1);
        numeroP1.setText(String.valueOf(p1));

        resultadoP1=findViewById(R.id.resultadoP1);
        resultadoP1.setText(String.valueOf(obtenerResultado(p1,20)));

        numeroP0=findViewById(R.id.numeroP0);
        numeroP0.setText(String.valueOf(p0));

        resultadoP0=findViewById(R.id.resultadoP0);
        resultadoP0.setText(String.valueOf(obtenerResultado(p0,1)));

        resultadoTotal=findViewById(R.id.resultadoTotal);
        resultadoTotal.setText(String.valueOf(numero));
    }

    private int  obtenerResultado(int numero, int base) {
        return numero*base;
    }
}