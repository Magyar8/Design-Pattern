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
 * TeamMemberFactory class to generate object of concrete 
 * class based on given information.
 * 
 * @version 1.01 13 May 2022
 * @author Balázs Magyar
 */
public class TeamMemberFactory implements Factory{

	/** Create objects with factory method */
	@Override
	public TeamMembers getTeamMembers(String TeamMembersType) {
		if(TeamMembersType == null){
			return null;
		}
		
		if(TeamMembersType.equalsIgnoreCase("PRODUCT OWNER")){
			
			/* Create product owner */
			return new ProductOwner();	
		} else if(TeamMembersType.equalsIgnoreCase("SCRUM MASTER")){
			
			/* Create scrum master */
			return new ScrumMaster();
		} else if(TeamMembersType.equalsIgnoreCase("SOFTWARE DEVELOPER")){
			
			/* Create software developer */
			return new SoftwareDeveloper();
		} else if(TeamMembersType.equalsIgnoreCase("TECHNICAL WRITER")){
			
			/* Create technical writer */
			return new TechnicalWriter();
		} else if(TeamMembersType.equalsIgnoreCase("TESTER")){
			
			/* Create tester */
			return new Tester();
		} else if(TeamMembersType.equalsIgnoreCase("UX/UI DESIGNER")){
			
			/* Create UX/UI designer */
			return new UX_UI_Designer();
		}
		return null;
	}
}