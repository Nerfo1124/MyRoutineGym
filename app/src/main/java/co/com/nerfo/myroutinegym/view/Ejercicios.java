package co.com.nerfo.myroutinegym.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

import co.com.nerfo.myroutinegym.R;
import co.com.nerfo.myroutinegym.dao.EjercicioDAO;
import co.com.nerfo.myroutinegym.util.ArrayAdapter;
import co.com.nerfo.myroutinegym.vo.EjercicioVO;

public class Ejercicios extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private static final String LOG_TAG = "[MyRoutineGym]";

    ListView listaEjercicios;
    ArrayAdapter myArrayAdapter = null;

    List<EjercicioVO> excInfoList = null;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios);

        mContext = this;

        listaEjercicios = (ListView) findViewById(R.id.listaEjercicios);
        listaEjercicios.setOnItemClickListener(this);

        try {
            EjercicioDAO dao = new EjercicioDAO(mContext);
            excInfoList = dao.listByIdGrupo(0);
        } catch (Exception e) {
            Log.e(LOG_TAG, "Error durante la carga de los ejercicios.", e);
        }

        myArrayAdapter = new ArrayAdapter(mContext, R.layout.activity_ejercicios, excInfoList);
        listaEjercicios.setAdapter((ListAdapter) myArrayAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        EjercicioDAO dao = new EjercicioDAO(mContext);
        excInfoList = dao.listByIdGrupo(0);
        if(excInfoList.get(position) != null){
            Intent intent  = new Intent(this,RegistrarEjercicio.class);
            Log.i(LOG_TAG,"Direccionando al registro de ejercicios...");
            intent.putExtra("idEjercicio", excInfoList.get(position).getIdEjercicio());
            startActivity(intent);
        }
    }
}
