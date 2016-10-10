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
    public static final String PESO = "PESO";
    public static final String FK_ID_GRUPO = "ID_GRUPO";

    public static final String CREATE_TABLE_EJERCICIO =
            "CREATE TABLE " + TABLE_EJERCICIO + " ( "
                    + ID_EJERCICIO + " integer primary key autoincrement not null, "
                    + NOMBRE_EJERCICIO + " text not null, "
                    + SERIES + " integer not null, "
                    + REPETICIONES + " integer not null, "
                    + URL_IMAGEN + " text, "
                    + PESO + " integer, "
                    + FK_ID_GRUPO + " integer "
                    + " ) ";

    public static final String INSERT_EJERCICIO_1 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Sentadilla', 0, 0, '1sentadilla.png', 0, 0)";

    public static final String INSERT_EJERCICIO_2 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Sentadilla Smith', 0, 0, '2sentadillasmith.png', 0, 0)";

    public static final String INSERT_EJERCICIO_3 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Hack', 0, 0, '3hack.png', 0, 0)";

    public static final String INSERT_EJERCICIO_4 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Leg Press', 0, 0, '4legpress.png', 0, 0)";

    public static final String INSERT_EJERCICIO_5 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Tijera', 0, 0, '5tijera.png', 0, 0)";

    public static final String INSERT_EJERCICIO_6 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Leg Extension', 0, 0, '6legextension.png', 0, 0)";

    public static final String INSERT_EJERCICIO_7 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Extension Gluteo M/G', 0, 0, '7extensiongluteo.png', 0, 0)";

    public static final String INSERT_EJERCICIO_8 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Leg Curl', 0, 0, '8legcurl.png', 0, 0)";

    public static final String INSERT_EJERCICIO_9 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Leg Curl de Pie', 0, 0, '9legcurldepie.png', 0, 0)";

    public static final String INSERT_EJERCICIO_10 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Peso Muerto', 0, 0, '10pesomuerto.png', 0, 0)";

    public static final String INSERT_EJERCICIO_11 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Elevacion de Talones', 0, 0, '11elevaciondetalones.png', 0, 0)";

    public static final String INSERT_EJERCICIO_12 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Soleo', 0, 0, '12soleo.png', 0, 0)";

    public static final String INSERT_EJERCICIO_13 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Dominada', 0, 0, '13dominada.png', 0, 0)";

    public static final String INSERT_EJERCICIO_14 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Halones Atras', 0, 0, '14halonesatras.png', 0, 0)";

    public static final String INSERT_EJERCICIO_15 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Halones Adelante', 0, 0, '15halonesadelante.png', 0, 0)";

    public static final String INSERT_EJERCICIO_16 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Remo al Piso', 0, 0, '16remoalpiso.png', 0, 0)";

    public static final String INSERT_EJERCICIO_17 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Remo Barra T', 0, 0, '17remobarrat.png', 0, 0)";

    public static final String INSERT_EJERCICIO_18 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Remo Hammer', 0, 0, '18remohammer.png', 0, 0)";

    public static final String INSERT_EJERCICIO_19 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Remo M/C', 0, 0, '19remomc.png', 0, 0)";

    public static final String INSERT_EJERCICIO_20 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Remo con Barra', 0, 0, '20remoconbarra.png', 0, 0)";

    public static final String INSERT_EJERCICIO_21 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Press Plano', 0, 0, '21pressplano.png', 0, 0)";

    public static final String INSERT_EJERCICIO_22 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Press Inclinado', 0, 0, '22pressinclinado.png', 0, 0)";

    public static final String INSERT_EJERCICIO_23 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Press Declinado', 0, 0, '23pressdeclinado.png', 0, 0)";

    public static final String INSERT_EJERCICIO_24 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Vuelos Planos', 0, 0, '24vuelosplanos.png', 0, 0)";

    public static final String INSERT_EJERCICIO_25 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Vuelos Inclinados', 0, 0, '25vuelosinclinados.png', 0, 0)";

    public static final String INSERT_EJERCICIO_26 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Vuelos Declinados', 0, 0, '26vuelosdeclinados.png', 0, 0)";

    public static final String INSERT_EJERCICIO_27 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Peck Deck', 0, 0, '27peckdeck.png', 0, 0)";

    public static final String INSERT_EJERCICIO_28 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Pull Over', 0, 0, '28pullover.png', 0, 0)";

    public static final String INSERT_EJERCICIO_29 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Cross Over', 0, 0, '29crossover.png', 0, 0)";

    public static final String INSERT_EJERCICIO_30 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Press Hombros', 0, 0, '30presshombros.png', 0, 0)";

    public static final String INSERT_EJERCICIO_31 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Press M/C', 0, 0, '31pressmc.png', 0, 0)";

    public static final String INSERT_EJERCICIO_32 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Elevacion Frontal', 0, 0, '32elevacionfrontal.png', 0, 0)";

    public static final String INSERT_EJERCICIO_33 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Elevacion Lateral', 0, 0, '33elevacionlateral.png', 0, 0)";

    public static final String INSERT_EJERCICIO_34 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Vuelos Posteriores', 0, 0, '34vuelosposteriores.png', 0, 0)";

    public static final String INSERT_EJERCICIO_35 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Aductores', 0, 0, '35aductores.png', 0, 0)";

    public static final String INSERT_EJERCICIO_36 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Abductores', 0, 0, '36abductores.png', 0, 0)";

    public static final String INSERT_EJERCICIO_37 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Remo al Cuello', 0, 0, '37remoalcuello.png', 0, 0)";

    public static final String INSERT_EJERCICIO_38 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Curl Muñeca', 0, 0, '38curlmunieca.png', 0, 0)";

    public static final String INSERT_EJERCICIO_39 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Curl Invertido', 0, 0, '39curlinvertido.png', 0, 0)";

    public static final String INSERT_EJERCICIO_40 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Curl M/C', 0, 0, '40curlmc.png', 0, 0)";

    public static final String INSERT_EJERCICIO_41 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Curl Martillo', 0, 0, '41curlmartillo.png', 0, 0)";

    public static final String INSERT_EJERCICIO_42 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Curl Barra', 0, 0, '42curlbarra.png', 0, 0)";

    public static final String INSERT_EJERCICIO_43 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Curl Polea', 0, 0, '43curlpolea.png', 0, 0)";

    public static final String INSERT_EJERCICIO_44 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Curl Scott', 0, 0, '44curlscott.png', 0, 0)";

    public static final String INSERT_EJERCICIO_45 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Extension Acostado', 0, 0, '45extensionacostado.png', 0, 0)";

    public static final String INSERT_EJERCICIO_46 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Push Down', 0, 0, '46pushdown.png', 0, 0)";

    public static final String INSERT_EJERCICIO_47 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Copa', 0, 0, '47copa.png', 0, 0)";

    public static final String INSERT_EJERCICIO_48 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Patada Triceps', 0, 0, '48patadatriceps.png', 0, 0)";

    public static final String INSERT_EJERCICIO_49 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Extension Maquina', 0, 0, '49extensionmaquina.png', 0, 0)";

    public static final String INSERT_EJERCICIO_50 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Inclinacion Lateral M/C', 0, 0, '50inclinacionlateralmc.png', 0, 0)";

    public static final String INSERT_EJERCICIO_51 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Inclinacion Lateral Banco', 0, 0, '51inclinacionlateralbanco.png', 0, 0)";

    public static final String INSERT_EJERCICIO_52 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Crunch', 0, 0, '52crunch.png', 0, 0)";

    public static final String INSERT_EJERCICIO_53 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Elevacion de Piernas', 0, 0, '53elevacionpiernas.png', 0, 0)";

    public static final String INSERT_EJERCICIO_54 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Patada de Rana', 0, 0, '54patadaderana.png', 0, 0)";

    public static final String INSERT_EJERCICIO_55 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Lumbares', 0, 0, '55lumbares.png', 0, 0)";

    public static final String INSERT_EJERCICIO_56 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Fondos', 0, 0, '56fondos.png', 0, 0)";

    public static final String INSERT_EJERCICIO_57 =
            "INSERT INTO EJERCICIO(" + NOMBRE_EJERCICIO + " , " + SERIES + " , " + REPETICIONES + " , " + URL_IMAGEN + " , " + FK_ID_GRUPO + ", " + PESO +") "
                    + "VALUES ('Flexiones de Codos', 0, 0, '57flexionescodos.png', 0, 0)";

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
    private static final String DB_NAME = "myroutine.sqlite";
    private static final int DB_SCHEMA_VERSION = 1;
    Context contexto;

    public InitDataBase(Context context) {
        super(context, DB_NAME, null, DB_SCHEMA_VERSION);
        Log.d(TAG_LOG, "[DataBaseHelper] DataBase Name: " + DB_NAME + " Version: " + DB_SCHEMA_VERSION);
        contexto = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_EJERCICIO);
        Log.d(TAG_LOG, "[InitDataBase] SQL: " + CREATE_TABLE_EJERCICIO);
        db.execSQL(CREATE_TABLE_GRUPO_EJERCICIO);
        Log.d(TAG_LOG, "[InitDataBase] SQL: " + CREATE_TABLE_GRUPO_EJERCICIO);
        db.execSQL(CREATE_TABLE_HISTORIAL);
        Log.d(TAG_LOG, "[InitDataBase] SQL: " + CREATE_TABLE_HISTORIAL);
        db.execSQL(INSERT_GRUPO_1);
        db.execSQL(INSERT_GRUPO_2);
        db.execSQL(INSERT_GRUPO_3);
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
        db.execSQL(INSERT_EJERCICIO_25);
        db.execSQL(INSERT_EJERCICIO_26);
        db.execSQL(INSERT_EJERCICIO_27);
        db.execSQL(INSERT_EJERCICIO_28);
        db.execSQL(INSERT_EJERCICIO_29);
        db.execSQL(INSERT_EJERCICIO_30);
        db.execSQL(INSERT_EJERCICIO_31);
        db.execSQL(INSERT_EJERCICIO_32);
        db.execSQL(INSERT_EJERCICIO_33);
        db.execSQL(INSERT_EJERCICIO_34);
        db.execSQL(INSERT_EJERCICIO_35);
        db.execSQL(INSERT_EJERCICIO_36);
        db.execSQL(INSERT_EJERCICIO_37);
        db.execSQL(INSERT_EJERCICIO_38);
        db.execSQL(INSERT_EJERCICIO_39);
        db.execSQL(INSERT_EJERCICIO_40);
        db.execSQL(INSERT_EJERCICIO_41);
        db.execSQL(INSERT_EJERCICIO_42);
        db.execSQL(INSERT_EJERCICIO_43);
        db.execSQL(INSERT_EJERCICIO_44);
        db.execSQL(INSERT_EJERCICIO_45);
        db.execSQL(INSERT_EJERCICIO_46);
        db.execSQL(INSERT_EJERCICIO_47);
        db.execSQL(INSERT_EJERCICIO_48);
        db.execSQL(INSERT_EJERCICIO_49);
        db.execSQL(INSERT_EJERCICIO_50);
        db.execSQL(INSERT_EJERCICIO_51);
        db.execSQL(INSERT_EJERCICIO_52);
        db.execSQL(INSERT_EJERCICIO_53);
        db.execSQL(INSERT_EJERCICIO_54);
        db.execSQL(INSERT_EJERCICIO_55);
        db.execSQL(INSERT_EJERCICIO_56);
        db.execSQL(INSERT_EJERCICIO_57);
        Log.i(TAG_LOG, "[InitDataBase] Base de Datos creada satisfactoriamente.");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Sin codigo de ejecucion
    }
}
