package co.com.nerfo.myroutinegym.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

import co.com.nerfo.myroutinegym.R;
import co.com.nerfo.myroutinegym.dao.EjercicioDAO;
import co.com.nerfo.myroutinegym.vo.EjercicioVO;

public class GrupoTres extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private static final String LOG_TAG = "[MyRoutineGym]";

    ListView ejerciciosGrupoTres;
    ArrayAdapter myArrayAdapter = null;

    List<EjercicioVO> excInfoList = null;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(LOG_TAG, "Ingresando a la vista GrupoUno.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_tres);

        mContext = this;

        ejerciciosGrupoTres = (ListView) findViewById(R.id.listaGrupoTres);
        ejerciciosGrupoTres.setOnItemClickListener(this);

        try {
            EjercicioDAO dao = new EjercicioDAO(mContext);
            excInfoList = dao.listByIdGrupo(3);
        } catch (Exception e) {
            Log.e(LOG_TAG, "Error durante la carga de los ejercicios.", e);
        }

        myArrayAdapter = new co.com.nerfo.myroutinegym.util.ArrayAdapter(mContext, R.layout.activity_grupo_tres, excInfoList);
        ejerciciosGrupoTres.setAdapter((ListAdapter) myArrayAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
