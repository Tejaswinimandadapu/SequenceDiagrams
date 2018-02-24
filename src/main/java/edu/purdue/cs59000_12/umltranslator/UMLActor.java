package edu.purdue.cs59000_12.umltranslator;


public class UMLActor extends UMLSymbol{
	private String name;

	public UMLActor(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
