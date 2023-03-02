package AssignmentRules;

import sailpoint.api.SailPointContext;
import sailpoint.object.Filter;
import sailpoint.object.Identity;
import sailpoint.object.QueryOptions;
import sailpoint.tools.GeneralException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentFilter {

	public static void main(String[] args) throws GeneralException {

		// fetch the identities whose department is information technology and region is
		// Americas by using filters?
	

		SailPointContext context = null;

		ArrayList arr = new ArrayList();
		Filter dptFilter = Filter.eq("department", "Information Technology");
		Filter regFilter = Filter.eq("region", "Americas");
		
		Filter FinalFilter=Filter.and(dptFilter, regFilter);
		QueryOptions qo=new QueryOptions();
		qo.addFilter(FinalFilter);
		System.out.println("QueryOptions:-->"+qo);
		
		List<Identity> identities = context.getObjects(Identity.class, qo);
		if (identities != null && identities.size() > 0) {
			for (Identity identity : identities) {

				System.out.println("identity:" + identity.getFirstname());
				arr.add(identity.getFirstname());

			}
		}
	}
}
