package AssignmentRules;

import sailpoint.api.SailPointContext;
import sailpoint.object.Application;
import sailpoint.tools.GeneralException;
import sailpoint.tools.Util;
import java.util.ArrayList;
import java.util.List;

public class ApplicationPath {

	//Beanshell coding to fetch the path of the Application?
	
		public static void main(String[] args) throws GeneralException {
	        SailPointContext context=null;
	        Application application=null;
	        
	        String appName="HR System- Employees";	 
	       if(Util.isNotNullOrEmpty(appName));
	       
	        application=context.getObjectByName(Application.class, appName);
	       String filePath=(String) application.getAttributeValue("file");
	      System.out.println("FilePath="+filePath);
	}
	}

