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

/**
 * This class is an superclass that represents team members,
 * contains the properties, getters and setters
 * 
 * @version 1.01 13 May 2022
 * @author Balázs Magyar
 */
public class TeamMembers{
	/** Variables */
	private String rank;

	/** Getter methods */
	public String getRank() {
		return rank;
	}

	/** Setter methods */
	public void setRank(String rank) {
		this.rank = rank;
	}

	/** This method give the rank */
	public TeamMembers(String rank) {
		super();
		this.rank = rank;
	}
}