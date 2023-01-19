package Sailpoint;



import java.util.List;

import sailpoint.api.SailPointContext;
import sailpoint.object.Filter;
import sailpoint.object.QueryOptions;
import sailpoint.tools.GeneralException;
import sailpoint.object.Identity;


public class Rule06_Filter {

	@SuppressWarnings("null")
	public static void main(String[] args) throws GeneralException{
		// TODO Auto-generated method stub

		SailPointContext context=null;
		
		//......Getting all identities where department is Regional Operations..........
		
		
		Filter regionaloperation= Filter.eq("department", "Regional Operations");
		  QueryOptions qo= new QueryOptions();
		  qo.addFilter(regionaloperation);
	
		
		  List<Identity> identities= context.getObjects(Identity.class, qo);
		  if (identities!=null && identities.size()>0)
		  {
			  for (Identity identity:identities)
		 {
			System.out.println("Regional Operations Identities are:--> "+identity.getName());
		 }
		  }
		  
	}

}
