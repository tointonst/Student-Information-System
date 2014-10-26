import java.util.Scanner;
public class UserMenu 
{
	public static void mainMenu() 
	{
		System.out.println("Main Menu");
		System.out.println("\n" + "What would like to do?");
		System.out.println("\t 1) Add or delete a student.");
		System.out.println("\t 2) Change student grades/schedule.");
		System.out.println("\t 3) Sort students.");
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
		
	}
}
