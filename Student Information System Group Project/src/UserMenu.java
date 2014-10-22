import java.util.Scanner;
public class UserMenu 
{
	public static void mainMenu() 
	{
		System.out.println("Main Menu");
		System.out.println("\t What would like to do");
		System.out.println("\t\t 1) add or delete a student.");
		System.out.println("\t\t 2) change student grades.");
		System.out.println("\t\t 3) sort students.");
		Scanner userInput1 = new Scanner(System.in);
		int choseNumber = userInput1.nextInt();
		
		if(choseNumber == 1) 
		{
			SetStudent.setStudentMenu(); 
		}
		if(choseNumber == 2)
		{
			ChangeGradesAndClasses.changeGrade(); 
		}
		if(choseNumber == 3) 
		{
		  	SortStudents.sortStudentsMenu();
		}
		else 
		{
		  System.out.println("Please input a corect character ex 1, 2, or 3");	
		}
	}
}
