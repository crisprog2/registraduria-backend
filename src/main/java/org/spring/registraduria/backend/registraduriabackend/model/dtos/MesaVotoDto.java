package org.spring.registraduria.backend.registraduriabackend.model.dtos;

import java.io.Serializable;

public class MesaVotoDto implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Long codMesa;
    private int mesa;
    private String lugar;

    public Long getCodMesa() {
        return codMesa;
    }

    public void setCodMesa(Long codMesa) {
        this.codMesa = codMesa;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    } 
    
}
