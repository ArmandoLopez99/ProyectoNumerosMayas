package com.armando.cursos.proyectonumerosmayas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class ConversionADecimal extends AppCompatActivity {
    SeekBar barraNvl2;
    SeekBar barraNvl1;
    SeekBar barraNvl0;
    TextView textViewnivel2;
    TextView textViewnivel1;
    TextView textViewnivel0;
    ImageView imgNivel2;
    ImageView imgNivel1;
    ImageView imgNivel0;
    int p2,p1,p0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_a_decimal);
        barraNvl2=findViewById(R.id.barraNivel2);
        barraNvl1=findViewById(R.id.barraNivel1);
        barraNvl0=findViewById(R.id.barraNivel0);

        textViewnivel2=findViewById(R.id.textnivel2);
        textViewnivel1=findViewById(R.id.textnivel1);
        textViewnivel0=findViewById(R.id.textnivel0);

        imgNivel2=findViewById(R.id.imgNivel2);
        imgNivel1=findViewById(R.id.imgNivel1);
        imgNivel0=findViewById(R.id.imgNivel0);
        imgNivel2.setVisibility(View.INVISIBLE);
        imgNivel1.setVisibility(View.INVISIBLE);
        imgNivel0.setVisibility(View.INVISIBLE);

        barraNvl2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewnivel2.setText("Nivel 2: "+progress);
                p2=progress;
                seleccionarImagen(imgNivel2,progress);
                ocultarImagenesInnecesarias();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        barraNvl1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewnivel1.setText("Nivel 1: "+progress  );
                p1=progress;
                seleccionarImagen(imgNivel1,progress);
                ocultarImagenesInnecesarias();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        barraNvl0.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewnivel0.setText("Nivel 0: "+progress  );
                p0=progress;
                seleccionarImagen(imgNivel0,progress);
                ocultarImagenesInnecesarias();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void ocultarImagenesInnecesarias() {
        if (p2 != 0) {
          imgNivel2.setVisibility(View.VISIBLE);
          imgNivel1.setVisibility(View.VISIBLE);
          imgNivel0.setVisibility(View.VISIBLE);

        } else if (p1 != 0) {
            imgNivel2.setVisibility(View.INVISIBLE);
            imgNivel1.setVisibility(View.VISIBLE);
            imgNivel0.setVisibility(View.VISIBLE);


        }

        else {
            imgNivel2.setVisibility(View.INVISIBLE);
            imgNivel1.setVisibility(View.INVISIBLE);
            imgNivel0.setVisibility(View.VISIBLE);


        }
    }

    public void convertirADecimal(View view) {

        Intent intent=new Intent(this,ConversionAMayaDetalles.class);
        intent.putExtra("p2",p2);
        intent.putExtra("p1",p1);
        intent.putExtra("p0",p0);
        // intent.putExtra("numero",numeroAConvertir);
        startActivity(intent);
    }

    private void actualizarImagenesNumeros(int p2,int p1, int p0) {
        imgNivel2=findViewById(R.id.imgNivel2);
        imgNivel1=findViewById(R.id.imgNivel1);
        imgNivel0=findViewById(R.id.imgNivel0);

        seleccionarImagen(imgNivel2,p2);
        seleccionarImagen(imgNivel1,p1);
        seleccionarImagen(imgNivel0,p0);


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

}