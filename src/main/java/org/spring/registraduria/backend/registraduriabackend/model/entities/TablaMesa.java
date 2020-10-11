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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "tabla_mesa")
public class TablaMesa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cod_Mesa")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codMesa;

	@Column(name = "mesa")
	private int mesa;

	@JoinColumn(name = "cod_lugar", referencedColumnName = "cod_lugar")
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	private TablaLugarVoto cod_lugar;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cod_Mesa")
	@JsonManagedReference
	private List<TablaPersona> personaList;

	/**
	 * @return the codMesa
	 */
	public Long getCodMesa() {
		return codMesa;
	}

	/**
	 * @param codMesa the codMesa to set
	 */
	public void setCodMesa(Long codMesa) {
		this.codMesa = codMesa;
	}

	/**
	 * @return the mesa
	 */
	public int getMesa() {
		return mesa;
	}

	/**
	 * @param mesa the mesa to set
	 */
	public void setMesa(int mesa) {
		this.mesa = mesa;
	}

	/**
	 * @return the cod_lugar
	 */
	public TablaLugarVoto getCod_lugar() {
		return cod_lugar;
	}

	/**
	 * @param cod_lugar the cod_lugar to set
	 */
	public void setCod_lugar(TablaLugarVoto cod_lugar) {
		this.cod_lugar = cod_lugar;
	}

	/**
	 * @return the personaList
	 */
	public List<TablaPersona> getPersonaList() {
		return personaList;
	}

	/**
	 * @param personaList the personaList to set
	 */
	public void setPersonaList(List<TablaPersona> personaList) {
		this.personaList = personaList;
	}



}
