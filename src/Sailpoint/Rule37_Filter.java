package Sailpoint;

import java.util.List;

import sailpoint.api.SailPointContext;
import sailpoint.object.Filter;
import sailpoint.object.Identity;
import sailpoint.object.QueryOptions;
import sailpoint.tools.GeneralException;
import sailpoint.tools.Util;

public class Rule37_Filter {

	@SuppressWarnings("null")
	public static void main(String[] args) throws GeneralException {
		SailPointContext context = null;

		
		
Filter first = Filter.like("lastname", "I", Filter.MatchMode.END);
Filter second=Filter.like("lastname", "II", Filter.MatchMode.END);
Filter jobFilter=Filter.eq("inactiveIdentity", "FALSE");	
	QueryOptions qo=new QueryOptions();
	qo.add(jobFilter);
	System.out.println("Qo--------->"+qo);
	List<Identity> identities = context.getObjects(Identity.class, qo);
	
	if(!Util.isEmpty(identities)) {
	for (Identity identity : identities) {
		System.out.println(identity.getName());
			
		}
	}
	}
	}

