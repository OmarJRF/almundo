/**
 * 
 */
package com.almundo.callcenter.controller;

import java.util.concurrent.CompletableFuture;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.almundo.callcenter.model.OperatorModel;
import com.almundo.callcenter.service.CallService;

// TODO: Auto-generated Javadoc
/**
 * The Class CallController.
 * Clase Controller para Procesar Peticiones URL
 * @author Omar
 */

@RestController
@RequestMapping("/almundo")
public class CallController {

	/** The Constant LOG. */
	public static final Log LOG = LogFactory.getLog(CallController.class);

	/** The call service. */
	@Autowired
	@Qualifier("callService")
	private CallService callService;

	/**
	 * Receive call.
	 * Metodo para Procesar Peticiones URL de llamadas entrantes
	 * @param numPhone the num phone
	 * @return the response entity
	 * @throws Exception the exception
	 */
	@GetMapping("/receiveCall/{numPhone}")
	public ResponseEntity<String> receiveCall(@PathVariable("numPhone") int numPhone) throws Exception {
		LOG.info("receiveCall-numPhone:" + numPhone);
		
		String result;
		CompletableFuture<OperatorModel> operator = callService.receiveCall(numPhone);
		CompletableFuture.allOf(operator).join();

		if (operator != null && operator.get().getId() > 0) {
			result = operator.get().getNumContact() + " Conectado con Operador " + operator.get().getName();
		} else {
			result = operator.get().getNumContact() + " Espere Por Favor ";
		}

		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

}
