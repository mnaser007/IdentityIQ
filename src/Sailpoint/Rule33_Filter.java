package Sailpoint;

import java.util.List;



import sailpoint.api.SailPointContext;
import sailpoint.object.Filter;
import sailpoint.object.QueryOptions;
import sailpoint.tools.GeneralException;

public class Rule33_Filter {

	public static void main(String[] args) throws GeneralException{
		SailPointContext context=null;
		
//.........Get all identities department is "Finance" and region is "Americas".........
		
		
		Filter dept=Filter.eq("department", "Finance");
		Filter  region=Filter.eq("region", "Americas");
		
	
		QueryOptions qo=new QueryOptions();
		

		
		
		
		
	}

}
