package co.com.nerfo.myroutinegym.vo;

/**
 * Created by Fernando on 21/09/2016.
 */

public class EjercicioVO {

    private Integer idEjercicio;
    private String nombreEjercicio;
    private Integer series;
    private Integer repeticiones;
    private String urlImagen;
    private Integer idGrupo;

    public EjercicioVO() {
    }

    public EjercicioVO(Integer idEjercicio, String nombreEjercicio, Integer series, Integer repeticiones, String urlImagen, Integer idGrupo) {
        this.idEjercicio = idEjercicio;
        this.nombreEjercicio = nombreEjercicio;
        this.series = series;
        this.repeticiones = repeticiones;
        this.urlImagen = urlImagen;
        this.idGrupo = idGrupo;
    }

    public Integer getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(Integer idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public String getNombreEjercicio() {
        return nombreEjercicio;
    }

    public void setNombreEjercicio(String nombreEjercicio) {
        this.nombreEjercicio = nombreEjercicio;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Integer getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(Integer repeticiones) {
        this.repeticiones = repeticiones;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }
}
