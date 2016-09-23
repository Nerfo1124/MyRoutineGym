package co.com.nerfo.myroutinegym.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

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
            excInfoList = dao.listByIdGrupo(1);
        } catch (Exception e) {
            Log.e(LOG_TAG, "Error durante la carga de los ejercicios.", e);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position + 1){
            case 1:
                Intent mIntent1 = new Intent(this, null);
                startActivity(mIntent1);
                break;
            case 2:
                Intent mIntent2 = new Intent(this, null);
                startActivity(mIntent2);
                break;
            case 3:
                Intent mIntent3 = new Intent(this, null);
                startActivity(mIntent3);
                break;
            case 4:
                Intent mIntent4 = new Intent(this, null);
                startActivity(mIntent4);
                break;
            case 5:
                Intent mIntent5 = new Intent(this, null);
                startActivity(mIntent5);
                break;
            case 6:
                Intent mIntent6 = new Intent(this, null);
                startActivity(mIntent6);
                break;
            case 7:
                Intent mIntent7 = new Intent(this, null);
                startActivity(mIntent7);
                break;
            case 8:
                Intent mIntent8 = new Intent(this, null);
                startActivity(mIntent8);
                break;
        }
    }
}
