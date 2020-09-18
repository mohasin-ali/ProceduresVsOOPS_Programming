package oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;


public class Alpha
{
	public static void main(String[] args) {
		System.out.println("Static approach - Monitor is down,  Start Sending alert email");
		Long startTime = System.currentTimeMillis();
		sendEmailAlert(1);
		System.out.println("Static approach - Down alert send, End Sending email");
		System.out.println("\n\nStatic approach -  total time taken is  "+ ((System.currentTimeMillis()- startTime)/1000)+" Seconds");
	}
	
	public static void sendEmailAlert(long monitorid)
	{
		System.out.println(".");
		Long userid= Utility.getUserId();
		Locale locale = Utility.getLocalFromWMAccount();
		
		/**
		 * Fetches the usergroup associated to Monitor id for send emails to the specific user group
		 */
		Map<String, Long> downLocationMap = getDownLocations(userid,monitorid);
		List<String>  emailListTobeAlerted = getEmailListForMonitor(monitorid);
		/**
		 * Sending email to the fetched email contact list
		 */
		System.out.println("\t\tStatic approach -Email sent to the list of contacts");
		//email sent
		return;
	}
	
	/**
	 * returns the email id list for the selected monitorid 
	 *
	 */
	public static Map<String, Long> getDownLocations(long userid, long monitorid)
	{
		String timezone = Utility.getUserTimeZone();
		
		/**
		 * Process and convert down time here with respect to user `timezone` and get the down locations from Cassandra.
		 */
		
		Map<String, Long>  locationDowntime = new HashMap<String, Long>();
		return locationDowntime;
	}

	/**
	 * returns the email id list for the selected monitorid 
	 *
	 */
	//getEmailListForMonitor 
	public static List<String> getEmailListForMonitor(Long monitorid)
	{
		Long userid= Utility.getUserId(); // get the user id in this method for internal processing 
		List<Long>  groupIds = Utility.getAllUserGroups(userid);
		
		//after iterating the groupids we will get the group id associated to the monitor
		
		Long contactGroupId = groupIds.get(0);
		List<String> emailList = getListOfContactsInGroup(contactGroupId);
		return emailList;
	}
	
	/**
	 * emailid list is extracted from the Contact  group mapper table and from WM_EMAILS table
	 *
	 */
	public static List<String> getListOfContactsInGroup(Long contactGroupId)
	{
		List<Long> contactIds = Utility.getContactGroupMapper();// extract the contacts ids from contactGroupId
		
		List<String>  emailList = new ArrayList<>();
		
		for(Long conId : contactIds) 
		{
			String email = Utility.getWMEmailsFromContactId(conId);
			emailList.add(email);
		}
		
		return emailList;
	}
		
}


