package edu.purdue.cs59000_12.umltranslator;

import edu.purdue.cs59000_12.umltranslator.HasSource;

public abstract class UMLSymbol implements HasSource {
	

	private String id;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public UMLSymbol getSource() {     // if source is null, this means the UMLSymbol is a UMLClass or UMLActor. Override for all other classes
	  return null;
	}
	
	public void setSource(UMLSymbol symbol) {
	  // do nothing
	}
}
