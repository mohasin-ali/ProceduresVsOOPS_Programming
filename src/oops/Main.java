package oops;


public class Main
{
	public static void main(String[] args) {
		System.out.println("Starting Main ");
		useStaticMethodsApproach();
		System.out.println("---------------------------------------------------------------------");
		useObjectOrientedApproach();
	}
	
	public static void useObjectOrientedApproach()
	{
	    
        System.out.println("Object Oriented approach - Monitor is down,  Start Sending alert email");
    	Long startTime = System.currentTimeMillis();
		Row accountRow = new Row(123l);
		long monitorid = 456l ;
		
		Beta betaAlert = new Beta(accountRow, monitorid);
		betaAlert.setEmailListForMonitor();
		System.out.println("Object Oriented approach- Down alert send, End Sending email");
		System.out.println("\n\n Object Oriented approach-  total time taken is  "+ ((System.currentTimeMillis()- startTime)/1000)+" Seconds");
	}
	
	public static void useStaticMethodsApproach()
	{
	    System.out.println("Static approach - Monitor is down,  Start Sending alert email");
		Long startTime = System.currentTimeMillis();
		Alpha.sendEmailAlert(1);
		System.out.println("Static approach - Down alert send, End Sending email");
		System.out.println("\n\nStatic approach -  total time taken is  "+ ((System.currentTimeMillis()- startTime)/1000)+" Seconds");
	}
}