/**
 * 
 */
package com.almundo.callcenter.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.concurrent.CompletableFuture;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.almundo.callcenter.CallCenterApplication;
import com.almundo.callcenter.controller.CallController;
import com.almundo.callcenter.model.OperatorModel;
import com.almundo.callcenter.service.CallService;

/**
 * @author Omar
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CallCenterApplication.class)
@ActiveProfiles("test")
public class CallServiceImplTest {

	public static final Log LOG = LogFactory.getLog(CallController.class);

	@Autowired
	CallService callService;
	
	/**
	 * Test method for
	 * {@link com.almundo.callcenter.service.impl.CallServiceImpl#receiveCall(int)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testReceiveCall() throws Exception {
		
		// PRIEMERO DEBE EJECUTAR OperatorServiceTest
		
		CompletableFuture<OperatorModel> call1 = callService.receiveCall(1);
		
		CompletableFuture<OperatorModel> call2 = callService.receiveCall(2);

		CompletableFuture<OperatorModel> call3 = callService.receiveCall(3);

		CompletableFuture<OperatorModel> call4 = callService.receiveCall(4);

		CompletableFuture<OperatorModel> call5 = callService.receiveCall(5);

		CompletableFuture<OperatorModel> call6 = callService.receiveCall(6);

		CompletableFuture<OperatorModel> call7 = callService.receiveCall(7);

		CompletableFuture<OperatorModel> call8 = callService.receiveCall(8);

		CompletableFuture<OperatorModel> call9 = callService.receiveCall(9);

		CompletableFuture<OperatorModel> call10 = callService.receiveCall(10);

		CompletableFuture.allOf(call1, call2, call3, call4, call5, call6, call7, call8, call9, call10).join();

		assertNotNull(call1.get().getName());
		LOG.info(call1.get().getNumContact() + " Conectado con " + call1.get().getName());
		assertNotNull(call2.get().getName());
		LOG.info(call2.get().getNumContact() + " Conectado con " + call2.get().getName());
		assertNotNull(call3.get().getName());
		LOG.info(call3.get().getNumContact() + " Conectado con " + call3.get().getName());
		assertNotNull(call4.get().getName());
		LOG.info(call4.get().getNumContact() + " Conectado con " + call4.get().getName());
		assertNotNull(call5.get().getName());
		LOG.info(call5.get().getNumContact() + " Conectado con " + call5.get().getName());
		assertNotNull(call6.get().getName());
		LOG.info(call6.get().getNumContact() + " Conectado con " + call6.get().getName());
		assertNotNull(call7.get().getName());
		LOG.info(call7.get().getNumContact() + " Conectado con " + call7.get().getName());
		assertNotNull(call8.get().getName());
		LOG.info(call8.get().getNumContact() + " Conectado con " + call8.get().getName());
		assertNotNull(call9.get().getName());
		LOG.info(call9.get().getNumContact() + " Conectado con " + call9.get().getName());
		assertNotNull(call10.get().getName());
		LOG.info(call10.get().getNumContact() + " Conectado con " + call10.get().getName());

	}
	
	

	/**
	 * Test method for
	 * {@link com.almundo.callcenter.service.impl.CallServiceImpl#receiveCall(int)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testReceiveCallOperatorNotAvailable() throws Exception {

		CompletableFuture<OperatorModel> call = callService.receiveCall(777);
		CompletableFuture.allOf(call).join();
		
		assertNull(call.get().getName());
		LOG.info(call.get().getNumContact() + " Espere Por Favor");

	}
	

}
