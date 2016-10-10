package co.com.nerfo.myroutinegym.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import co.com.nerfo.myroutinegym.dao.database.InitDataBase;
import co.com.nerfo.myroutinegym.vo.GrupoEjercicioVO;

/**
 * Created by Fernando on 09/10/2016.
 */

public class GrupoEjercicioDAO {

    private static String TAG_LOG = "[MyRoutineGym]";

    public InitDataBase dbh;
    public SQLiteDatabase db;
    public Context contexto;

    public GrupoEjercicioDAO(Context context) {
        try {
            contexto = context;
            dbh = new InitDataBase(context);
            db = dbh.getWritableDatabase();
        } catch (Exception e) {
            Log.e(TAG_LOG, "[GrupoEjercicioDAO] Error en GrupoEjercicioDAO: " + e.toString(), e);
        }
    }

    public List<GrupoEjercicioVO> listGrupoEjercicios(){
        try {
            List<GrupoEjercicioVO> listGrupos = new ArrayList<>();
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT ").append(dbh.ID_GRUPO+", ").append(dbh.NOMBRE_GRUPO);
            sql.append(" FROM ").append(dbh.TABLE_GRUPO_EJERCICIO);

            Log.i(TAG_LOG, "[listByIdGrupo] SQL: " + sql.toString());

            Cursor listGrupoEjercicio = db.rawQuery(sql.toString(), null);
            if (listGrupoEjercicio.moveToFirst()) {
                do {
                    GrupoEjercicioVO vo = new GrupoEjercicioVO();
                    vo.setIdGrupo(listGrupoEjercicio.getInt(0));
                    vo.setNombreGrupo(listGrupoEjercicio.getString(1));
                    listGrupos.add(vo);
                } while (listGrupoEjercicio.moveToNext());
            }
            return listGrupos;
        } catch (Exception ex) {
            Log.e(TAG_LOG, "[listByIdGrupo] Errror en EjercicioDAO: ", ex);
            return null;
        }
    }
}
