/**
 * 
 */
package org.spring.registraduria.backend.registraduriabackend.model.dao;

import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaLugarVoto;
import org.springframework.data.repository.CrudRepository;


/**
 * @author User
 *
 */
public interface ILugarVotoDao extends CrudRepository<TablaLugarVoto, String> {

}
