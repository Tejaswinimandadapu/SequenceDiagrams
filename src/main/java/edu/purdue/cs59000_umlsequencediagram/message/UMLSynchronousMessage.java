package edu.purdue.cs59000_umlsequencediagram.message;

import java.util.List;


/**
 * TODO:
 * + UMLSynchronousMessage (String, String) 
 * + UMLSynchronousMessage(String, String, List<UMLMessageArgument>) 
 * + addArgument(UMLMessageArguement):void 
 * + addArguments(List<UMLMessageArgument>):void 
 */

public class UMLSynchronousMessage extends UMLMessage{
	private String name;
	private List<UMLMessageArgument> arguments;
	private String returnType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReturnType() {
		return returnType;
	}
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	public List<UMLMessageArgument> getArguments() {
		return arguments;
	}
	public UMLSynchronousMessage(String sname,String sreturnType)
	{
		this.name=sname;
		this.returnType=sreturnType;
	}
	public UMLSynchronousMessage(String name,String returnType,List<UMLMessageArgument>argument)
	{
		this.name=name;
		this.returnType=returnType;
		this.arguments=argument;
	}
	public void addArgument(UMLMessageArgument argument)
	{
		arguments.add(argument);
	}
	public void addArguments(List<UMLMessageArgument> argument)
	{
	    this.arguments.addAll(argument);
	}
}
