public class App
{
    public static void main(String[] args) throws Exception
    {
        // Company's Information
    String companyName = "Hire LLC";
    final short establishedYear = 2024;
    byte partnersNum = 4; // Number of Partnering Companies
    byte numOfBranches = 3; // Number of offices
    String branchOneName = "Sirius";
    String branchTwoName = "Avanguard";
    String branchThreeName = "Mirage";
    boolean avanguardIsActive = true; // Active - means currently working
    boolean siriusIsActive = false; // Is being constructed
    boolean mirageIsActive = false; // Under development
    byte numOfWorkers = 67;
    float revenue = 30400785.56f;
    float companyExpenses = 3462.78f;
    boolean salaryIsGiven;

    // Departments' employees
    String[] design = {}



    float givenSalary = 0f;
    
    
    // The number of available jobs and potential employees
    byte jobsNum = 5;
    byte jobSeekersNum = 10;
    
    // Employees' data
    
    // Employee one
    String empOneName = "Michael Jefferson";
    String empOneProfession = "Chemical Engineer";
    byte employeeOneId = 9;
    byte employeeAge = 28;
    final boolean hasDegree = true;
    byte experienceYears = 3;
    final float employeeGpa = 3.4f;
    
    // Employer's data
    
    // Employer one
    String companyOneName = "Saneg LLC";
    final short comanyOneEstYear = 2004; // Company's established year
    float companyOneRevenue = 3440001.45f;
    short avgSalary1 = 3000;
    final boolean licenesed1 = true;
    

    System.out.print("Company's information: ");
    System.out.print("Name: " + companyName);
    System.out.print("Company's established year: " + establishedYear);

    System.out.println();

    System.out.println("\nDatabase information:");
    System.out.print("The number of available jobs:\t" + jobsNum + "\t");
    System.out.println("\nThe number of potential candidates that are looking for a job:\t" + jobSeekersNum + "\t");

    byte monthDay;

    for (monthDay = 0; monthDay <= 30; monthDay++)
        {
            if (monthDay == 30 || monthDay == 31)
            {   
                givenSalary = (revenue - companyExpenses) / numOfWorkers;
                System.out.println("\nAll workers have recieved their salary\n");
                System.out.println("The average salary according to the company's revenue is : " + givenSalary + "\n");
                salaryIsGiven = true;
            }
            else
            {
                System.out.println("\nDay " + monthDay);
            }
        }
    };
}