package AssignmentRules;

import sailpoint.api.SailPointContext;
import sailpoint.object.Application;
import sailpoint.tools.GeneralException;
import java.util.ArrayList;
import java.util.List;

public class ApplicationType {
	
	//Bean shell coding  to fetch the application types and the names of the application?
	public static void main(String[] args) throws GeneralException {
        SailPointContext context=null;
List <Application> Applications=context.getObjects(Application.class);

if(Applications!=null && Applications.size()>0){ 
for(Application apps:Applications){            
	System.out.println("Application:"+apps.getName()+"-------->"+apps.getType());
}

} else {
System.out.println("No applications are to Display");
	}
	}
	}

