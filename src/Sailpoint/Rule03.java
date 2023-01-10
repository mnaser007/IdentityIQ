package Sailpoint;

import java.util.List;

import sailpoint.api.SailPointContext;
import sailpoint.object.Application;
import sailpoint.tools.GeneralException;

public class Rule03 {
	
		
		@SuppressWarnings("null")
		public static void main (String[] args) throws GeneralException{
		
		 SailPointContext context=null;
		 
// ...........Getting an list of applcations and it's connector type.................	
		 
		 List<Application> appName=context.getObjects(Application.class);
			if(appName!=null  && appName.size()>0)	{		
			 for (Application Apps:appName) {
	          			
			   System.out.println("Application name----->"+Apps.getName()+"\n"+"Connector"+Apps.getConnector());			   
				} 				
		        }	
		}
		}
           
		
		
		
		 



