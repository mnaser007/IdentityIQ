package Sailpoint;

import java.util.List;

import sailpoint.api.SailPointContext;
import sailpoint.object.Application;
import sailpoint.tools.GeneralException;

public class Rule04 {
      
	@SuppressWarnings("null")
	public static void main(String[] args) throws GeneralException{
		SailPointContext context=null;
		
		//Getting an application which is only DelimitedFile
		
           List<Application> application=context.getObjects(Application.class);
           if(application!=null && application.size()>0) {
        	   for (Application apps:application) {
        		   System.out.println("Total applications:  "+apps.getName()+"\n"+application.size());
        	   }
           }
	}
}
	



