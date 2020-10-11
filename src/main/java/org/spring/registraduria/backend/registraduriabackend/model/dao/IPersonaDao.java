/**
 * 
 */
package org.spring.registraduria.backend.registraduriabackend.model.dao;

import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaPersona;
import org.springframework.data.repository.CrudRepository;


/**
 * @author User
 *
 */
public interface IPersonaDao extends CrudRepository<TablaPersona, Integer> {

}
