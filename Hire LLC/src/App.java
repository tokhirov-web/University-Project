public class App
{
    public static void main(String[] args) throws Exception
    {
        // Company's Information
    String companyName = "Hire LLC";
    final short establishedYear = 2024;
    byte partnersNum = 4; // Number of Partnering Companies
    byte numOfBranches = 3; // Number of offices
    String branchOneName = "Nuke";
    String branchTwoName = "Inferno";
    String branchThreeName = "Mirage";
    boolean avanguardIsActive = true; // Active - means currently working
    boolean siriusIsActive = false; // Is being constructed
    boolean mirageIsActive = false; // Under development
    byte numOfWorkers = 67;
    float revenue = 30400785.56f;
    float companyExpenses = 3462.78f;
    boolean salaryIsGiven;
    float expenses = 44552.3f;




    float givenSalary = 0f;
    
    
    // The number of available jobs and potential employees
    byte jobsNum = 5;
    byte jobSeekersNum = 10;
    
    // Employees' data
    
    // Employee one
    String empOneName = "Michael Jefferson";
    String empOneProfession = "Chemical Engineer";
    byte employeeOneId = 9;
    byte employeeOneAge = 28;
    final boolean hasDegree1 = true;
    byte experienceYears1 = 3;
    final float employeeOneGpa = 3.4f;
    
    // Employer's data
    
    // Employer one
    String companyOneName = "Saneg LLC";
    final short comanyOneEstYear = 2004; // Company's established year
    float companyOneRevenue = 3440001.45f;
    short avgSalary1 = 3000;
    final boolean licenesed1 = true;

    // Employer two
    String companyTwoName = "Apple Inc.";
    final short comanyTwoEstYear = 1978; // Company's established year
    float companyTwoRevenue = 34400045561.45f;
    short avgSalary2 = 5000;
    final boolean licenesed2 = true;
    

    System.out.print("Company's information: ");
    System.out.print("Name: " + companyName);
    System.out.print("Company's established year: " + establishedYear);

    System.out.println();

    System.out.println("\nDatabase information:");
    System.out.print("The number of available jobs:\t" + jobsNum + "\t");
    System.out.println("\nThe number of potential candidates that are looking for a job:\t" + jobSeekersNum + "\t");

    System.out.println();


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
    
    System.out.println();


    if (revenue > expenses) {
        System.out.println("The company is profitable");
    } else if (revenue == expenses) {
        System.out.println("The company is stable");
    } else if (revenue < expenses) {
        System.out.println("The company is losing it's money");
    }

    System.out.println();

    if (hasDegree1) {
        System.out.println("The employee has got a degree");
        System.out.println();
    }

    if (jobSeekersNum < jobsNum) {
        System.out.println("No enough employees in the database");
    } else {
        System.out.println("The databsase has enough employees");
    }

    if (employeeOneAge >= 25) {
        if (employeeOneGpa >= 3f) {
            System.out.println("The employee one is eligible for consideration");
        } else {
            System.out.println("The employee is not eligible for consideration. The reason is low gpa");
        }
    } else {
        System.out.println("The employee is too young to be considered");
    }

    System.out.println();

    switch (empOneProfession) {
        case "Chemical Engineer":
            System.out.println("The employee can work in " + companyOneName);

            break;
        
        case "Software Engineer":
            System.out.println("The employee can work in " + companyTwoName);

            break;
        default:
            System.out.println("No available jobs for the employee");
            
            break;
    }

    System.out.println();

    };
}