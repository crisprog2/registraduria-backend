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
@Table(name = "tabla_ciudad")
public class TablaCiudad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cod_Ciudad")
	private String codCiudad;

	@Column(name = "ciudad")
	private String ciudad;

	@JoinColumn(name = "cod_Departamento", referencedColumnName = "cod_Departamento")
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	private TablaDepartamento cod_Departamento;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cod_Ciudad")
	@JsonManagedReference
	private List<TablaLugarVoto> lugarList;

	/**
	 * @return the codCiudad
	 */
	public String getCodCiudad() {
		return codCiudad;
	}

	/**
	 * @param codCiudad the codCiudad to set
	 */
	public void setCodCiudad(String codCiudad) {
		this.codCiudad = codCiudad;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return the cod_Departamento
	 */
	public TablaDepartamento getCod_Departamento() {
		return cod_Departamento;
	}

	/**
	 * @param cod_Departamento the cod_Departamento to set
	 */
	public void setCod_Departamento(TablaDepartamento cod_Departamento) {
		this.cod_Departamento = cod_Departamento;
	}

	/**
	 * @return the lugarList
	 */
	public List<TablaLugarVoto> getLugarList() {
		return lugarList;
	}

	/**
	 * @param lugarList the lugarList to set
	 */
	public void setLugarList(List<TablaLugarVoto> lugarList) {
		this.lugarList = lugarList;
	}


}
