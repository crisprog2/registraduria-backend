/**
 * 
 */
package org.spring.registraduria.backend.registraduriabackend.model.dao;

import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaRegistro;
import org.springframework.data.repository.CrudRepository;


/**
 * @author User
 *
 */
public interface IRegistroDao extends CrudRepository<TablaRegistro, Long> {

}
