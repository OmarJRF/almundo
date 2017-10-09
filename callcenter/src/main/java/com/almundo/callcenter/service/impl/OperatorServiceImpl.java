/**
 * 
 */
package com.almundo.callcenter.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.almundo.callcenter.converter.OperatorConverter;
import com.almundo.callcenter.model.OperatorModel;
import com.almundo.callcenter.repository.OperatorRepository;
import com.almundo.callcenter.service.OperatorService;

// TODO: Auto-generated Javadoc
/**
 * The Class OperatorServiceImpl.
 * Clase para implementar la Interfaz OperatorService
 * @author Omar
 */
@Service("operatorService")
public class OperatorServiceImpl implements OperatorService {

	/** The Constant LOG. */
	public static final Log LOG = LogFactory.getLog(OperatorServiceImpl.class);

	/** The operator repository. */
	@Autowired
	@Qualifier("operatorRepository")
	private OperatorRepository operatorRepository;

	/** The operator converter. */
	@Autowired
	@Qualifier("operatorConverter")
	private OperatorConverter operatorConverter;

	
	
	/* (non-Javadoc)
	 * @see com.almundo.callcenter.service.OperatorService#findById(int)
	 */
	@Override
	public OperatorModel findById(int id) {
		OperatorModel operatorModel = operatorConverter
				.entityToModel(operatorRepository.findById(id));
		return operatorModel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.almundo.callcenter.service.OperatorService#findOperatorAvailable()
	 */
	@Override
	public OperatorModel findOperatorAvailable() {
		LOG.info("findOperatorAvailable");
		OperatorModel operatorModel = operatorConverter
				.entityToModel(operatorRepository.findTopByAvailableTrueAndPositionOrderByLastContactAsc("Operador"));
if (operatorModel.getId() == 0) {
	LOG.info("findOperatorAvailable-IF 1");
	operatorModel = operatorConverter
			.entityToModel(operatorRepository.findTopByAvailableTrueAndPositionOrderByLastContactAsc("Supervisor"));
	if (operatorModel.getId() == 0) {
		LOG.info("findOperatorAvailable-IF 2");
		operatorModel = operatorConverter
				.entityToModel(operatorRepository.findTopByAvailableTrueAndPositionOrderByLastContactAsc("Director"));
	}
}
		return operatorModel;
	}

	/* (non-Javadoc)
	 * @see com.almundo.callcenter.service.OperatorService#save(com.almundo.callcenter.model.OperatorModel)
	 */
	@Override
	public void save(OperatorModel operatorModel) {
		operatorRepository.save(operatorConverter.modelToEntity(operatorModel));
	}
	
	

}
