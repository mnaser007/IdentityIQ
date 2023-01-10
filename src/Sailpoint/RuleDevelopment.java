package Sailpoint;

import sailpoint.object.Application;
import sailpoint.object.Identity;
import sailpoint.tools.GeneralException;
import sailpoint.api.SailPointContext;
import sailpoint.api.certification.ManagerCertificationHelper;

public class RuleDevelopment {

	/*public RuleDevelopment() {

	}*/

	@SuppressWarnings("null")
	public static void main(String[] args) throws GeneralException {
		SailPointContext context = null;
          
		// getting identity by object using getbyname method
		Identity identityName = context.getObjectByName(Identity.class, "Barbara.Wilson");
		Application appName = context.getObjectByName(Application.class, "HR System- Employees");
		if (identityName != null) {

	System.out.println ("Firstname: " + identityName.getFirstname() + "\n" + "Lastname: "
					+ identityName.getLastname() + "\n" + "DisplayName: " + identityName.getDisplayName() + "\n"
					+ "Email: " + identityName.getEmail() + "\n" + "Password: " + identityName.getPassword() + "\n"
					+ "Capabilities: " + identityName.getCapabilities() + "\n" + "Manager: " + identityName.getManager()
					+ "\n" + "ManagerStatus: " + identityName.getManagerStatus() + "\n" + "Jobtitle: "
					+ identityName.getAttribute("jobtitle") + "\n" + "Application type: " + appName.getType() + "\n"
					+ "Location: " + identityName.getAttribute("location") + "\n" + "Region: "
					+ identityName.getAttribute("region") + "\n" + "Department: "
					+ identityName.getAttribute("department") + "\n" + "Costcentre: "
					+ identityName.getAttribute("costcenter") + "\n" + "Inactive: "
					+ identityName.getAttribute("inactiveIdentity") + "\n" + "LastLogin: "
					+ identityName.getLastLogin()+"\n"+"ManagerEmail:"+identityName.getManager().getEmail());
			

		}
	}
}

	

	

