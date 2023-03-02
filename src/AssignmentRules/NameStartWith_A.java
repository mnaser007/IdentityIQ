package AssignmentRules;

import sailpoint.api.SailPointContext;
import sailpoint.object.Filter;
import sailpoint.object.Identity;
import sailpoint.object.QueryOptions;
import sailpoint.tools.GeneralException;
import java.util.ArrayList;
import java.util.List;

public class NameStartWith_A {
	public static void main(String[] args) throws GeneralException {

	//fetch the identities of region whose name starts with "A"?	
		SailPointContext context = null;
		
		Filter identFilter = Filter.like("region", "A", Filter.MatchMode.START);
		QueryOptions qo=new QueryOptions();
        qo.addFilter(identFilter);

		List<Identity> identities=context.getObjects(Identity.class, qo);
		if(identities!=null && identities.size()>0) {
			for (Identity identity:identities) {
				System.out.println("Names start with A are----->"+identity.getName());
			}
		}	
		
}
}
