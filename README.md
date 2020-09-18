# ProceduresVsOOPS_Programming
We have created an example to illustrate the significance of the Object oriented programming (OOPS) and benefit of OOPS over simple procedural programming.  The example is mocking the alert sending email when a monitor goes down. In this mock alert email we have fetched the User groups to be alerted and queried the MySQL table to fetch the list of emails to be alerted. The classes which are used in this example as follow :  

Main.java  -  Driver program to initialize the flow of sending email  

Alpha.java -  A static approach for sending the email to list of sub-users associated to the monitor 

Beta.java - An Object Oriented approach which sends the email with OOP's flow. 

Utility.java- There are set of classes which serves as helper class to the above Alpha and Beta classes.
