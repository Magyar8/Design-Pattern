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

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a technical writer, contains the 
 * properties, getters and setters
 * 
 * @version 1.01 13 May 2022
 * @author Balázs Magyar
 */
public class TechnicalWriter extends TeamMembers implements Iterator, Decorator {
	/** Variables */
	double salary=0;
	int index=0;
	
	/** Lists */
	List<TechnicalWriter> technicalWriter = new ArrayList<>();
	
	/** Add a technical writer to the list */
	public void addTechnicalWriter(TechnicalWriter t) {
		technicalWriter.add(t);
	}
	
	/** Iterator methods */
	@Override
	public boolean hasNext() {
		if(index < technicalWriter.size()){
			return true;
		}
		return false;
	}

	@Override
	public TechnicalWriter next() {
		if(this.hasNext()){
			return technicalWriter.get(index++);
		}
		return null;
	}

	/** Decorator methods */
	@Override
	public void decorate() {
		System.out.print(super.getRank());		
	}

	/** Getter methods */
	public double getSalary() {
		return salary;
	}

	/** Setter methods */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/** This method give the salary and list index */
	public TechnicalWriter() {
		super("Technical Writer");
		this.salary = 25.03;
		this.index = 0;
	}
	
	/**
	 *  This method give back the total salary of all
	 *  technical writer
	 */
	public double sumCost() {
		double sum=0.0;
		for(TechnicalWriter s:technicalWriter) {
			sum+=s.getSalary();
		}
		return sum;
	}

	@Override
	public String toString() {
		return "Rank: " + super.getRank() + ", \tSalary: $" + salary + "/hour";
	}
}