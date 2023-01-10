package Sailpoint;


import sailpoint.object.Identity;
import sailpoint.tools.GeneralException;

import java.util.List;

import com.sun.glass.ui.Application;

import sailpoint.api.SailPointContext;

public class Rule01 {

	public static void main(String[] args) throws GeneralException {			
		SailPointContext context=null;
	
	//  Given user getting fitst name and last name
	
		Identity identityName = context.getObjectByName(Identity.class, "Aaron.Nichols");
		if(identityName != null) {
		System.out.println("firstName: "+identityName.getFirstname());
		
		// List<Identity> identity = context.getObjects(Identity.class);
	}

	}
}
		  