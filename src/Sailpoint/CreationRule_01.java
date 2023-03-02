package Sailpoint;

import java.util.ArrayList;
import java.util.List;

import sailpoint.api.SailPointContext;
import sailpoint.integration.Util;
import sailpoint.object.Filter;
import sailpoint.object.QueryOptions;
import sailpoint.object.ResourceObject;
import sailpoint.tools.GeneralException;
import sailpoint.object.Identity;
import sailpoint.tools.*;

public class CreationRule_01 {

	public static void main(String[] args) {
		
		SailPointContext context=null;
		 ResourceObject account=null;
		org.apache.commons.logging.Log log=null;
		Identity identity=null;
		
		/*String  firstName="Naser";   
String LastName="Developer"; 
		   String FinaName=firstName.substring(0,1);
		FinaName=LastName+".".concat(FinaName);    
		    System.out.println(FinaName);

		log.debug("creation is starting.....");*/
		
 log.debug("creation is starting.....");
		String firstName=(String)account.getAttribute("firstName");
		 String lastName=(String)account.getAttribute("lastName");
		 String FinaName=firstName.substring(0,1);
	FinaName=lastName+".".concat(FinaName);
		 System.out.println(FinaName);
		 identity.setName(FinaName);
		  log.debug("creation is starting.....");

		
}
}
