/**
 * 
 */
package org.spring.registraduria.backend.registraduriabackend.model.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * @author User
 *
 */
@Entity
@Table(name = "tabla_registro")
public class TablaRegistro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cod_Registro")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codRegistro;

	@Column(name = "registro")
	private int registro;
	
	@OneToOne
    @JoinColumn(name = "cedula", updatable = false, nullable = false)
	@JsonBackReference
    private TablaPersona persona;

	/**
	 * @return the codRegistro
	 */
	public Long getCodRegistro() {
		return codRegistro;
	}

	/**
	 * @param codRegistro the codRegistro to set
	 */
	public void setCodRegistro(Long codRegistro) {
		this.codRegistro = codRegistro;
	}

	/**
	 * @return the registro
	 */
	public int getRegistro() {
		return registro;
	}

	/**
	 * @param registro the registro to set
	 */
	public void setRegistro(int registro) {
		this.registro = registro;
	}

	/**
	 * @return the persona
	 */
	public TablaPersona getPersona() {
		return persona;
	}

	/**
	 * @param persona the persona to set
	 */
	public void setPersona(TablaPersona persona) {
		this.persona = persona;
	}

}
