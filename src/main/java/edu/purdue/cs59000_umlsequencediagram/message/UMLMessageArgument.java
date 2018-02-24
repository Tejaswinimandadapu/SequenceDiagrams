package edu.purdue.cs59000_umlsequencediagram.message;

/**
 * TODO:
 * + UMLMessageArgument(String) 
 * + UMLMessageArgument(String, String, boolean) 
 * + UMLMessageArgument(String, String, String, boolean) 
 */

public class UMLMessageArgument {
	private String name;
	@SuppressWarnings("unused")
	private String argument;
	@SuppressWarnings("unused")
	private String messageargument;
	@SuppressWarnings("unused")
	private String messageargument1;
	private String messageargument2;
	boolean value;
	private String dataType;
	private String initializedTo;
	private boolean hasVarArgs;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getInitializedTo() {
		return initializedTo;
	}
	public void setInitializedTo(String initializedTo) {
		this.initializedTo = initializedTo;
	}
	public boolean isHasVarArgs() {
		return hasVarArgs;
	}
	public void setHasVarArgs(boolean hasVarArgs) {
		this.hasVarArgs = hasVarArgs;
	}
	public UMLMessageArgument(String argument)
	{
		this.argument=argument;
	}
	public UMLMessageArgument(String messageargument1,String messsageargument2,boolean b)
	{
		this.messageargument=messageargument1;
		this.messageargument1=messageargument2;
		this.value=b;
	}
	public UMLMessageArgument(String messageargument1,String messageargument2,String messageargument3,boolean b)
	{
		this.messageargument=messageargument1;
		this.messageargument1=messageargument2;
		this.messageargument=messageargument3;
		this.value=b;
	}
	}
