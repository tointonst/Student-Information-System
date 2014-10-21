import java.util.Collections;
import java.util.Scanner;
public class SortStudents 
{
	public static void sortStudentsMenu() 
	{
		System.out.println("Sort Students");
		System.out.println("\t 1) sort by name.");
		System.out.println("\t 2) sort by GPA.");
		System.out.println("\t 3) sort by class.");
		
		Scanner userInput2 = new Scanner(System.in); 
		int sortTheStudents = userInput2.nextInt();
		
		if(sortTheStudents == 1) 
		{
			sortByName(); 
		}
		if(sortTheStudents == 2) 
		{
			sortByGPA(); 
		}
		if(sortTheStudents == 3) 
		{
			sortByClass(); 
		}
		else 
		{
			System.out.println("Please input an accepted character ex 1,2 or 3. ");
		}
	}
	public static void sortByName() 
	{
		Collections.sort(DataOfStudent.studentInformation, new NameSorter()); 
	}
	public static void sortByGPA() 
	{
		//sort by GPA
	}
	public static void sortByClass() 
	{
		// sort by class 
	}
}
