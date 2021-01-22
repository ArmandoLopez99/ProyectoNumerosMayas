package com.armando.cursos.proyectonumerosmayas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumeroParaConvertir;
    public int base2=400;
    public int base1=20;
    public int base0=1;
    public int numeroRestante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumeroParaConvertir=findViewById(R.id.editTextNumeroParaConvertir);
    }

    public void convertirNumero(View view) {
        numeroRestante=Integer.parseInt(editTextNumeroParaConvertir.getText().toString());

       int p2= obtenerNumeroPosicion(numeroRestante,base2);
       int p1= obtenerNumeroPosicion(numeroRestante,base1);
       int p0= obtenerNumeroPosicion(numeroRestante,base0);
        Log.i("NUMEROSSSSS","p2="+p2+"|||p1="+p1+"|||p0="+p0);
       if(p2!=0){
            Toast.makeText(this, "p2:"+p2+"|||p1:"+p1+",|||p0:"+p0, Toast.LENGTH_LONG).show();
       }
       else if(p1!=0)
        Toast.makeText(this, "p1:"+p1+",|||p0:"+p0, Toast.LENGTH_LONG).show();
       else{
           Toast.makeText(this,"p0:"+p0, Toast.LENGTH_LONG).show();
       }
    }

    public int obtenerNumeroPosicion(int numero, int base) {
        int pActual=0;
        if (numero>=base){
            pActual=numero/base;

        }
        numeroRestante=numero%base;

        return pActual;
    }
}