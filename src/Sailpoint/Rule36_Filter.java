package Sailpoint;

import sailpoint.api.SailPointContext;
import sailpoint.object.Filter;
import sailpoint.object.QueryOptions;
import sailpoint.object.Identity;
import java.util.List;

import sailpoint.tools.GeneralException;
import sailpoint.tools.Util;

public class Rule36_Filter {

	public static void main(String[] args) throws GeneralException {

		SailPointContext context = null;

		
		Filter first = Filter.like("firstname", "Ann", Filter.MatchMode.START).and(Filter.like("lastname", "Pa", Filter.MatchMode.START));
		Filter active=Filter.eq("active", true);
		//Filter second = Filter.like("lastname", "Pa", Filter.MatchMode.START);
		

		Filter finalFilter = Filter.and(first, active);
		QueryOptions qo = new QueryOptions();
		qo.addFilter(finalFilter);
		List<Identity> identities = context.getObjects(Identity.class, qo);

		if (!Util.isEmpty(identities)) {
			for (Identity identity : identities) {
				System.out.println("Employee first name end with 'Ann' or 'Pa:----> " + identity.getFirstname());
			}
		}
	}
}
