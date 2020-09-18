package oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

class Utility
{
	
	public static Locale getLocalFromWMAccount()
	{
		ThreadSleep(300);// Make a DB call for WM_ACCOUNT for a locale
		return Locale.ENGLISH;
	}
	
	public static List<Long> getAllUserGroups(Long userid)
	{
		ThreadSleep(300);// Make a DB call for WM_USER_GROUPS for a user contact groups
		List<Long> group =  new ArrayList<Long>(Arrays.asList(new Long[] {1l,2l}));
		return group;
	}
	public static List<Long> getContactGroupMapper()
	{
		ThreadSleep(500);// Make a DB call for WM_USER_GROUPS for a user contact groups
		List<Long> group =  new ArrayList<Long>(Arrays.asList(new Long[] {1l,2l,3l,4l, 5l, 6l,7l,8l}));
		return group;
	}
	
	public static String getWMEmailsFromContactId(Long contactIds)
	{
		ThreadSleep(500);// Make a DB call for WM_EMAILS for a user email
		/**
		 * // process WM_EMAILS and get the email 
		 */
		String email = "mohasin@test.com"; 
		
		return email;
	}
	
	public static String getUserTimeZone()
	{
		ThreadSleep(300);// Make a DB call for WM_ACCOUNT for a locale
		return "Asia/Chennai";
	}
	
	public static Long getUserId()
	{
		ThreadSleep(300);// Make a DB call for WM_ACCOUNT for a locale
		return 1l;
	}
	
	public static Row getWMAccount()
	{
		ThreadSleep(300);// Make a DB call for WM_ACCOUNT for a locale
		return new Row(1l);
	}
	
	public static void ThreadSleep(long millis)
	{
		try {
			System.out.println(".");
			Thread.sleep(millis);// Make a DB call for WM_ACCOUNT for a locale
		}catch(Exception e) {}
	}
	
}

class Row
{
        public String data="random data";
        Long userid = null;
        public Row(Long userid) {
			this.userid = userid;
		}
        
        public String getUserTimeZone()
    	{
    		return "Asia/Chennai";
    	}
        
        public  Long getUserId()
    	{
    		return userid;
    	}
        
        public static List<String> getWMEmailsList()
    	{
        	return new ArrayList<String>();
    	}
        
        public static Locale getLocale()
    	{
        	return Locale.ENGLISH;
    	}
}

class Database{
	
	public Database(String connectionObj) {
		// TODO Auto-generated constructor stub
	}
	public List<Object> getResultSet(String query)
	{
		List<Object> resultSet =  new ArrayList<Object>(Arrays.asList(new Long[] {1l,2l,3l,4l, 5l, 6l,7l,8l}));
		return resultSet;
	}
	
}