package Sailpoint;

import java.util.ArrayList;
import java.util.List;

import sailpoint.api.SailPointContext;
import sailpoint.integration.Util;
import sailpoint.object.Filter;
import sailpoint.object.QueryOptions;
import sailpoint.tools.GeneralException;
import sailpoint.object.Identity;
import sailpoint.tools.*;
public class Rule_DoubleFilter {


		@SuppressWarnings("null")
		public static void main(String[] args) throws GeneralException{
			
			SailPointContext context=null;
			
			
			Filter deptFilter=Filter.eq("department" , "Finance");
			Filter managerFilter=Filter.eq("manager.name" , "Henry.Butler");
			
			Filter FinalFilter=Filter.and(deptFilter, managerFilter);
			QueryOptions qo=new QueryOptions();
			qo.add(FinalFilter);
			System.out.println("QueryOptions:-->"+qo);
			ArrayList names=new ArrayList();
			
			List<Identity> identities = context.getObjects(Identity.class, qo);
			
			if (Util.isEmpty(identities))
			{
			for (Identity identity:identities)
			{
				System.out.println("Identity:-->"+identity.getName());
				
				names.add(identity.getName());
			}
				
			}
			
			
			}
	}
