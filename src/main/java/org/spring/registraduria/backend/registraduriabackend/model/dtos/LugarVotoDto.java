package org.spring.registraduria.backend.registraduriabackend.model.dtos;

import java.io.Serializable;

public class LugarVotoDto implements Serializable{
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String codLugarVoto;
    private String nombreLugar;
    private String direccionVoto;
    private String ciudad;

    public String getCodLugarVoto() {
        return codLugarVoto;
    }

    public void setCodLugarVoto(String codLugarVoto) {
        this.codLugarVoto = codLugarVoto;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public String getDireccionVoto() {
        return direccionVoto;
    }

    public void setDireccionVoto(String direccionVoto) {
        this.direccionVoto = direccionVoto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}
