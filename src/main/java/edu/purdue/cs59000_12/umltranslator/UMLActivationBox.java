package edu.purdue.cs59000_12.umltranslator;

import edu.purdue.cs59000_umlcontainer.HasParentContainer;
import edu.purdue.cs59000_umlcontainer.UMLContainer;

/**
 * TODO:
 * Implement HasSource methods (getSource, setSource)
 * Implement HasParentContainer methods
 *
 */

public class UMLActivationBox extends UMLSymbol implements HasSource, HasParentContainer{
	private UMLSymbol source;
	
	public UMLActivationBox(UMLSymbol source) {
		super();
		this.source = source;
	}

	@Override
	public UMLSymbol getSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSource(UMLSymbol umlSymbol) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UMLContainer getParentContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setParentConatiner(UMLContainer umlContainer) {
		// TODO Auto-generated method stub
		
	}


}
