package edu.purdue.cs59000_umlsequencediagram.message;

import java.util.List;

import edu.purdue.cs59000_12.umltranslator.HasDestination;
import edu.purdue.cs59000_12.umltranslator.HasSource;
import edu.purdue.cs59000_12.umltranslator.UMLClass;
import edu.purdue.cs59000_12.umltranslator.UMLSymbol;
import edu.purdue.cs59000_umlcontainer.HasParentContainer;
import edu.purdue.cs59000_umlcontainer.UMLContainer;

public abstract class UMLMessage extends UMLSymbol implements HasSource, HasDestination, HasParentContainer{
	private UMLSymbol source;
	private UMLSymbol destination;
	private UMLContainer container;
	private List<UMLMessage> nestedMessages;
	
	public UMLClass getInvoker() {
	    UMLSymbol temp = this.getSource();
	    
	    while (temp.getSource() != null) {     // follow sources to reach UMLClass
	      temp = temp.getSource();
	    }
	    
	    if (temp instanceof UMLClass) {
	      return (UMLClass) temp;
	    } else {
	      throw new IllegalArgumentException();    // replace with UMLSequenceDiagramException,.... UMLSequenceStructureException?
	    }
	}
	
	public UMLClass getReceiver() {
		UMLSymbol temp = this.getDestination();
		
		while (temp.getSource() != null) {
		  temp = temp.getSource();
		}
		
		if (temp instanceof UMLClass) {
		  return (UMLClass) temp;
		} else {
		  throw new IllegalArgumentException();   // replace exception
		}
	}
	
	public List<UMLMessage> getNestedMessages() {
		return nestedMessages;
	}
	
	public void addNestedMessage(UMLMessage message) {    // nested messages should be added by the parser in the sequence they are invoked
	    nestedMessages.add(message);
	}
	
	public void addNestedMessages(List<UMLMessage> messages) {
	    nestedMessages.addAll(messages);
	}
	
	@Override
	public UMLSymbol getDestination() {
	    return destination;
	}
	
	@Override
	public void setDestination(UMLSymbol umlSymbol) {
		destination = umlSymbol;
	}
	
	@Override
	public UMLSymbol getSource() {
		return source;
	}
	
	@Override
	public void setSource(UMLSymbol umlSymbol) {
		source = umlSymbol;
	}
	
	@Override
	public UMLContainer getParentContainer() {
		return container;
	}
	
	@Override
	public void setParentConatiner(UMLContainer umlContainer) {
	    container = umlContainer;
	}
	

}
