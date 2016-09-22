package co.com.nerfo.myroutinegym.vo;

/**
 * Created by Fernando on 21/09/2016.
 */

public class GrupoEjercicioVO {

    private Integer idGrupo;
    private String nombreGrupo;

    public GrupoEjercicioVO() {
    }

    public GrupoEjercicioVO(Integer idGrupo, String nombreGrupo) {
        this.idGrupo = idGrupo;
        this.nombreGrupo = nombreGrupo;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }
}
