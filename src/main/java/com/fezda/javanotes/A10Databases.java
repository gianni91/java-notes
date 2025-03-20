package com.fezda.javanotes;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class A10Databases {
	public static void main (String[] args) {
		/*********************************************************************
		 * Prerequisites:
		 * 
		 * Get mysql on your computer
		 * 
		 * Create a new database ('jdbc_test' in this example)
		 * 
		 * Add a table to the database 
		 * (in this example, the table is 'person' with columns 'id' (INT) and 'name' (VARCHAR))
		 * 
		 * Create a mysql user for the program to use when accessing the database
		 * 
		 * Create a new Maven project in Eclipse
		 * 
		 * In your Maven project, add the mysql-connector-java dependency to the pom.xml file
		 *    Found here - https://mvnrepository.com/artifact/mysql/mysql-connector-java
		 *    Add as a <dependency> element within the <dependencies> element, 
		 *       which, if not there already, can be added after the <properties> element
		 *********************************************************************/
		

		/*********************************************************************
		 * Basic Access
		 *********************************************************************/
		try {
			Connection myConnection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jdbc_test", 			// replace jdbc_test with db name
					"jdbc_test_user", 									// replace jdbc_test_user with db user name
					"your_psswd"										// replace with your psswd
			);	
			Statement myStatement = myConnection.createStatement();
			ResultSet myResults = myStatement.executeQuery("select * from person;");	// replace 'person' with your table name
			
			// Get next line (starts before first line)
			myResults.next();
			System.out.println( myResults.getString("name") );			// replace 'name' with column name
			System.out.println( myResults.getInt("id") );				// replace 'id' with column name
			
			myResults.close();
			myStatement.close();
			myConnection.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		/*********************************************************************
		 * Safe Access (try with resources, closes things automatically)
		 *********************************************************************/
		try (
			Connection myConnection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jdbc_test", 
					"jdbc_test_user", 
					"your_psswd"
			);	
			Statement myStatement = myConnection.createStatement();
			ResultSet myResults = myStatement.executeQuery("select * from person;")
		){
			myResults.next();
			System.out.println( myResults.getString("name") );
			System.out.println( myResults.getInt("id") );
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
