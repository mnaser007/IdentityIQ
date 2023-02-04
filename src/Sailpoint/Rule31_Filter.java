package Sailpoint;

import java.util.ArrayList;
import java.util.List;
import sailpoint.api.SailPointContext;
import sailpoint.object.Application;
import sailpoint.object.Filter;
import sailpoint.object.QueryOptions;
import sailpoint.tools.GeneralException;
import sailpoint.object.Identity;

public class Rule31_Filter {

	public static void main(String[] args) throws GeneralException{
		SailPointContext context = null;
		// ...........Getting all application and there names..............
			
		ArrayList list =new ArrayList();
		List<Application> appName = context.getObjects(Application.class);
		if (appName != null && appName.size() > 0) {

			for (Application Apps : appName) {
				list.add(Apps.getName()+appName.size());
	System.out.println("Application name----->" + Apps.getName());
	System.out.println("Total Applications are:------>" + appName.size());
      return list;
			}
		}
	}
}
	


