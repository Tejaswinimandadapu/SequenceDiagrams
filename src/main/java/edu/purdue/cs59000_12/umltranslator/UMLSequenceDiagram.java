package edu.purdue.cs59000_12.umltranslator;

import java.util.List;

import edu.purdue.cs59000_umlsequencediagram.message.UMLMessageArgument;

/**
 * TODO:
 * 
 * ITER 1
 * + UMLSequenceDiagram() 
 * + addSymbol(UMLSymbol):void 
 * + addSymbols(List<UMLSymbol>):void 
 * + getSymbols():List<UMLSymbol>
 * 
 * ITER 2
 * + compare(UMLSequenceDiagram):boolean 
 * + removeSymbol(int):UMLSymbol 
 * + removeSymbols(List<int>):List<UMLSymbol>
 * + updateSymbol(int):UMLSymbol 
 * + updateSymbols(List<int>):List<UMLSymbol>
 */

public class UMLSequenceDiagram {
	private List<UMLSymbol> umlSymbols;
	UMLMessageArgument uma ;
	public void addSymbol(UMLSymbol symbol)
	{
		umlSymbols.add(symbol);
	}
	public void addSymbols (List<UMLSymbol> symbolList)
	{
		this.umlSymbols.addAll(symbolList);
	}
	public List<UMLSymbol>getSymbols()
	{
		return umlSymbols;
	}
    public boolean compare(UMLSequenceDiagram d1, UMLSequenceDiagram d2)
    {
    	if(d1.uma.getName()==d2.uma.getName() &&uma.getDataType()==uma.getDataType()&&uma.getInitializedTo()==uma.getInitializedTo())
    	{
    		return true;
    	}
    	else
    		return false;
    	
    }
    public void removeSymbol(int umlSymbol )
    {
    	umlSymbols.remove(umlSymbol);
    }
    public void removeSymbols(List<Integer> umlSymbols)
    {
    	this.umlSymbols.removeAll(umlSymbols);
    }
    public List<UMLSymbol> updateSymbols(List<Integer> umlSymbols)
    {
		return null;
    	
    }
    }

