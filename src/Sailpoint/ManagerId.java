package Sailpoint;

import sailpoint.tools.GeneralException;
import sailpoint.api.SailPointContext;
import sailpoint.object.Identity;

public class ManagerId {

	public static void main(String[] args) throws GeneralException{
		
		SailPointContext context=null;
		
		Identity identity=new Identity();
		
		identity.setName("aabb");
		identity.setFirstname("aa");
		identity.setLastname("bb");
		identity.setDisplayName("aa.bb");
		
		identity.setManager(context.getObjectById(Identity.class, "Adam.Kennedy"));
		
		context.saveObject(identity);
		context.commitTransaction();
		
	}
}
