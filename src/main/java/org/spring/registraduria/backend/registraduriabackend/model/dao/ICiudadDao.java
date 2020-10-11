/**
 * 
 */
package org.spring.registraduria.backend.registraduriabackend.model.dao;

import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaCiudad;
import org.springframework.data.repository.CrudRepository;



/**
 * @author User
 *
 */
public interface ICiudadDao extends CrudRepository<TablaCiudad, String> {

}
