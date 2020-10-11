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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


/**
 * @author User
 *
 */
@Entity
@Table(name = "tabla_departamento")
public class TablaDepartamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cod_Departamento")
	private String codDepartamento;

	@Column(name = "departamento")
	private String departamento;

	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "cod_Departamento")
	@JsonManagedReference
	private List<TablaCiudad> ciudadList;

	/**
	 * @return the codDepartamento
	 */
	public String getCodDepartamento() {
		return codDepartamento;
	}

	/**
	 * @param codDepartamento the codDepartamento to set
	 */
	public void setCodDepartamento(String codDepartamento) {
		this.codDepartamento = codDepartamento;
	}

	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	/**
	 * @return the ciudadList
	 */
	public List<TablaCiudad> getCiudadList() {
		return ciudadList;
	}

	/**
	 * @param ciudadList the ciudadList to set
	 */
	public void setCiudadList(List<TablaCiudad> ciudadList) {
		this.ciudadList = ciudadList;
	}
	
	

}
