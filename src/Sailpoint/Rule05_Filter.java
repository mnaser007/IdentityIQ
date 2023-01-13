package Sailpoint;

import sailpoint.tools.GeneralException;
import sailpoint.object.Identity;
import sailpoint.object.QueryOptions;
import java.util.ArrayList;
import java.util.List;

import sailpoint.api.SailPointContext;
import sailpoint.object.Application;
import sailpoint.object.Filter;

public class Rule05_Filter {

	@SuppressWarnings("null")
	public static void main(String[] args) throws GeneralException {
		
		SailPointContext context=null;
		
		//Getting user data with department 
		
		
		ArrayList identityName= new ArrayList();
		Filter DptFilter =  Filter.eq("department" , "Information Technology");
		 QueryOptions qo=new QueryOptions();
		 qo.addFilter(DptFilter);
		 
		 List<Identity> identities = context.getObjects(Identity.class, qo);
		 
		 if (identities!=null && identities.size()>0)
		 {
		 for (Identity identity:identities) 
		 {
			 System.out.println("Identity: "+identity.getName());
			 System.out.println("Identity FirstName: "+identity.getFirstname());
			
			 
			 identityName.add(identity.getName()+identity.getFirstname());
		 }
		
		 }
		
	}
}




