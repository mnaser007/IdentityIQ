package Sailpoint;


import sailpoint.object.Identity;
import sailpoint.tools.GeneralException;
import java.util.List;
import com.sun.glass.ui.Application;
import sailpoint.api.SailPointContext;

public class CreateUser_AD {

	public static void main(String[] args) throws GeneralException {			
		SailPointContext context=null;

		
			//Creating a new user in AD and adding this  code below the dstinguishedName
		// CN=Devi,CN=Users,DC=future,DC=com   // creating user in AD
		
		Identity identity=null;
		
		String part1="CN=";
		String part2=",CN=Users,DC=future,DC=com";
		
		String Createname=part1+identity.getName()+part2;  
		System.out.println("distinguishedname:------>"+Createname);	
	
		//return Createname;
	}
	}


