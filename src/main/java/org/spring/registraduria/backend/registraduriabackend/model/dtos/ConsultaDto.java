package org.spring.registraduria.backend.registraduriabackend.model.dtos;

import java.io.Serializable;

public class ConsultaDto implements Serializable {

    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private int cedulaVotante;
    private int edadVotante;
    private String jurado;
    private int mesaVoto;
    private String lugarVoto;
    private String ciudadVoto;
    private String departamentoVoto;
    private Double lat;
    private Double lng;

    public String getPrimerNombre() {
        return primerNombre;
    }
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    public String getSegundoNombre() {
        return segundoNombre;
    }
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }
    public String getPrimerApellido() {
        return primerApellido;
    }
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    public String getSegundoApellido() {
        return segundoApellido;
    }
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    public int getCedulaVotante() {
        return cedulaVotante;
    }
    public void setCedulaVotante(int cedulaVotante) {
        this.cedulaVotante = cedulaVotante;
    }
    public int getEdadVotante() {
        return edadVotante;
    }
    public void setEdadVotante(int edadVotante) {
        this.edadVotante = edadVotante;
    }
    public String getJurado() {
        return jurado;
    }
    public void setJurado(String jurado) {
        this.jurado = jurado;
    }
    public int getMesaVoto() {
        return mesaVoto;
    }
    public void setMesaVoto(int mesaVoto) {
        this.mesaVoto = mesaVoto;
    }
    public String getLugarVoto() {
        return lugarVoto;
    }
    public void setLugarVoto(String lugarVoto) {
        this.lugarVoto = lugarVoto;
    }
    public String getCiudadVoto() {
        return ciudadVoto;
    }
    public void setCiudadVoto(String ciudadVoto) {
        this.ciudadVoto = ciudadVoto;
    }
    public String getDepartamentoVoto() {
        return departamentoVoto;
    }
    public void setDepartamentoVoto(String departamentoVoto) {
        this.departamentoVoto = departamentoVoto;
    }
    public Double getLat() {
        return lat;
    }
    public void setLat(Double lat) {
        this.lat = lat;
    }
    public Double getLng() {
        return lng;
    }
    public void setLng(Double lng) {
        this.lng = lng;
    } 

}
