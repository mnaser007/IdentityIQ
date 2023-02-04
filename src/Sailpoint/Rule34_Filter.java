package Sailpoint;

import java.util.List;
import sailpoint.api.SailPointContext;
import sailpoint.object.Filter;
import sailpoint.object.Identity;
import sailpoint.object.QueryOptions;
import sailpoint.tools.GeneralException;
import sailpoint.tools.Util;

public class Rule34_Filter {
	@SuppressWarnings("null")
 public static void main(String[] args) throws GeneralException{

		
		SailPointContext context=null;
		QueryOptions qo = new QueryOptions();
		qo.addFilter(Filter.eq("costcenter", "L07e"));

		List<Identity> identities = context.getObjects(Identity.class, qo);

		if (!Util.isEmpty(identities)) {
		  for (Identity identity : identities) {
		    System.out.println("The cost center of identity is:--->" + identity.getName());
		  }
		}
	}
}


