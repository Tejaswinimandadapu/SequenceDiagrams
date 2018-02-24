package edu.purdue.cs59000_12.umltranslator;

/**
 * TODO:
 * Implement HasSource methods (getSource, setSource)
 *
 */
public class UMLLifeline extends UMLSymbol implements HasSource{
	private UMLSymbol source;

	public UMLLifeline(UMLSymbol source) {
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
	
}
