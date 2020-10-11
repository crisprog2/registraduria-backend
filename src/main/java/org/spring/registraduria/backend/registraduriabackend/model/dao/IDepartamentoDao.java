/**
 * 
 */
package org.spring.registraduria.backend.registraduriabackend.model.dao;

import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaDepartamento;
import org.springframework.data.repository.CrudRepository;


/**
 * @author User
 *
 */
public interface IDepartamentoDao extends CrudRepository<TablaDepartamento, String> {

}
