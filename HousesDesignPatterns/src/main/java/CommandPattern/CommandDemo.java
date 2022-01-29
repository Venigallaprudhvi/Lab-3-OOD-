package CommandPattern;

public class CommandDemo {

	public static void main(String[] args) {
		 ContractInvoker invoker = new ContractInvoker();
		    Command commercial = new BuildCommercialComplexCommand();
		    Command domestic = new BuildDomesticSocietyCommand();

		    
		    invoker.setCommand(commercial);
		    invoker.pressButton();


		    invoker.setCommand(domestic);
		    invoker.pressButton();

	}

}
