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
import sailpoint.object.Application;

public class Rule09_Filter {


			@SuppressWarnings("null")
			public static void main(String[] args) throws GeneralException {
				
				SailPointContext context=null;
				
	//..............Getting an application which is only DelimitedFile..........................	
			

				List<Application> appName = context.getObjects(Application.class);
				
				if(appName!=null && appName.size()>0);
				{
				for (Application application:appName)
				{
					System.out.println("Total application names are:----->"+application.getName());
				}
					    
			










