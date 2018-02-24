package edu.purdue.cs59000_umlsequencediagram.message;

public class UMLReturnMessage extends UMLMessage{
	private String returnName;

	public UMLReturnMessage(String returnName) {
		super();
		this.returnName = returnName;
	}

	public String getReturnName() {
		return returnName;
	}

	public void setReturnName(String returnName) {
		this.returnName = returnName;
	}
}
