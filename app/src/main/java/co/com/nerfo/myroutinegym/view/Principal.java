package co.com.nerfo.myroutinegym.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import co.com.nerfo.myroutinegym.R;

public class Principal extends AppCompatActivity {

    private static final String LOG_TAG = "[MyRoutineGym]";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void viewGrupoUno(View v){
        Intent intent  = new Intent(this,GrupoUno.class);
        Log.i(LOG_TAG,"Direccionando al grupo uno...");
        startActivity(intent);
    }

    public void viewGrupoDos(View v){
        Intent intent  = new Intent(this,GrupoDos.class);
        Log.i(LOG_TAG,"Direccionando al grupo dos...");
        startActivity(intent);
    }

    public void viewGrupoTres(View v){
        Intent intent  = new Intent(this,GrupoTres.class);
        Log.i(LOG_TAG,"Direccionando al grupo tres...");
        startActivity(intent);
    }

    public void viewNewExercise(View v){
        Intent intent  = new Intent(this,Ejercicios.class);
        Log.i(LOG_TAG,"Direccionando al grupo tres...");
        startActivity(intent);
    }
}
