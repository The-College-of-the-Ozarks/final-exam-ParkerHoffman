/*
Coordinator Class:
There are no issues with this class. 

Documentation:

setPayRate
User will enter the rate they wish to pay a new coordinator. If this is more than the set maximum rate($20) it will set the pay rate to 20.
@param double

User will set the job title of the employee to coordinator.
no @param or @return

*/
public class Coordinator extends Employee
{
   public final static double PAY_RATE = 20.00;
   public void setPayRate(double rate)
   {
      if(rate > PAY_RATE)
        payRate = PAY_RATE;
      else
        payRate = rate;
   }
   public void setJobTitle()
   {
      jobTitle = "coordinator";
   }
}
