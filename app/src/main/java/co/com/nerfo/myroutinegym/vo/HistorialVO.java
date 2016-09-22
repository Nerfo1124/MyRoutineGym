package co.com.nerfo.myroutinegym.vo;

import java.util.Date;

/**
 * Created by Fernando on 21/09/2016.
 */

public class HistorialVO {

    private Integer idHistorial;
    private Integer idEjercicio;
    private Date fechaEjercicio;

    public HistorialVO() {
    }

    public HistorialVO(Integer idHistorial, Integer idEjercicio, Date fechaEjercicio) {
        this.idHistorial = idHistorial;
        this.idEjercicio = idEjercicio;
        this.fechaEjercicio = fechaEjercicio;
    }

    public Integer getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(Integer idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Integer getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(Integer idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public Date getFechaEjercicio() {
        return fechaEjercicio;
    }

    public void setFechaEjercicio(Date fechaEjercicio) {
        this.fechaEjercicio = fechaEjercicio;
    }
}
