/**
 * 
 */
package com.almundo.callcenter.service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import com.almundo.callcenter.model.OperatorModel;

// TODO: Auto-generated Javadoc
/**
 * The Interface CallService.
 * Interfaz para los Servicio de Llamadas
 * @author Omar
 */
public interface CallService  {

	/**
	 * Receive call.
	 * Metodo Asincrono de llamadas entrantes 
	 * @param numPhone the num phone
	 * @return the completable future
	 * @throws Exception the exception
	 */
	public abstract CompletableFuture<OperatorModel> receiveCall (int numPhone) throws Exception;

	/**
	 * Route call.
	 * Metodo que enruta llamadas entrantes
	 * @param numPhone the num phone
	 * @return the operator model
	 * @throws InterruptedException the interrupted exception
	 * @throws ExecutionException the execution exception
	 */
	public abstract OperatorModel routeCall(int numPhone) throws InterruptedException, ExecutionException;
	
	/**
	 * Connect call.
	 * Metodo que conecta llamadas entrantes con el Operador Disponible
	 * @param operatorModel the operator model
	 * @throws InterruptedException the interrupted exception
	 */
	public abstract void connectCall (OperatorModel operatorModel) throws InterruptedException;
	
	/**
	 * End call.
	 * Metodo que finaliza llamadas y dejan al Operador Disponible
	 * @param Operator the operator
	 */
	public abstract void endCall (OperatorModel Operator);
	
}
