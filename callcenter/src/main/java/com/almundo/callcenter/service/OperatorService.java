/**
 * 
 */
package com.almundo.callcenter.service;

import com.almundo.callcenter.model.OperatorModel;

// TODO: Auto-generated Javadoc
/**
 * The Interface OperatorService.
 * Interfaz para los Servicio de Operados
 * @author Omar
 */
public interface OperatorService {

	/**
	 * Find by id.
	 * Metodo para Buscar Operdor por ID
	 * @param id the id
	 * @return the operator model
	 */
	public abstract OperatorModel findById(int id);
	
	/**
	 * Find operator available.
	 * Metodo para Buscar Operador Disponible
	 * @return the operator model
	 */
	public abstract OperatorModel findOperatorAvailable();
	
	/**
	 * Save.
	 * Metodo para Guardar y Actualizar Operador
	 * @param operatorModel the operator model
	 */
	public abstract void save (OperatorModel operatorModel);
	
}
