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
 * The base decorator class follows the same interface as the
 * other components. The primary purpose of this class is to
 * define the wrapping interface for all concrete decorators.
 * 
 * @version 1.01 13 May 2022
 * @author Balázs Magyar
 */
public class TeamMemberDecorator implements Decorator{
	/** Object variable */
	protected Decorator decoratedTeamMember;

	/** Creates an instance of teammemberdecorator */
	public TeamMemberDecorator(Decorator decoratedTeamMember){
		this.decoratedTeamMember = decoratedTeamMember;
	}
	
	/** Decorator methods */
	@Override
	public void decorate() {
		decoratedTeamMember.decorate();	
	}
}