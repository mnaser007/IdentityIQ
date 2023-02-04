package Sailpoint;

import sailpoint.api.SailPointContext;
import sailpoint.object.Filter;
import sailpoint.object.QueryOptions;
import sailpoint.object.Identity;
import java.util.List;

import sailpoint.tools.GeneralException;
import sailpoint.tools.Util;

public class Rule35_Filter {


	public static void main(String[] args) throws GeneralException{
		
		SailPointContext context=null;
		
		Filter firtName=Filter.like("firstname", "S",Filter.MatchMode.END);
		QueryOptions qo = new QueryOptions();
		qo.addFilter(firtName);
		List<Identity> identities = context.getObjects(Identity.class, qo);

		if (!Util.isEmpty(identities)) {
		  for (Identity identity : identities) {
		    System.out.println("Employee first name: " + identity.getDisplayName());
		  }
		}
	}
}	


