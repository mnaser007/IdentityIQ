package AssignmentRules;

import sailpoint.object.Identity;
import sailpoint.api.ObjectUtil;
import sailpoint.api.SailPointContext;
import sailpoint.object.Filter;
import sailpoint.object.QueryOptions;
import sailpoint.tools.GeneralException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WorkgrpAdmin {
	public static void main(String[] args) throws GeneralException {
	
	//identities whose workgroup is “Admingroup” by using queryoptions?
	
	SailPointContext context = null;
    ArrayList arr = new ArrayList();
    
    QueryOptions qo = new QueryOptions();
    qo.addFilter(Filter.eq("workgroup", true));

    List<Identity> workgrp = context.getObjects(Identity.class,qo);
    
    System.out.println("Workgroup name----> "+ workgrp);
    
    Identity workgroup=	context.getObjectByName(Identity.class, "Admin Group");   
    if(workgroup.isWorkgroup()) {
    	Iterator wrkGrpmembers = ObjectUtil.getWorkgroupMembers(context, workgroup, null);
    	while(wrkGrpmembers.hasNext())
    	{
    	Object[] object = (Object[]) wrkGrpmembers.next();
    	Identity ids = (Identity) object[0];
    	arr.add(ids.getName());
    	System.out.println(ids.getName());
    	}
    	}

	}
}
    


