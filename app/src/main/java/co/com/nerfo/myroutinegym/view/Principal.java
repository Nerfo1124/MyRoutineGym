package co.com.nerfo.myroutinegym.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void viewGrupoUno(View v){
        Intent intent  = new Intent(this,GrupoUno.class);
        startActivity(intent);
    }

    public void viewGrupoDos(View v){
        Intent intent  = new Intent(this,GrupoDos.class);
        startActivity(intent);
    }

    public void viewGrupoTres(View v){
        Intent intent  = new Intent(this,GrupoTres.class);
        startActivity(intent);
    }
}
