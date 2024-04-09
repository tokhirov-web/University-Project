public class App
{
    
    // Static block
    static {
        short currentYear = 2024;
        boolean companyIsAlive = true;
    }

    // Static variables' declaration
    static final String companyName = "Hire LLC";
    static final short establishedYear = 2024;
    static float revenue = 30400785.56f;


    // static functions 

    // Function 1
    static void hasDegree(String employee, boolean degree) {
        if (degree == true) {
            System.out.println(employee + " has got a degree");
        } else {
            System.out.println(employee + " does not have a degree");
        }
    }

    // Function 2
    static void licenseCheck(String company, boolean license) {
        if (license == true) {
            System.out.println(company + " has got a license");
        } else {
            System.out.println(company + " does not have a license");
        }
    }



    // Instant function
    void profitability(String company, float revenue, float expenses) {
        if (revenue > expenses) {
            System.out.println(company + " is profitable");
        } else if (revenue == expenses) {
            System.out.println(company + " is stable");
        } else if (revenue < expenses) {
            System.out.println(company + " is losing it's money");
        }
    }



    // Recursive Function
    public static int power(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return x * power(x, y - 1);
    }



    public static void main(String[] args) throws Exception
    {

        App ap = new App();
    
    // STEP 2

    // Varibles' declaration

    // Company's Information
    byte partnersNum = 4; // Number of Partnering Companies
    byte numOfBranches = 3; // Number of offices
    String branchOneName = "Nuke";
    String branchTwoName = "Inferno";
    String branchThreeName = "Mirage";
    boolean avanguardIsActive = true; // Active - means currently working
    boolean siriusIsActive = false; // Is being constructed
    boolean mirageIsActive = false; // Under development
    byte numOfWorkers = 67;

    float companyExpenses = 3462.78f;
    boolean salaryIsGiven;




    float givenSalary = 0f;
    
    
    // The number of available jobs and potential employees
    byte jobsNum = 5;
    byte jobSeekersNum = 10;
    
    // Employees' data
    
    // Employee one
    String empOneName = "Michael Jefferson";
    String empOneProfession = "Electrical Engineer";
    byte employeeOneId = 9;
    byte employeeOneAge = 28;
    final boolean hasDegree1 = true;
    byte experienceYears1 = 3;
    final float employeeOneGpa = 3.4f;
    byte contractDaysLeft1 = 31; // The number of the days in which the employee's contract is valid in our company


    
    // Employers' data
    
    // Employer one
    String companyOneName = "Saneg LLC";
    final short comanyOneEstYear = 2004; // Company's established year
    float companyOneRevenue = 3440001.45f;
    short avgSalary1 = 3000;
    final boolean licenesed1 = true;
    String industry1 = "Engineering";


    // Employer two
    String companyTwoName = "Apple Inc.";
    final short comanyTwoEstYear = 1978; // Company's established year
    float companyTwoRevenue = 34400045561.45f;
    short avgSalary2 = 5000;
    final boolean licenesed2 = true;
    String industry2 = "IT";

    // Employer three
    String companyThreeName = "Google Inc.";
    final short comanyThreeEstYear = 1998; // Company's established year
    float companyThreeRevenue = 3440456561.45f;
    short avgSalary3 = 4000;
    final boolean licenesed3 = true;
    String industry3 = "IT";

    // Employer four
    String companyFourName = "FaceBook Inc.";
    final short comanyFourEstYear = 2005; // Company's established year
    float companyFourRevenue = 343234561.45f;
    short avgSalary4 = 3000;
    final boolean licenesed4 = true;
    String industry4 = "IT";


    // Potential employeers
    String[] potentialComps = {"Google", "FaceBook", "Eriell","Wallmart", "Pearson"}; // Companies that want to sign a contract with Hire LLC company
    
    // Potential jobseekers
    String[] potentialJobSeekers = {"Andrew Tate", "Joana Richardson", "Mandy Alerton"};


    // Print statements
    System.out.println();
    System.out.println("Company's information: ");
    System.out.println("Name: " + companyName);
    System.out.println("Company's established year: " + establishedYear);

    System.out.println();

    System.out.println("\nDatabase information:");
    System.out.print("The number of available jobs:\t" + jobsNum + "\t");
    System.out.println("\nThe number of potential candidates that are looking for a job:\t" + jobSeekersNum + "\t");

    System.out.println();


    byte monthDay; // Current day of the month

    
    System.out.println();
    
    // STEP 3

    // Single if block

    if (hasDegree1) {
        System.out.println("The employee has got a degree");
        System.out.println();
    }

    // if-else block
    if (jobSeekersNum < jobsNum) {
        System.out.println("No enough employees in the database");
    } else {
        System.out.println("The databsase has enough employees");
    }
    
    
    System.out.println();
    
    
    // if-else if-else blocks
    if (revenue > companyExpenses) {
        System.out.println("The company is profitable");
    } else if (revenue == companyExpenses) {
        System.out.println("The company is stable");
    } else if (revenue < companyExpenses) {
        System.out.println("The company is losing it's money");
    }
    
    
    // Nested if-else block
    
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
    
    // Switch block

    switch (empOneProfession) {
        case "Electrical Engineer":
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

    // STEP 4

    // for loop
    
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


    // while loop

    while (contractDaysLeft1 > 0) {
        System.out.println(empOneName + " has " + contractDaysLeft1 + " days of the contract left");
        System.out.println();
        contractDaysLeft1--;
    }


    // do-while loop

    byte counterForPotentialComps = 0;

    System.out.println("Pontential employers:");

    do {
        System.out.print(potentialComps[counterForPotentialComps] + " ");
        counterForPotentialComps++;
    } while (counterForPotentialComps < potentialComps.length);
    
    System.out.println();
    System.out.println();

    // break and continue

    /*
     * the loop that is searching for eriell company
     */
    for(int i = 0; i <= potentialComps.length; i++) {
        if (potentialComps[i] != "Eriell") {
                System.out.println("No match");
                continue;
            }
        else {
                System.out.println(potentialComps[i] + ". Match");
                break;
            }
        }
    };
}