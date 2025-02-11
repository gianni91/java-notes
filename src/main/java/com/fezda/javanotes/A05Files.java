package com.fezda.javanotes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A05Files {

	public static void main (String[] args) {
		readFile();
//		readFileSafely();
//		readWholeFile();
//		writeToFile();
//		appendToFile();
	}
	
	public static void readFile () {
		try {
			BufferedReader myReader = new BufferedReader( new FileReader("myFolder\\myFile.txt") );
			String myLine1 = myReader.readLine();
			System.out.println(myLine1);
			myReader.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readFileSafely () {
		// Uses Try with Resources - To automatically close opened files
		try ( BufferedReader myReader = new BufferedReader( new FileReader("myFolder\\myFile.txt") ) )
		{
			String myLine1 = myReader.readLine();
			System.out.println(myLine1);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readWholeFile () {
		try (BufferedReader myReader = new BufferedReader( new FileReader("myFolder\\myFile.txt") ) ) 
		{
			String line;
			while ( (line = myReader.readLine()) != null ) {
				System.out.println( line );
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeToFile () {
		try (BufferedWriter myWriter = new BufferedWriter(new FileWriter("myFolder\\myFile.txt")) )
		{
			myWriter.write("Written text\n");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void appendToFile () {
		// Same as for writing, but just have to add "true" for the FileWriter parameter 2
		try (BufferedWriter myWriter = new BufferedWriter(new FileWriter("myFolder\\myFile.txt", true)) )	
		{
			myWriter.write("Appended text\n");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
