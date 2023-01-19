package Sailpoint;

import java.util.ArrayList;
import java.util.List;

import sailpoint.api.SailPointContext;
import sailpoint.object.Filter;
import sailpoint.object.QueryOptions;
import sailpoint.tools.GeneralException;
import sailpoint.object.Identity;


public class Rule08_Filter {
	

	public static void main(String[] args) throws GeneralException{
		
		SailPointContext context=null;
		
		Filter nameFilter = Filter.ne("name", "Aaron.Nichols");
		QueryOptions qo=new QueryOptions();
		qo.add(nameFilter);
		ArrayList names=new ArrayList();
		
		List<Identity> identities =context.getObjects(Identity.class, qo);
		if (identities!=null && identities.size()>0)
		{
			for (Identity identity:identities)
		{
				System.out.println("Identity" +identity.getName());
				
				names.add(identity.getName());				
		}
		}
		if (names.contains("Aaron.Nichols"))
			System.out.println("ArrayList contains Aaron.Nichols names: ");
		
		else
			System.out.println("ArrayList does not contains: ");	
		
	}

}
