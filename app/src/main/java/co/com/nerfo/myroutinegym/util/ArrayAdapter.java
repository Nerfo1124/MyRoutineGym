package co.com.nerfo.myroutinegym.util;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import co.com.nerfo.myroutinegym.R;
import co.com.nerfo.myroutinegym.dao.EjercicioDAO;
import co.com.nerfo.myroutinegym.vo.EjercicioVO;

/**
 * Created by desar on 23/09/2016.
 */

public class ArrayAdapter extends android.widget.ArrayAdapter<EjercicioVO> {

    private static final String LOG_TAG = "[Sin_nombre]";

    private final Context context;
    private final List<EjercicioVO> ejercicioList;

    public ArrayAdapter(Context context, Integer idActivity, List<EjercicioVO> ejercicioList) {
        super(context, idActivity, ejercicioList);
        this.context = context;
        this.ejercicioList = ejercicioList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Log.d(LOG_TAG, "Ingresando al metodo getView...");

        View friendInfoView;

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Se agregan objetos a la lista principal.
        friendInfoView = inflater.inflate(R.layout.layout_excersise, parent, false);
        TextView txtEjercicio = (TextView) friendInfoView.findViewById(R.id.txtNameEjercicio);
        TextView txtSerieRepeticion = (TextView) friendInfoView.findViewById(R.id.txtSerieRepeticion);

        txtEjercicio.setText(ejercicioList.get(position).getNombreEjercicio());
        txtSerieRepeticion.setText("Series: "+ejercicioList.get(position).getSeries()+" - Repeticiones: "+ejercicioList.get(position).getRepeticiones());

        // Fragmento de codigo encargado de asignar una imagen al imageView
        ImageView imageView = (ImageView) friendInfoView.findViewById(R.id.avatar);
        Picasso.with(context).load("file:///android_asset/" + ejercicioList.get(position).getUrlImagen()).into(imageView);
        return friendInfoView;
    }
}
