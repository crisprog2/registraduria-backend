/**
 * 
 */
package org.spring.registraduria.backend.registraduriabackend.model.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author User
 *
 */
@Entity
@Table(name = "tabla_persona")
public class TablaPersona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cedula")
	private Integer cedula;

	@Column(name = "primer_Nombre")
	private String primerNombre;

	@Column(name = "segundo_Nombre")
	private String segundoNombre;

	@Column(name = "primer_Apellido")
	private String primerApellido;

	@Column(name = "segundo_Apellido")
	private String segundoApellido;

	@Column(name = "genero")
	private String genero;

	@Column(name = "edad")
	private int edad;

	@Column(name = "jurado")
	private String jurado;
	
	@OneToOne(mappedBy = "persona", cascade = CascadeType.ALL)
	@JsonManagedReference
	private TablaRegistro registro;

	@JoinColumn(name = "cod_Mesa", referencedColumnName = "cod_Mesa")
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	private TablaMesa cod_Mesa;

	/**
	 * @return the cedula
	 */
	public Integer getCedula() {
		return cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	/**
	 * @return the primerNombre
	 */
	public String getPrimerNombre() {
		return primerNombre;
	}

	/**
	 * @param primerNombre the primerNombre to set
	 */
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	/**
	 * @return the segundoNombre
	 */
	public String getSegundoNombre() {
		return segundoNombre;
	}

	/**
	 * @param segundoNombre the segundoNombre to set
	 */
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the jurado
	 */
	public String getJurado() {
		return jurado;
	}

	/**
	 * @param jurado the jurado to set
	 */
	public void setJurado(String jurado) {
		this.jurado = jurado;
	}

	/**
	 * @return the registro
	 */
	public TablaRegistro getRegistro() {
		return registro;
	}

	/**
	 * @param registro the registro to set
	 */
	public void setRegistro(TablaRegistro registro) {
		this.registro = registro;
	}

	/**
	 * @return the cod_Mesa
	 */
	public TablaMesa getCod_Mesa() {
		return cod_Mesa;
	}

	/**
	 * @param cod_Mesa the cod_Mesa to set
	 */
	public void setCod_Mesa(TablaMesa cod_Mesa) {
		this.cod_Mesa = cod_Mesa;
	}

}
