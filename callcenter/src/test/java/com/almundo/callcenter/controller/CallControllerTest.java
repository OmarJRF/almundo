/**
 * 
 */
package com.almundo.callcenter.controller;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.CompletableFuture;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.almundo.callcenter.model.OperatorModel;
import com.almundo.callcenter.service.CallService;

/**
 * @author Omar
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("test")
public class CallControllerTest {

	@InjectMocks
	CallController callController;

	private MockMvc mvc;

	@MockBean
	private CallService callService;

	@Before
	public void initTests() {
		MockitoAnnotations.initMocks(this);
		mvc = MockMvcBuilders.standaloneSetup(callController).build();
	}

	/**
	 * Test method for
	 * {@link com.almundo.callcenter.controller.CallController#receiveCall(int)}.
	 * @throws Exception 
	 */
	@Test
	public void testReceiveCall() throws Exception {
		
		OperatorModel operator1 = new OperatorModel();
		operator1.setId(1);;
		operator1.setName("Omar");
		operator1.setNumContact(123);
		
		CompletableFuture<OperatorModel> operator = CompletableFuture.completedFuture(operator1);
		
		Mockito.when(callService.receiveCall(123)).thenReturn(operator);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/almundo/receiveCall/123")
				.accept(MediaType.ALL_VALUE);
		
		MvcResult result = mvc.perform(requestBuilder).andReturn();
		
		String expected = "123 Conectado con Operador Omar";

		assertEquals(expected, result.getResponse().getContentAsString());
		
	}

}
