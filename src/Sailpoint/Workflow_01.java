package Sailpoint;

import sailpoint.api.SailPointContext;
import sailpoint.object.*;
import sailpoint.object.Application;
import sailpoint.object.Identity;
import sailpoint.object.ProvisioningPlan.AccountRequest;
import sailpoint.object.ProvisioningPlan.AttributeRequest;
import sailpoint.tools.GeneralException;
import java.util.ArrayList;
import sailpoint.api.Provisioner;

public class Workflow_01 {

	public static void main(String[] args) throws GeneralException {
		SailPointContext context=null;
		
	

		// Print identity name, application name, and access type
		System.out.println("identityName: " + identityName + ", AppName: " + appName + ", AccessType: " + accessName);

		// Get the identity object based on the identity name
		Identity identityName1 = context.getObject(Identity.class, identityName);

		// Create a ProvisioningPlan object to store the provisioning plan
		ProvisioningPlan plan = new ProvisioningPlan();

		// Create a list of AccountRequest objects
		ArrayList<AccountRequest> accountRequestList = new ArrayList<>();

		// Set the identity in the ProvisioningPlan object
		plan.setIdentity(identityName1);

		// Create an AccountRequest object
		AccountRequest adAccountRequest = new AccountRequest();

		// Get the Application object based on the application name
		Application appName1 = context.getObject(Application.class, appName);

		// Set the application name in the AccountRequest object
		adAccountRequest.setApplication(appName1.getName());

		// Set the operation as "Create" in the AccountRequest object
		adAccountRequest.setOperation(AccountRequest.Operation.Create);

		// Create AttributeRequest objects to set the attributes for the account
		AttributeRequest fnAttRequest = new AttributeRequest("givenName", identityName1.getFirstname());
		AttributeRequest mailAttRequest = new AttributeRequest("mail", identityName1.getEmail());
		AttributeRequest employeeIDAttRequest = new AttributeRequest("employeeID", identityName1.getStringAttribute("employeeId"));
		AttributeRequest memberOfAttRequest = new AttributeRequest("memberOf", accessName);

		// Add the AttributeRequest objects to the AccountRequest object
		adAccountRequest.add(fnAttRequest);
		adAccountRequest.add(mailAttRequest);
		adAccountRequest.add(employeeIDAttRequest);
		adAccountRequest.add(memberOfAttRequest);

		// Set the native identity in the AccountRequest object
		String finalName = "CN=" + identityName1.getName() + ",CN=Users,DC=FUTURE,DC=COM";
		System.out.println("Final name: " + finalName);
		adAccountRequest.setNativeIdentity(finalName);

		// Add the AccountRequest object to the list of AccountRequest objects
		accountRequestList.add(adAccountRequest);

		// Set the list of AccountRequest objects in the ProvisioningPlan object
		plan.setAccountRequests(accountRequestList);

		// Print the ProvisioningPlan in XML format
		System.out.println("Plan: " + plan.toXml());

		// The following lines are commented out and are used to execute the ProvisioningPlan
		
		Provisioner p=new Provisioner(context);
		
		p.compile(plan);
		p.execute(); 
 
	}

}
