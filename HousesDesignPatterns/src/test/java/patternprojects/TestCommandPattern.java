package patternprojects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import CommandPattern.Command;
import CommandPattern.ContractInvoker;

import CommandPattern.BuildDomesticSocietyCommand;
import CommandPattern.BuildCommercialComplexCommand;


class TestCommandPattern {

	@Test
	void testDomestic() {
			ContractInvoker invoker = new ContractInvoker();
		    Command domestic = new BuildDomesticSocietyCommand();

		    invoker.setCommand(domestic);
		    invoker.pressButton();
		 
		 //Invoker invokes command 
		 assertEquals(false, invoker.pressButton());
	}


	@Test
	void testCommercial() {
			ContractInvoker invoker = new ContractInvoker();
		    Command commercial = new BuildCommercialComplexCommand();
		    
			invoker.setCommand(commercial); 
			invoker.pressButton();
			 
		 
		 //Invoker invokes command 
		 assertEquals(true, invoker.pressButton());
	}

	

}
