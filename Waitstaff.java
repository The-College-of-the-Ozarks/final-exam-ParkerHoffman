/*
Waitstaff Class:
An intern developer accidentaly deleted the implementation of the 
setPayRate method of this class. This class will also need to be debugged. 

Documentation:

setPayRate
User will enter the rate they wish to pay a new waitstaf. If this is less than the set minimum rate($10) it will set the pay rate to 14.
@param double

User will set the job title of the employee to waitstaff.
no @param or @return

*/
public class Waitstaff extends Employee
{
   public final static double PAY_RATE = 10.00;
   public void setPayRate(double rate)
   {
     if(rate>PAY_RATE){
       rate=PAY_RATE;
     }
     super.payRate=rate;
   }
   public void setJobTitle()
   {
      jobTitle = "waitstaff";
   }
}
