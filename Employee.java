/*
Employee Class:
This class contains multiple typos and needs debugged. There are no logical issues with this class 
besides the aforementioned typos.

Documentation:


This is the class that holds all of the important information about an employee. Various 
methods will get and set the various fields.

setLastName/setFirstName
@param string
this will then set the corresponding lastName or firstname vaiable

getName
This will @return both the first and last name fof the employee with a space in between the varibles

setEmployeNumber
This will take @param int as the employee number and set it

getEmployee number
This will @return the employee number



getPayRate/getJobTitle
These take no arguments but will return the respective payRate or jobTitle which this class does not assign. It's chldren assign those


*/
public abstract class Employee
{
   private String employeeNumber;
   private String lastName;
   private String firstName;
   protected double payRate;
   protected String jobTitle;
   public void setEmployeeNumber(String num)
   {
     employeeNumber = num;
   }
   public void setLastName(String name)
   {
      lastName = name;
   }
   public void setFirstName(String name)
   {
      firstName = name;
   }
   public String getEmployeeNumber()
   {
      return employeeNumber;
   }
   public String getName()
   {
      return firstName + " " + lastName;
   }
   public double getPayRate()
   {
      return payRate;
   }
   public String getJobTitle()
   {
      return jobTitle;
   }
   public abstract void setPayRate(double rate);
   public abstract void setJobTitle();
}
