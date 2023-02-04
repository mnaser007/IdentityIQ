package Sailpoint;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import sailpoint.api.SailPointContext;
import sailpoint.object.Attributes;
import sailpoint.object.Identity;
import sailpoint.tools.GeneralException;
public class Rule_HashMap {

	
	public static void main(String[] args) throws GeneralException {
		// TODO Auto-generated method stub
		       SailPointContext context=null;

		       ArrayList list=new ArrayList();
		  Identity  identity = context.getObject(Identity.class, "Aaron.Nichols");


		       Attributes attributes = identity.getAttributes();

		       for (Map.Entry set : attributes.entrySet()) {
		           System.out.println(set.getKey() + " = "+set.getValue());


		        System.out.println(identity.getAttributes());
		    
	}
	}
}


