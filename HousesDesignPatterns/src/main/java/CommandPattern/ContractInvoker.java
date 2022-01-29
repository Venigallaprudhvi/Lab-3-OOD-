package CommandPattern;

public class ContractInvoker {
	 private Command command;
	  public void setCommand(Command command){
	    this.command = command;
	  }
	  public boolean pressButton(){
	    return command.build();
	  }
}
