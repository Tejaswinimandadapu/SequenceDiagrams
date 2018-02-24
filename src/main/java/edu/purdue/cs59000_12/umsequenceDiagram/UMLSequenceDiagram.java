package edu.purdue.cs59000_12.umsequenceDiagram;

import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import edu.purdue.cs59000.logging.UMLJarLogger;
import edu.purdue.cs59000_12.umltranslator.UMLSymbol;

public class UMLSequenceDiagram {
	
	final static Logger logger = Logger.getLogger(UMLSequenceDiagram.class);
	
	List<UMLSymbol> umlSymbols;
	
	/**
	 * TODO:
	 * + addSymbols(UMLSymbol):void 
	 * + addSymbols(UMLSymbol[]):void
	 * Maybe a method to iterate through umlSymbols list/return the list
	 */
	
	/*
	 * Constructor to use jar?
	 * TODO: Decide where "main" class should be 
	 */
	
	public UMLSequenceDiagram( String exportFileLocation,String fileName, String pattern,Level level, boolean setAppend){
		new  UMLJarLogger(exportFileLocation, fileName, pattern, level, setAppend);	
		
		logger.info("Sequence Diagram created with a logging file:" + UMLJarLogger.getFileLocation());
	
	}
	

}
