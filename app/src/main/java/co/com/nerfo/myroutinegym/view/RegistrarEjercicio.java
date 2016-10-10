package co.com.nerfo.myroutinegym.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

import co.com.nerfo.myroutinegym.R;
import co.com.nerfo.myroutinegym.dao.EjercicioDAO;
import co.com.nerfo.myroutinegym.dao.GrupoEjercicioDAO;
import co.com.nerfo.myroutinegym.vo.EjercicioVO;
import co.com.nerfo.myroutinegym.vo.GrupoEjercicioVO;

public class RegistrarEjercicio extends AppCompatActivity {

    private static final String LOG_TAG = "[MyRoutineGym]";

    EjercicioVO vo;
    List<GrupoEjercicioVO> grupo;
    EjercicioDAO dao;
    GrupoEjercicioDAO daoGrupo;

    Context mContext;

    EditText peso;
    EditText series;
    EditText repeticiones;
    Spinner grupoMuscular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Integer idEjercicio = getIntent().getIntExtra("idEjercicio", 0);
        Log.i(LOG_TAG, "Consultando datos de ejercicio - " + idEjercicio);
        setContentView(R.layout.activity_registrar_ejercicio);
        cargarDatosInterfaz(idEjercicio);
    }

    private void cargarDatosInterfaz(Integer idEjercicio){
        try {
            mContext = this;
            vo = new EjercicioVO();
            dao = new EjercicioDAO(mContext);
            daoGrupo = new GrupoEjercicioDAO(mContext);

            vo = dao.excersiseById(idEjercicio);
            grupo = daoGrupo.listGrupoEjercicios();
            String[] opciones = new String[grupo.size()];
            for (int i = 0; i < grupo.size(); i++) {
                opciones[i] = grupo.get(i).getNombreGrupo();
            }

            peso = (EditText) findViewById(R.id.edPeso);
            series = (EditText) findViewById(R.id.edSeries);
            repeticiones = (EditText) findViewById(R.id.edRepeticiones);
            ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones);
            grupoMuscular = (Spinner) findViewById(R.id.spGrupoMuscular);
            grupoMuscular.setAdapter(adapter1);
        } catch (Exception ex) {
            Log.e(LOG_TAG, "[cargarDatosInterfaz] Error: ", ex);
        }
    }

    public void registrarEjercicio(View v){
        try {
            Integer idGrupo = grupoMuscular.getSelectedItemPosition() + 1;
            Integer pesoF = Integer.parseInt(peso.getText().toString());
            Integer serie = Integer.parseInt(series.getText().toString());
            Integer repeticion = Integer.parseInt(repeticiones.getText().toString());

            vo.setPeso(pesoF);
            vo.setSeries(serie);
            vo.setRepeticiones(repeticion);
            vo.setIdGrupo(idGrupo);

            dao.registrarEjercicioEnGrupo(vo);

            Intent intent  = new Intent(this,Principal.class);
            Log.i(LOG_TAG,"Direccionando vista principal...");
            startActivity(intent);
        } catch (Exception ex) {
            Log.e(LOG_TAG, "[registrarEjercicio] Error: ", ex);
        }
    }
}
