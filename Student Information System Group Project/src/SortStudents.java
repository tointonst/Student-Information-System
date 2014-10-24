import java.util.Collections;
import java.util.Scanner;

public class SortStudents
	{
	static int userPeriodSort;

	public static void sortStudentsMenu()
		{
		System.out.println("\n" + "Sort Students");
		System.out.println("\t 1) Sort by name.");
		System.out.println("\t 2) Sort by GPA.");
		System.out.println("\t 3) Sort by class.");

		Scanner userInput2 = new Scanner(System.in);
		int sortTheStudents = userInput2.nextInt();

		if (sortTheStudents == 1)
			{
			sortByName();
			}
		if (sortTheStudents == 2)
			{
			sortByGPA();
			}
		if (sortTheStudents == 3)
			{
			sortByClass();
			} 
		else
			{
			System.out.println(" ");
			}
		}

	public static void sortByName()
		{
		Collections.sort(DataOfStudent.studentInformation, new NameSorter());
		int counter =0;
		System.out.println();
		for (int i = 0; i < DataOfStudent.studentInformation.size(); i++)
			{
			counter++; 
			System.out.println(counter +") \t" + DataOfStudent.studentInformation.get(i)
					.getFirstName()
					+ " "
					+ DataOfStudent.studentInformation.get(i).getLastName()
					+ "\t"
					+ DataOfStudent.studentInformation.get(i).getPeriodOne()
					+ " "
					+ DataOfStudent.studentInformation.get(i)
							.getPeriodOneGrade()
					+ "\t"
					+ DataOfStudent.studentInformation.get(i).getPeriodTwo()
					+ " "
					+ DataOfStudent.studentInformation.get(i)
							.getPeriodTwoGrade()
					+ "\t"
					+ DataOfStudent.studentInformation.get(i).getPeriodThree()
					+ " "
					+ DataOfStudent.studentInformation.get(i)
							.getPeriodThreeGrade());
			}
		}

	public static void sortByGPA()
		{
		CalculateGPA.GPA(); 
		Collections.sort(DataOfStudent.studentInformation, new GPASorter());
		
		int counter =0;
		System.out.println();
		for (int i = 0; i < DataOfStudent.studentInformation.size(); i++)
			{
			counter++; 
			System.out.println(counter +") \t" + DataOfStudent.studentInformation.get(i)
					.getFirstName()
					+ " "
					+ DataOfStudent.studentInformation.get(i).getLastName()
					+ "\t"
					+ DataOfStudent.studentInformation.get(i).getPeriodOne()
					+ " "
					+ DataOfStudent.studentInformation.get(i)
							.getPeriodOneGrade()
					+ "\t"
					+ DataOfStudent.studentInformation.get(i).getPeriodTwo()
					+ " "
					+ DataOfStudent.studentInformation.get(i)
							.getPeriodTwoGrade()
					+ "\t"
					+ DataOfStudent.studentInformation.get(i).getPeriodThree()
					+ " "
					+ DataOfStudent.studentInformation.get(i)
							.getPeriodThreeGrade()
					+"\t GPA: "
					+ DataOfStudent.studentInformation.get(i)
							.getGPA()); 
					
			}
		}

	public static void sortByClass()
		{
		System.out.println("\n" + "Which period would you like to sort by?");
		System.out.println("\t 1) Period 1.");
		System.out.println("\t 2) Peroid 2.");
		System.out.println("\t 3) Period 3.");
		Scanner userInput = new Scanner(System.in);
		userPeriodSort = userInput.nextInt();
		
		
		Collections.sort(DataOfStudent.studentInformation, new ClassSorter());
		int counter =0;
		System.out.println();
		for (int i = 0; i < DataOfStudent.studentInformation.size(); i++)
			{
			counter++; 
			System.out.println(counter +") \t" + DataOfStudent.studentInformation.get(i)
					.getFirstName()
					+ " "
					+ DataOfStudent.studentInformation.get(i).getLastName()
					+ "\t"
					+ DataOfStudent.studentInformation.get(i).getPeriodOne()
					+ " "
					+ DataOfStudent.studentInformation.get(i)
							.getPeriodOneGrade()
					+ "\t"
					+ DataOfStudent.studentInformation.get(i).getPeriodTwo()
					+ " "
					+ DataOfStudent.studentInformation.get(i)
							.getPeriodTwoGrade()
					+ "\t"
					+ DataOfStudent.studentInformation.get(i).getPeriodThree()
					+ " "
					+ DataOfStudent.studentInformation.get(i)
							.getPeriodThreeGrade());
			}
		}
	}
