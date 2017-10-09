/**
 * 
 */
package com.almundo.callcenter.service.impl;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.almundo.callcenter.CallCenterApplication;
import com.almundo.callcenter.model.OperatorModel;
import com.almundo.callcenter.service.OperatorService;

/**
 * @author Omar
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CallCenterApplication.class)
@ActiveProfiles("test")
public class OperatorServiceTest {

	@Autowired
	OperatorService operatorService;
	
	/**
	 * Test method for {@link com.almundo.callcenter.service.impl.OperatorServiceImpl#save(com.almundo.callcenter.model.OperatorModel)}.
	 */
	@Test
	public void testSave() {

		OperatorModel operator1 = new OperatorModel();
		operator1.setId(1);
		operator1.setName("OperadorAlmundo 1");
		operator1.setPosition("Operador");
		operator1.setAvailable(true);
		
		operatorService.save(operator1);

		OperatorModel found = operatorService.findById(operator1.getId());
		assertThat(found.getId()).isEqualTo(operator1.getId());

		//**************************************//
		OperatorModel operator2 = new OperatorModel();
		operator2.setId(2);
		operator2.setName("OperadorAlmundo 2");
		operator2.setPosition("Operador");
		operator2.setAvailable(true);
		
		operatorService.save(operator2);

		OperatorModel found2 = operatorService.findById(operator2.getId());
		assertThat(found2.getId()).isEqualTo(operator2.getId());

		//**************************************//
		OperatorModel operator3 = new OperatorModel();
		operator3.setId(3);
		operator3.setName("OperadorAlmundo 3");
		operator3.setPosition("Operador");
		operator3.setAvailable(true);
		
		operatorService.save(operator3);

		OperatorModel found3 = operatorService.findById(operator3.getId());
		assertThat(found3.getId()).isEqualTo(operator3.getId());
		
		//**************************************//
		OperatorModel operator4 = new OperatorModel();
		operator4.setId(4);
		operator4.setName("OperadorAlmundo 4");
		operator4.setPosition("Operador");
		operator4.setAvailable(true);
		
		operatorService.save(operator4);

		OperatorModel found4 = operatorService.findById(operator4.getId());
		assertThat(found4.getId()).isEqualTo(operator4.getId());

		//**************************************//
		OperatorModel operator5 = new OperatorModel();
		operator5.setId(5);
		operator5.setName("OperadorAlmundo 5");
		operator5.setPosition("Operador");
		operator5.setAvailable(true);
		
		operatorService.save(operator5);

		OperatorModel found5 = operatorService.findById(operator5.getId());
		assertThat(found5.getId()).isEqualTo(operator5.getId());

		//**************************************//
		OperatorModel operator6 = new OperatorModel();
		operator6.setId(6);
		operator6.setName("OperadorAlmundo 6");
		operator6.setPosition("Operador");
		operator6.setAvailable(true);
		
		operatorService.save(operator6);

		OperatorModel found6 = operatorService.findById(operator6.getId());
		assertThat(found6.getId()).isEqualTo(operator6.getId());

		//**************************************//
		OperatorModel operator7 = new OperatorModel();
		operator7.setId(7);
		operator7.setName("OperadorAlmundo 7");
		operator7.setPosition("Operador");
		operator7.setAvailable(true);
		
		operatorService.save(operator7);

		OperatorModel found7 = operatorService.findById(operator7.getId());
		assertThat(found7.getId()).isEqualTo(operator7.getId());
		
		//**************************************//
		OperatorModel operator8 = new OperatorModel();
		operator8.setId(8);
		operator8.setName("OperadorAlmundo 8");
		operator8.setPosition("Operador");
		operator8.setAvailable(true);
		
		operatorService.save(operator8);

		OperatorModel found8 = operatorService.findById(operator8.getId());
		assertThat(found8.getId()).isEqualTo(operator8.getId());
		
		//**************************************//
		OperatorModel operator9 = new OperatorModel();
		operator9.setId(9);
		operator9.setName("SupervisorAlmundo 9");
		operator9.setPosition("Supervisor");
		operator9.setAvailable(true);
		
		operatorService.save(operator9);

		OperatorModel found9 = operatorService.findById(operator9.getId());
		assertThat(found9.getId()).isEqualTo(operator9.getId());
					
		//**************************************//
		OperatorModel operator10 = new OperatorModel();
		operator10.setId(10);
		operator10.setName("DirectorAlmundo 10");
		operator10.setPosition("Director");
		operator10.setAvailable(true);
		
		operatorService.save(operator10);

		OperatorModel found10 = operatorService.findById(operator10.getId());
		assertThat(found10.getId()).isEqualTo(operator10.getId());
	}

}
