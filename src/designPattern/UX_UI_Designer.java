/*
 * %W% %E% Bal?zs Magyar
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
 * This class represents a UX/UI designer, contains the 
 * properties, getters and setters
 * 
 * @version 1.01 13 May 2022
 * @author Bal?zs Magyar
 */
public class UX_UI_Designer extends TeamMembers implements Iterator, Decorator {
	/** Variables */
	double salary=0;
	int index=0;
	
	/** Lists */
	List<UX_UI_Designer> uxUiDesigner = new ArrayList<>();
	
	/** Add a  UX/UI designer to the list */
	public void addUX_UI_Designer(UX_UI_Designer u) {
		uxUiDesigner.add(u);
	}

	/** Iterator methods */	
	@Override
	public boolean hasNext() {
		if(index < uxUiDesigner.size()){
			return true;
		}
		return false;
	}

	@Override
	public UX_UI_Designer next() {
		if(this.hasNext()){
			return uxUiDesigner.get(index++);
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
	public UX_UI_Designer() {
		super("UX/UI Designer");
		this.salary = 35.88;
		this.index = 0;
	}

	/**
	 *  This method give back the total salary of all
	 *   UX/UI designer
	 */
	public double sumCost() {
		double sum=0.0;
		for(UX_UI_Designer s:uxUiDesigner) {
			sum+=s.getSalary();
		}
		return sum;
	}

	@Override
	public String toString() {
		return "Rank: " + super.getRank() + ", \t\tSalary: $" + salary + "/hour";
	}
}