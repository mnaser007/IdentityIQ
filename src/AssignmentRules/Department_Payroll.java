package AssignmentRules;

import java.util.List;
import sailpoint.api.SailPointContext;
import sailpoint.object.Filter;
import sailpoint.object.Identity;
import sailpoint.object.QueryOptions;
import sailpoint.tools.GeneralException;

public class Department_Payroll {
	
	public static void main(String[] args) throws GeneralException {

		//the identities whose department is payroll by using like operator?
		
		SailPointContext context=null;
		
		Filter deptFilter=Filter.like("department","Payroll");
        QueryOptions qo=new QueryOptions();
        qo.addFilter(deptFilter);
        
        List<Identity> identities= context.getObjects(Identity.class, qo);
        if(identities!=null && identities.size()>0){
            for(Identity identity:identities){
            System.out.println("Identity department payroll:---->"+identity.getName());
        }
        }
}
}