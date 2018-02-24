package edu.purdue.cs59000_umlcontainer;

/**
 * TODO:
 * Implement HasChildContainer methods (getChildContainer, setChildContainer)
 * Implement HasParentContainer methods (getParentContainer, setParentContainer)
 */
public abstract class UMLContainer implements HasParentContainer, HasChildContainer{
	private UMLContainer parentContainer;
	private UMLContainer childContainer;
	
	@Override
	public UMLContainer getChildContainer() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setChildContainer(UMLContainer umlContainer) {
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
