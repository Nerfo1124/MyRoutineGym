package co.com.nerfo.myroutinegym.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import co.com.nerfo.myroutinegym.dao.database.InitDataBase;
import co.com.nerfo.myroutinegym.vo.EjercicioVO;

/**
 * Created by Fernando on 21/09/2016.
 */

public class EjercicioDAO {

    private static String TAG_LOG = "[MyRoutineGym]";

    public InitDataBase dbh;
    public SQLiteDatabase db;
    public Context contexto;

    public EjercicioDAO(Context context) {
        try {
            contexto = context;
            dbh = new InitDataBase(context);
            db = dbh.getWritableDatabase();
        } catch (Exception e) {
            Log.e(TAG_LOG, "[EjercicioDAO] Error en EjercicioDAO: " + e.toString(), e);
        }
    }

    public List<EjercicioVO> listByIdGrupo(Integer idGrupoEjercicio){
        try {
            List<EjercicioVO> listaEjercicios = new ArrayList<>();
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT ").append(dbh.ID_EJERCICIO+", ").append(dbh.NOMBRE_EJERCICIO+", ");
            sql.append(dbh.SERIES+", ").append(dbh.REPETICIONES+", ").append(dbh.URL_IMAGEN+", ");
            sql.append(dbh.PESO);
            sql.append(" FROM ").append(dbh.TABLE_EJERCICIO);
            sql.append(" WHERE ").append(dbh.FK_ID_GRUPO).append(" = ").append(idGrupoEjercicio);

            Log.i(TAG_LOG, "[listByIdGrupo] SQL: " + sql.toString());

            Cursor listEjercicios = db.rawQuery(sql.toString(), null);
            if (listEjercicios.moveToFirst()) {
                do {
                    EjercicioVO vo = new EjercicioVO();
                    vo.setIdEjercicio(listEjercicios.getInt(0));
                    vo.setNombreEjercicio(listEjercicios.getString(1));
                    vo.setSeries(listEjercicios.getInt(2));
                    vo.setRepeticiones(listEjercicios.getInt(3));
                    vo.setUrlImagen(listEjercicios.getString(4));
                    vo.setPeso(listEjercicios.getInt(5));
                    listaEjercicios.add(vo);
                } while (listEjercicios.moveToNext());
            }
            return listaEjercicios;
        } catch (Exception ex) {
            Log.e(TAG_LOG, "[listByIdGrupo] Errror en EjercicioDAO: ", ex);
            return null;
        }
    }

    public EjercicioVO excersiseById(Integer idEjercicio){
        try {
            EjercicioVO vo = new EjercicioVO();
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT ").append(dbh.ID_EJERCICIO+", ").append(dbh.NOMBRE_EJERCICIO+", ");
            sql.append(dbh.SERIES+", ").append(dbh.REPETICIONES+", ").append(dbh.URL_IMAGEN+", ");
            sql.append(dbh.PESO);
            sql.append(" FROM ").append(dbh.TABLE_EJERCICIO);
            sql.append(" WHERE ").append(dbh.ID_EJERCICIO).append(" = ").append(idEjercicio);

            Log.i(TAG_LOG, "[listByIdGrupo] SQL: " + sql.toString());

            Cursor listEjercicios = db.rawQuery(sql.toString(), null);
            if (listEjercicios.moveToFirst()) {
                vo.setIdEjercicio(listEjercicios.getInt(0));
                vo.setNombreEjercicio(listEjercicios.getString(1));
                vo.setSeries(listEjercicios.getInt(2));
                vo.setRepeticiones(listEjercicios.getInt(3));
                vo.setUrlImagen(listEjercicios.getString(4));
                vo.setPeso(listEjercicios.getInt(5));
            }
            return vo;
        } catch (Exception ex) {
            Log.e(TAG_LOG, "[listByIdGrupo] Errror en EjercicioDAO: ", ex);
            return null;
        }
    }

    public Boolean registrarEjercicioEnGrupo(EjercicioVO vo) {
        Boolean response = Boolean.FALSE;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE ").append(dbh.TABLE_EJERCICIO).append(" SET ");
            sb.append(dbh.SERIES).append(" = ").append(vo.getSeries()).append(", ");
            sb.append(dbh.REPETICIONES).append(" = ").append(vo.getRepeticiones()).append(", ");
            sb.append(dbh.PESO).append(" = ").append(vo.getPeso()).append(", ");
            sb.append(dbh.FK_ID_GRUPO).append(" = ").append(vo.getIdGrupo());
            sb.append(" WHERE ").append(dbh.ID_EJERCICIO).append(" = ").append(vo.getIdEjercicio());
            Log.i(TAG_LOG, "SQL: " + sb.toString());

            db.execSQL(sb.toString());
            response = Boolean.TRUE;
        } catch (Exception ex) {
            Log.e(TAG_LOG, "[registrarEjercicioEnGrupo] Error: ", ex);
        }
        return response;
    }
}
