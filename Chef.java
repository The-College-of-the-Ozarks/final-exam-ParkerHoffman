/*
Chef Class:
In order to better serve our customers, we are now offering
the availability of a private chef at each of our parties. 

This class has not yet been implemented, but is similar to our waitstaff and coordinator classes. 
The chef should be paid a minimum of $14.00 /hr and the job title will be chef. 

Documentation:

setPayRate
User will enter the rate they wish to pay a new chef. If this is less than the set minimum rate($14) it will set the pay rate to 14.
@param double

User will set the job title of the employee to chef.
no @param or @return

*/

//Do this after the waitstaff or coordinator (is good)

public class Chef extends Employee
{
   public final static double PAY_RATE = 14.00;
   public void setPayRate(double rate)
   {
     if(rate>PAY_RATE){
       rate=PAY_RATE;
     }
     super.payRate=rate;
   }
   public void setJobTitle()
   {
      jobTitle = "chef";
   }
}
