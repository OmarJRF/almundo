/**
 * 
 */
package com.almundo.callcenter.service.impl;

import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.almundo.callcenter.model.OperatorModel;
import com.almundo.callcenter.service.CallService;
import com.almundo.callcenter.service.OperatorService;

// TODO: Auto-generated Javadoc
/**
 * The Class CallServiceImpl.
 * Clase para implementar la Interfaz CallService 
 * @author Omar
 */

@Service("callService")
public class CallServiceImpl implements CallService {

	/** The Constant LOG. */
	public static final Log LOG = LogFactory.getLog(CallServiceImpl.class);

	/** The operator service. */
	@Autowired
	@Qualifier("operatorService")
	OperatorService operatorService;

	/* (non-Javadoc)
	 * @see com.almundo.callcenter.service.CallService#receiveCall(int)
	 */
	@Override
	@Async
	public CompletableFuture<OperatorModel> receiveCall(int numPhone) throws Exception {
		LOG.info("receiveCall-numPhone:" + numPhone);

		OperatorModel operatorModel = routeCall(numPhone);

		if (operatorModel.getNumContact() > 0 ) {
			Thread.sleep(10000L);
			//endCall(operatorModel);
		} else {
			operatorModel.setNumContact(numPhone);
		}

		return CompletableFuture.completedFuture(operatorModel);
	}

	/* (non-Javadoc)
	 * @see com.almundo.callcenter.service.CallService#routeCall(int)
	 */
	@Override
	public synchronized OperatorModel routeCall(int numPhone) throws InterruptedException, ExecutionException {
		LOG.info("routeCall");

		OperatorModel operatorModel = new OperatorModel();
		operatorModel = operatorService.findOperatorAvailable();

		if (operatorModel != null && operatorModel.isAvailable()) {
			operatorModel.setNumContact(numPhone);
			connectCall(operatorModel);
		} else {
			LOG.info("routeCall-operatorModel:NULL");
		}

		return operatorModel;

	}

	/* (non-Javadoc)
	 * @see com.almundo.callcenter.service.CallService#connectCall(com.almundo.callcenter.model.OperatorModel)
	 */
	@Override
	public void connectCall(OperatorModel operatorModel) throws InterruptedException {
		LOG.info("connectCall");
		if (operatorModel != null) {
			operatorModel.setLastContact(new Date());
			operatorModel.setAvailable(false);
			operatorService.save(operatorModel);
		}
	}

	/* (non-Javadoc)
	 * @see com.almundo.callcenter.service.CallService#endCall(com.almundo.callcenter.model.OperatorModel)
	 */
	@Override
	public void endCall(OperatorModel operator) {
		LOG.info("endCall-operador: " + operator.getName() );
		operator.setAvailable(true);
		operatorService.save(operator);
	}

}
