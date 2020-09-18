package oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Beta{
	private final static String connectionObj = "my sql connection conf";
	
	private Long userid = null;
	private Locale locale = null;
	private Row wmAccountRow = null;
	private Long monitorId = null;
	private List<Object>  wmEmailsRows = null;
	private Map<String, Long> downLocationMap = null;
	private List<Long>  groupIds =null;
	private List<String> emailList= null;
	
	
	public Beta(Row row , Long monitorId)
	{
		this.wmAccountRow = row;
		this.monitorId = monitorId;
		this.setDownLocations();
	}
	
	public void setAccountData() 
	{
		 System.out.println(".");
		setUserId(wmAccountRow.getUserId());
		setLocale(wmAccountRow.getLocale());
	}
	
	public void setUserId(Long userid) {
		this.userid = userid;
	}
	
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	
	public void sendMail()
	{
		System.out.println(".");
		System.out.println("\t\t Object Oriented approach -Email sent to the list of contacts");
		Locale locale = this.locale;
		//Instantiate a alert sending email object with locale object
		// send email
	}
	
	public void setDownLocations()
	{
		System.out.println(".");
		String timezone = wmAccountRow.getUserTimeZone();
		
		/**
		 * Process and convert down time here with respect to user `timezone` and get the down locations from Cassandra.
		 */
		
		Map<String, Long>  locationDowntime = new HashMap<String, Long>();
		this.downLocationMap = locationDowntime;
	}
	
	public void setEmailListForMonitor()
	{
		System.out.println(".");
		setContactsGroup();
		
		emailList = new ArrayList<>();
		/**
		 * Set the customized query with respect to alert sending code to make DB call,
		 * leaving the unnecessay resultset to process.
		 */
		/**
		 * Make a DB call for EMAIL list 
		 */
		Database database = new Database(connectionObj);
		String query = " select * from WM_CONTACTS_MAPPER inner join WM_MAIL where wm_group_id IN " + groupIds + " where userid="+userid;
		this.wmEmailsRows = database.getResultSet(query);
		
		for(Object row : this.wmEmailsRows)
		{
			String email = String.valueOf(row);  // no need to make a in for-loop.
			emailList.add(email);
		}
		System.out.println(".");
	}
	
	public void setContactsGroup()
	{
		/**
		 * Make a DB call for WM_USER_GROUPS for a user contact groups
		 */
		Utility.ThreadSleep(1000);
		List<Long> group =  new ArrayList<Long>(Arrays.asList(new Long[] {1l,2l})); //with DB Call
		this.groupIds = group;
		Long contactGroupId = groupIds.get(0);
		System.out.println(".");
	}
}