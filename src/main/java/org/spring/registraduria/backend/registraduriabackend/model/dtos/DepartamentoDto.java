package org.spring.registraduria.backend.registraduriabackend.model.dtos;

import java.io.Serializable;

public class DepartamentoDto implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String codDepartamento;
    private String departamento;

    public String getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(String codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
