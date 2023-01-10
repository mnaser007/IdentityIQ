package Sailpoint;

import java.util.List;
import sailpoint.object.Identity;

import sailpoint.api.SailPointContext;
import sailpoint.tools.GeneralException;

public class Rule02 {

	@SuppressWarnings("null")
	public static void main(String[] args) throws GeneralException {

		SailPointContext context = null;

		/*// to list the all identities for a particular application
		 * 
		 * List<Identity> identities = context.getObjects(Identity.class);
		 * 
		 * System.out.println(identities);
		 */

		/*---------------------------------------------------------------------------------------*/

		// Using idetntity.size will show how many idetntities are there for particular
		// application

		List<Identity> identities = context.getObjects(Identity.class);
		if (identities != null && identities.size() > 0) {
			for (Identity identity : identities) {
				System.out.println("Identity Fullname: " + identity.getName());
				System.out.println("Identity Firstname: " + identity.getFirstname());
				System.out.println("Capabilities: " + identity.getCapabilities());
			}
			System.out.println("Total Identities: " + identities.size());
		} else {
			System.out.println("No identities found.");
		}
	}
}
