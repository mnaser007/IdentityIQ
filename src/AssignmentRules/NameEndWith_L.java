package AssignmentRules;

import java.util.List;
import sailpoint.api.SailPointContext;
import sailpoint.object.Filter;
import sailpoint.object.Identity;
import sailpoint.object.QueryOptions;
import sailpoint.tools.GeneralException;

public class NameEndWith_L {
	
	public static void main(String[] args) throws GeneralException {
		

		//the identities whose department is payroll by using like operator?
			SailPointContext context = null;
			
			Filter identFilter = Filter.like("region", "L", Filter.MatchMode.END);
			QueryOptions qo=new QueryOptions();
	        qo.addFilter(identFilter);

			List<Identity> identities=context.getObjects(Identity.class, qo);
			if(identities!=null && identities.size()>0) {
				for (Identity identity:identities) {
					System.out.println("Names end with L are----->"+identity.getName());
				}
			}
}
}
