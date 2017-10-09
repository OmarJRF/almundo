/**
 * 
 */
package com.almundo.callcenter.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.almundo.callcenter.entity.Operator;

// TODO: Auto-generated Javadoc
/**
 * The Interface OperatorRepository.
 * Clase Repositorio para Persistencia del objeto Operador
 * @author Omar
 */
@Repository("operatorRepository")
public interface OperatorRepository extends JpaRepository<Operator, Serializable> {
	
	/** The operador. */
	String OPERADOR = "operador";

	/**
	 * Find by id.
	 * Metodo para Buscar Operdor por ID
	 * @param id the id
	 * @return the operator
	 */
	public Operator findById(int id);

	/**
	 * Find top by available true and position order by last contact asc.
	 * Metodo para Buscar Operador Disponible
	 * @param operador the operador
	 * @return the operator
	 */
	public Operator findTopByAvailableTrueAndPositionOrderByLastContactAsc(String operador);

}
