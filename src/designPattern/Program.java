/*
 * %W% %E% Balázs Magyar
 * 
 * Copyright (c) University of Miskolc All Rights Reserved.
 * 
 * This software is the confidential and proprietary information of University 
 * of Miskolc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * ccordance with the terms of the license agreement you entered into
 * with University.
 * 
 * UNIVERSITY MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package designPattern;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/** Variables */
		String productO;		//PRODUCT OWNER
		String srcumM;			//SCRUM MASTER
		String softwareD;		//SOFTWARE DEVELOPER
		String technicalW;		//TECHNICAL WRITER
		String testerT;			//TESTER
		String uxD;				//UX/UI DESIGNER
		
		/** Instantiation */
		Decorator addProductOwner = new AddTeamMemberDecorator(new ProductOwner());						
		Decorator addScrumMaster = new AddTeamMemberDecorator(new ScrumMaster());						
		Decorator addSoftwareDeveloper = new AddTeamMemberDecorator(new SoftwareDeveloper());			
		Decorator addTechnicalWriter = new AddTeamMemberDecorator(new TechnicalWriter());				
		Decorator addTester = new AddTeamMemberDecorator(new Tester());									
		Decorator addUX_UI_Designer = new AddTeamMemberDecorator(new UX_UI_Designer());					
		ProductOwner productOwner = new ProductOwner();													//Instantiation a product owner
		ScrumMaster scrumMaster = new ScrumMaster();													//Instantiation a scrum master
		SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper();									//Instantiation a software developer
		TechnicalWriter technicalWriter = new TechnicalWriter();										//Instantiation a technical writer
		Tester tester = new Tester();																	//Instantiation a tester
		UX_UI_Designer uX_UI_Designer = new UX_UI_Designer();											//Instantiation a UI/UX designer
		TeamMemberFactory teamMemberFactory = new TeamMemberFactory();									//Instantiation a Teamfactory
		Scanner sc = new Scanner(System.in);															//Instantiation a scanner
		
		System.out.println("\t-- TeamMaker --");
		
		/** Create a product owner */
		int dbProductO = 0;
		do {
			System.out.println("How many Product Owner do you want to add?");
			dbProductO = sc.nextInt();								// read in an integer
		} while (dbProductO < 1);									// minimum number is 1 to create
		for (int i = 0; i < dbProductO; i++) {
			productO="PRODUCT OWNER";
			productOwner.addProductOwner((ProductOwner) 
					teamMemberFactory.getTeamMembers(productO));	// add the product owner to the list
			addProductOwner.decorate();								// invoking the decorator
			if (i == (dbProductO - 1)) {							// just for the look
				System.out.println();
			}
		}

		/** Create a scrum master */
		int  dbScrumM= 0;
		do {
			System.out.println("How many Scrum Master do you want to add?");
			dbScrumM = sc.nextInt();								// read in an integer
		} while (dbScrumM < 1);										// minimum number is 1 to create
		for (int i = 0; i < dbScrumM; i++) {
			srcumM="SCRUM MASTER";
			scrumMaster.addScrumMaster((ScrumMaster) 
					teamMemberFactory.getTeamMembers(srcumM));		// add the product owner to the list
			addScrumMaster.decorate();								// invoking the decorator
			if (i == (dbScrumM - 1)) {								// just for the look
				System.out.println();
			}
		}
		
		/** Create a software developer */
		int  dbSoftwareD= 0;
		do {
			System.out.println("How many Software Developer do you want to add?");
			dbSoftwareD = sc.nextInt(); 								// read in an integer
		} while (dbSoftwareD < 1);										// minimum number is 1 to create
		for (int i = 0; i < dbSoftwareD; i++) {
			softwareD="SOFTWARE DEVELOPER";
			softwareDeveloper.addSoftwareDeveloper((SoftwareDeveloper) 
					teamMemberFactory.getTeamMembers(softwareD));		// add the product owner to the list
			addSoftwareDeveloper.decorate();							// invoking the decorator
			if (i == (dbSoftwareD - 1)) {								// just for the look
				System.out.println();
			}
		}
		
		/** Create a technical writer */
		int dbTechnicalW = 0;
		do {
			System.out.println("How many Technical Writer do you want to add?");
			dbTechnicalW = sc.nextInt();								// read in an integer
		} while (dbTechnicalW < 1);										// minimum number is 1 to create
		for (int i = 0; i < dbTechnicalW; i++) {
			technicalW="TECHNICAL WRITER";
			technicalWriter.addTechnicalWriter((TechnicalWriter) 
					teamMemberFactory.getTeamMembers(technicalW));		// add the product owner to the list
			addTechnicalWriter.decorate();								// invoking the decorator
			if (i == (dbTechnicalW - 1)) {								// just for the look
				System.out.println();
			}
		}
		
		/** Create a technical writer */
		int dbTester = 0;
		do {
			System.out.println("How many Tester do you want to add?");
			dbTester = sc.nextInt();				// read in an integer
		} while (dbTester < 1);						// minimum number is 1 to create
		for (int i = 0; i < dbTester; i++) {
			testerT="TESTER";
			
			/* add the product owner to the list */
			tester.addTester((Tester) teamMemberFactory.getTeamMembers(testerT));
			addTester.decorate();				// invoking the decorator
			if (i == (dbTester - 1)) {			// just for the look
				System.out.println();
			}
		}
		
		/** Create a technical writer */
		int dbUxD = 0;
		do {
			System.out.println("How many UX/UI Designer do you want to add?");
			dbUxD = sc.nextInt();								// read in an integer
		} while (dbUxD < 1);									// minimum number is 1 to create
		for (int i = 0; i < dbUxD; i++) {
			uxD="UX/UI DESIGNER";
			uX_UI_Designer.addUX_UI_Designer((UX_UI_Designer) 
					teamMemberFactory.getTeamMembers(uxD));		// add the product owner to the list
			addUX_UI_Designer.decorate();						// invoking the decorator
			if (i == (dbUxD - 1)) {								// just for the look
				System.out.println();
			}
		}
		
		sc.close();
		
		/** Iterates through the list */
		while (productOwner.hasNext()) {
			System.out.println(productOwner.next());
		}
		System.out.println();
		while (scrumMaster.hasNext()) {
			System.out.println(scrumMaster.next());
		}
		System.out.println();
		while (softwareDeveloper.hasNext()) {
			System.out.println(softwareDeveloper.next());
		}
		System.out.println();
		while (technicalWriter.hasNext()) {
			System.out.println(technicalWriter.next());
		}
		System.out.println();
		while (tester.hasNext()) {
			System.out.println(tester.next());
		}
		System.out.println();
		while (uX_UI_Designer.hasNext()) {
			System.out.println(uX_UI_Designer.next());
		}
		
		/** Summary printout */
		System.out.println("\n" + dbSoftwareD + " Software Developer cost:\t $" 
							+ softwareDeveloper.sumCost() + "/hour");
		System.out.println(dbScrumM + " Scrum Master cost:\t\t $" + scrumMaster.sumCost() 
							+ "/hour");
		System.out.println(dbProductO + " Product Owner cost:\t\t $" + productOwner.sumCost() 
							+ "/hour");
		System.out.println(dbTechnicalW + " Technical Writer cost:\t $" + technicalWriter.sumCost() 
							+ "/hour");
		System.out.println(dbTester + " Tester cost:\t\t\t $" + tester.sumCost() + "/hour");
		System.out.println(dbUxD + " UX/UI Designer cost:\t\t $" + uX_UI_Designer.sumCost() 
							+ "/hour");
		
		double t = softwareDeveloper.sumCost() + scrumMaster.sumCost() + productOwner.sumCost() 
					+ technicalWriter.sumCost() + tester.sumCost() + uX_UI_Designer.sumCost();
		System.out.println("\nTotal cost: $" + t + "/hour");	
	}
}