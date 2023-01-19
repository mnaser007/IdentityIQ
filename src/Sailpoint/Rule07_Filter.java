package Sailpoint;

import java.util.List;

import sailpoint.api.SailPointContext;
import sailpoint.object.Filter;
import sailpoint.object.Identity;
import sailpoint.object.QueryOptions;
import sailpoint.tools.GeneralException;

public class Rule07_Filter {

	@SuppressWarnings("null")
	public static void main(String[] args) throws GeneralException {

		
		SailPointContext context = null;
		
		Filter wgFilter= Filter.eq("workgroup", true);
		  QueryOptions qo= new QueryOptions();
		  qo.addFilter(wgFilter);
		  List<Identity> workgroups = context.getObjects(Identity.class, qo);
		  
		  if (workgroups!=null && workgroups.size()>0)
		  {
	for (Identity identity:workgroups)
	{
		
	
	    System.out.println("Identity:--->"+identity.getName());
	
		  }
	}
	}
}


