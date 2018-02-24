package edu.purdue.cs59000_12.umltranslator;

import java.util.List;

import edu.purdue.cs59000_umlsequencediagram.message.UMLMessage;

public class UMLClass extends UMLSymbol {
	private String className;
	private String instanceName;
	private List<UMLMessage> messages;
	
	public UMLClass(String className) {
		super();
		this.className = className;
	}

	public UMLClass(String className, String instanceName) {
		super();
		this.className = className;
		this.instanceName = instanceName;
	}

	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public String getInstanceName() {
		return instanceName;
	}
	
	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}
	
	public List<UMLMessage> getMessages() {
		return messages;
	}
	
	public void addMessage(UMLMessage message) {
	    messages.add(message);
	}
	
	public void addMessages(List<UMLMessage> messages) {
	    this.messages.addAll(messages);
	}
}
