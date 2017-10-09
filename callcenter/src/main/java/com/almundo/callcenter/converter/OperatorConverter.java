/**
 * 
 */
package com.almundo.callcenter.converter;

import org.springframework.stereotype.Component;

import com.almundo.callcenter.entity.Operator;
import com.almundo.callcenter.model.OperatorModel;

// TODO: Auto-generated Javadoc
/**
 * The Class OperatorConverter.
 * Clase Componente para Convertir Objetos Entity a Model y Viceversa
 * @author Omar
 */
@Component("operatorConverter")
public class OperatorConverter {

	/**
	 * Entity to model.
	 * Metodo para convertir objeto Entity a Model
	 * @param operator the operator
	 * @return the operator model
	 */
	public OperatorModel entityToModel(Operator operator) {
		OperatorModel operatorModel = new OperatorModel();

		if (operator != null) {
			operatorModel.setId(operator.getId());
			operatorModel.setName(operator.getName());
			operatorModel.setPosition(operator.getPosition());
			operatorModel.setLastContact(operator.getLastContact());
			operatorModel.setAvailable(operator.isAvailable());
		}

		return operatorModel;
	}

	/**
	 * Model to entity.
	 * Metodo para convertir objeto Model a Entity
	 * @param operatorModel the operator model
	 * @return the operator
	 */
	public Operator modelToEntity(OperatorModel operatorModel) {
		Operator operator = new Operator();

		if (operatorModel != null) {
			operator.setId(operatorModel.getId());
			operator.setName(operatorModel.getName());
			operator.setPosition(operatorModel.getPosition());
			operator.setLastContact(operatorModel.getLastContact());
			operator.setAvailable(operatorModel.isAvailable());
		}

		return operator;
	}

}
