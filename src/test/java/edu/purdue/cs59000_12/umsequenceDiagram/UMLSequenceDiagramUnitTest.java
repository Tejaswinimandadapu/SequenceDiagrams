package edu.purdue.cs59000_12.umsequenceDiagram;

import static org.junit.Assert.assertTrue;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import edu.purdue.cs59000.logging.UMLJarLogger;
import edu.purdue.cs59000_12.umltranslator.UMLSequenceDiagram;
import edu.purdue.cs59000_12.umltranslator.UMLSymbol;

public class UMLSequenceDiagramUnitTest {
	

	
	String initalizeText = "Sequence Diagram created with a logging file";
	String fileName = "umlSequenceDiagramConstructor.txt";
	@Before
	@Test
	public void testLoggerCreationWtihConstructor() {
		//This constructor does not exist
		//UMLSequenceDiagram umlSequenceDiagram = new UMLSequenceDiagram("C:/junitTest/","umlSequenceDiagramConstructor.txt",null,Level.ALL, true);
		File file = new File("c:/junitTest/umlSequenceDiagramConstructor.txt");	
		assertTrue(file.exists());
		
		
		
	}
	
	
	@Test
	public void testFileContent() throws IOException {
		String stringToTest = "abcdefg";
		File file = new File("c:/junitTest/"+fileName);
		file.deleteOnExit();
		file.setReadable(true);
		
		FileReader reader =new FileReader(file);
		BufferedReader bufferReader = new BufferedReader(reader);
		
		boolean initTextFound = false; 
		while(bufferReader.ready()) {
			String line = bufferReader.readLine();
			if (line.contains(initalizeText)) {
				initTextFound = true;
				break; 
			}
							
		}

		assertTrue(initTextFound);
	
		
	
		
	}
	
	
	

}
