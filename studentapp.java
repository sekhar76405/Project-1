
import java.util.Scanner;




public class studentapp {


	public static void main(String[] args) 
	{
	    int i=0;
		Scanner scan = new Scanner(System.in);
		
		        // Ask how many users do you want to add
		        System.out.println("Enter the number of students you want to add: ");
                int n = scan.nextInt();
                
                //creating array of objects of class students(ideally creating students)
                student obj[] = new student[n];
                
                for(int x=0;x<n;x++)
                {
                    obj[x] = new student();
                }
                // a simple loop to flow through the array of objects
                for(int a=0;a<n;a++)
                {
                    System.out.println("Enter details for student \n ");
                    obj[a].details();
                    obj[a].Course();
                    // as the methods increase they can be added here like ID,balance etc.
                }
                
		    
		    while(true)
		    {
		        System.out.println("Enter 1 to add a new student's details \n 2 to view a student's details");
		        int s = scan.nextInt();
		        
		        //using switch cases for user convinience.
		        switch(s)
		        {
		            case 1:
		                {
		                    System.out.println("Enter the number of students you want to add: ");
                            int num_std = scan.nextInt();
                            
                            int tot = num_std + n;//total students are now num_std + n(initial)
                            
                            // student obj[] = new student[tot];//added new students to the array 
                            
                            
                            for(int x=n;x<tot;x++)
                            {
                                obj[x] = new student();
                            }
                            
                            for(int j=n;j<tot;j++)
                            {
                                System.out.println("Enter details for student \n ");
                                obj[j].details();
                                obj[j].Course();
                                // as the methods increase they can be added here like ID,balance etc.
                            }
                            
		                }break;
		                
		            case 2:
		                {
		                    //to view all details but can only be executed once Id are generated.
		                }break;
		                
		            default: System.out.println("Invalid input");
		        }
		       
		    }
            
    		// create n number of new students
    		
	  
	}
}
class student {
		private String firstname;
		private String lastname;
		private String year;
		private int StudentID;
		private String courses;
		private String tutionbalance;
		private int costofcourse = 10000;
        Scanner scan = new Scanner(System.in);
		// DCN , OOPS, SEPM, Advance Linux and BRM are the subjects. Each costs 10,000
		// Rs
        
		// Constructor: prompts user to enter student name and year
        void details()
        {
            System.out.println("Enter the student's firstname: ");
            firstname = scan.nextLine();
            System.out.println("Enter the student's lastname: ");
            lastname = scan.nextLine();
            System.out.println("Enter the Year of study: ");
            year = scan.nextLine();
        }
		// Generate an ID

		// enroll into courses
        void Course()
        {
             System.out.println("Enter the course enrolled: ");
             courses = scan.nextLine();
        }
		// view balance

		// Pay tuition fees

		// show status
	}

