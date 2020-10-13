package org.spring.registraduria.backend.registraduriabackend.model.dtos;

import java.io.Serializable;

public class CiudadDto implements Serializable {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String codCiudad;
    private String ciudad;
    private String departamento;

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    

}
