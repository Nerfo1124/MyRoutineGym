package co.com.nerfo.myroutinegym.dao.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Fernando on 21/09/2016.
 */

public class InitDataBase extends SQLiteOpenHelper {

    private static String TAG_LOG = "[MyRoutineGym]";

    //Tabla de Ejercicio
    public static final String TABLE_EJERCICIO = "EJERCICIO";
    public static final String ID_EJERCICIO = "ID_EJERCICIO";
    public static final String NOMBRE_EJERCICIO = "NOMBRE_EJERCICIO";
    public static final String SERIES = "SERIES";
    public static final String REPETICIONES = "REPETICIONES";
    public static final String URL_IMAGEN = "URL_IMAGEN";
    public static final String FK_ID_GRUPO = "ID_GRUPO";

    public static final String CREATE_TABLE_EJERCICIO =
            "CREATE TABLE " + TABLE_EJERCICIO + " ( "
                    + ID_EJERCICIO + " integer primary key autoincrement not null, "
                    + NOMBRE_EJERCICIO + " text not null, "
                    + SERIES + " integer not null, "
                    + NOMBRE_EJERCICIO + " text not null, "
                    + REPETICIONES + " integer not null, "
                    + URL_IMAGEN + " text, "
                    + FK_ID_GRUPO + " integer "
                    + " ) ";

    public static final String INSERT_EJERCICIO_1 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Leg Press', 4, 12, 'Leg_Press.png', 1)";

    public static final String INSERT_EJERCICIO_2 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Tijeras', 4, 12, 'Tijera.png', 1)";

    public static final String INSERT_EJERCICIO_3 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Leg Extension', 4, 15, 'Leg_Extension.png', 1)";

    public static final String INSERT_EJERCICIO_4 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Extension Gluteio m/g', 4, 12, 'Extension_Gluteo.png', 1)";

    public static final String INSERT_EJERCICIO_5 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Leg Curl', 4, 12, 'Leg_Curl.png', 1)";

    public static final String INSERT_EJERCICIO_6 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Elevacion de Talones', 4, 20, 'Elevacion_Talones.png', 1)";

    public static final String INSERT_EJERCICIO_7 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Halones Atras', 4, 15, 'Halones_Atras.png', 2))";

    public static final String INSERT_EJERCICIO_8 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Remo al Piso', 4, 15, 'Remo_Piso.png', 2)";

    public static final String INSERT_EJERCICIO_9 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Remo con Barra', 4, 15, 'Remo_Barra.png', 2)";

    public static final String INSERT_EJERCICIO_10 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Press Inclinado', 4, 12, 'Press_Inclinado.png', 3)";

    public static final String INSERT_EJERCICIO_11 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Peck Deck', 4, 12, 'Peck_Deck.png', 3)";

    public static final String INSERT_EJERCICIO_12 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Elevaion Frontal', 4, 12, 'Elevacion_Frontal.png', 2)";

    public static final String INSERT_EJERCICIO_13 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Elevacion Lateral', 4, 12, 'Elevacion_Lateral.png', 2)";

    public static final String INSERT_EJERCICIO_14 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('ADD', 4, 15, 'ADD.png', 1)";

    public static final String INSERT_EJERCICIO_15 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('ABD', 4, 15, 'abd.png', 1)";

    public static final String INSERT_EJERCICIO_16 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Curl Barra', 4, 12, 'Curl_Barra.png', 3)";

    public static final String INSERT_EJERCICIO_17 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Curl Scott', 4, 12, 'Curl_Scott.png', 3)";

    public static final String INSERT_EJERCICIO_18 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Copa', 4, 12, 'Copa.png', 2)";

    public static final String INSERT_EJERCICIO_19 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Crunch', 4, 20, 'Crunch.png', 3)";

    public static final String INSERT_EJERCICIO_20 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Elevacion de Piernas', 4, 20, 'Elevacion_Piernas.png', 3)";

    public static final String INSERT_EJERCICIO_21 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Patada de Rana', 4, 20, 'Patada_Rana.png', 3)";

    public static final String INSERT_EJERCICIO_22 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Lumbares', 4, 15, 'Lumbares.png'. 2)";

    public static final String INSERT_EJERCICIO_23 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Fondos', 4, 20, 'Fondos.png', 2)";

    public static final String INSERT_EJERCICIO_24 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ") "
                    + "VALUES ('Flexiones Codos', 4, 20, 'Flexiones_Codos.png', 3)";


    //Tabla de Grupo Ejercicio
    public static final String TABLE_GRUPO_EJERCICIO = "GRUPO_EJERCICIO";
    public static final String ID_GRUPO = "ID_GRUPO";
    public static final String NOMBRE_GRUPO = "NOMBRE_GRUPO";

    public static final String CREATE_TABLE_GRUPO_EJERCICIO =
            "CREATE TABLE " + TABLE_GRUPO_EJERCICIO + " ( "
                    + ID_GRUPO + " integer primary key autoincrement not null, "
                    + NOMBRE_GRUPO + " text not null"
                    + " ) ";

    public static final String INSERT_GRUPO_1 =
            "INSERT INTO GRUPO_EJERCICIO(" + NOMBRE_GRUPO + ") "
                    + "VALUES ('Rutina de Pierna')";

    public static final String INSERT_GRUPO_2 =
            "INSERT INTO GRUPO_EJERCICIO(" + NOMBRE_GRUPO + ") "
                    + "VALUES ('Rutina de Hombros y Espalda')";

    public static final String INSERT_GRUPO_3 =
            "INSERT INTO GRUPO_EJERCICIO(" + NOMBRE_GRUPO + ") "
                    + "VALUES ('Rutina de Pecho y Abdomen')";

    //Tabla de Historico Ejercicio

    public static final String TABLE_HISTORIAL = "HISTORIAL";
    public static final String ID_HISTORIAL = "ID_HISTORIAL";
    public static final String FK_ID_EJERCICIO = "ID_EJERCICIO";
    public static final String FECHA_EJERCICIO = "FECHA_EJERCICIO";

    public static final String CREATE_TABLE_HISTORIAL =
            "CREATE TABLE " + TABLE_HISTORIAL + " ( "
                    + ID_HISTORIAL + " integer primary key autoincrement not null, "
                    + FK_ID_EJERCICIO + " integer not null, "
                    + FECHA_EJERCICIO + " text"
                    + " ) ";


    // Variables Iniciales de la Clase
    private static final String DB_NAME = "presbicia.sqlite";
    private static final int DB_SCHEMA_VERSION = 1;
    Context contexto;

    public InitDataBase(Context context) {
        super(context, DB_NAME, null, DB_SCHEMA_VERSION);
        Log.d(TAG_LOG, "[DataBaseHelper] DataBase Name: " + DB_NAME + " Version: " + DB_SCHEMA_VERSION);
        contexto = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_EJERCICIO);
        Log.d(TAG_LOG, "[InitDataBase] SQL: " + TABLE_EJERCICIO);
        db.execSQL(TABLE_GRUPO_EJERCICIO);
        Log.d(TAG_LOG, "[InitDataBase] SQL: " + TABLE_GRUPO_EJERCICIO);
        db.execSQL(CREATE_TABLE_HISTORIAL);
        Log.d(TAG_LOG, "[InitDataBase] SQL: " + CREATE_TABLE_HISTORIAL);
        db.execSQL(INSERT_EJERCICIO_1);
        db.execSQL(INSERT_EJERCICIO_2);
        db.execSQL(INSERT_EJERCICIO_3);
        db.execSQL(INSERT_EJERCICIO_4);
        db.execSQL(INSERT_EJERCICIO_5);
        db.execSQL(INSERT_EJERCICIO_6);
        db.execSQL(INSERT_EJERCICIO_7);
        db.execSQL(INSERT_EJERCICIO_8);
        db.execSQL(INSERT_EJERCICIO_9);
        db.execSQL(INSERT_EJERCICIO_10);
        db.execSQL(INSERT_EJERCICIO_11);
        db.execSQL(INSERT_EJERCICIO_12);
        db.execSQL(INSERT_EJERCICIO_13);
        db.execSQL(INSERT_EJERCICIO_14);
        db.execSQL(INSERT_EJERCICIO_15);
        db.execSQL(INSERT_EJERCICIO_16);
        db.execSQL(INSERT_EJERCICIO_17);
        db.execSQL(INSERT_EJERCICIO_18);
        db.execSQL(INSERT_EJERCICIO_19);
        db.execSQL(INSERT_EJERCICIO_20);
        db.execSQL(INSERT_EJERCICIO_21);
        db.execSQL(INSERT_EJERCICIO_22);
        db.execSQL(INSERT_EJERCICIO_23);
        db.execSQL(INSERT_EJERCICIO_24);
        db.execSQL(INSERT_GRUPO_1);
        db.execSQL(INSERT_GRUPO_2);
        db.execSQL(INSERT_GRUPO_3);
        Log.i(TAG_LOG, "Base de Datos creada satisfactoriamente.");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Sin codigo de ejecucion
    }
}
