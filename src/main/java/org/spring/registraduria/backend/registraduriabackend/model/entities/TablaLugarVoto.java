/**
 * 
 */
package org.spring.registraduria.backend.registraduriabackend.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author User
 *
 */
@Entity
@Table(name = "tabla_lugar")
public class TablaLugarVoto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cod_lugar")
	private String codLugarVoto;

	@Column(name = "nombre_lugar")
	private String nombreLugar;

	@Column(name = "direccion")
	private String direccionVoto;

	@JoinColumn(name = "cod_Ciudad", referencedColumnName = "cod_Ciudad")
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	private TablaCiudad cod_Ciudad;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cod_lugar")
	@JsonManagedReference
	private List<TablaMesa> mesaList;

	/**
	 * @return the codLugarVoto
	 */
	public String getCodLugarVoto() {
		return codLugarVoto;
	}

	/**
	 * @param codLugarVoto the codLugarVoto to set
	 */
	public void setCodLugarVoto(String codLugarVoto) {
		this.codLugarVoto = codLugarVoto;
	}

	/**
	 * @return the nombreLugar
	 */
	public String getNombreLugar() {
		return nombreLugar;
	}

	/**
	 * @param nombreLugar the nombreLugar to set
	 */
	public void setNombreLugar(String nombreLugar) {
		this.nombreLugar = nombreLugar;
	}

	/**
	 * @return the direccionVoto
	 */
	public String getDireccionVoto() {
		return direccionVoto;
	}

	/**
	 * @param direccionVoto the direccionVoto to set
	 */
	public void setDireccionVoto(String direccionVoto) {
		this.direccionVoto = direccionVoto;
	}

	/**
	 * @return the cod_Ciudad
	 */
	public TablaCiudad getCod_Ciudad() {
		return cod_Ciudad;
	}

	/**
	 * @param cod_Ciudad the cod_Ciudad to set
	 */
	public void setCod_Ciudad(TablaCiudad cod_Ciudad) {
		this.cod_Ciudad = cod_Ciudad;
	}

	/**
	 * @return the mesaList
	 */
	public List<TablaMesa> getMesaList() {
		return mesaList;
	}

	/**
	 * @param mesaList the mesaList to set
	 */
	public void setMesaList(List<TablaMesa> mesaList) {
		this.mesaList = mesaList;
	}

}
