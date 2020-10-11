/**
 * 
 */
package org.spring.registraduria.backend.registraduriabackend.model.dao;

import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaMesa;
import org.springframework.data.repository.CrudRepository;


/**
 * @author User
 *
 */
public interface IMesaDao extends CrudRepository<TablaMesa, Long> {

}
