import java.util.Collections;
import java.util.Scanner;


public class SetStudent {
	public static int userAddOrDelete;

	public static void setStudentMenu()
		{
		System.out.println("Add or Delete a Student");
		System.out.println("\t 1)Add a student");
		System.out.println("\t 2)Delete a student");
		Scanner userInput = new Scanner(System.in);
		userAddOrDelete = userInput.nextInt();
		if (userAddOrDelete==1)
			{
			addStudent();
			}
		else if (userAddOrDelete ==2)
			{
			deleteStudent();
			}
		else
			{
			System.out.println("Pleae input the number ex. 1 or 2");
			}
		
		}
	
	public static void deleteStudent()
		{
		System.out.println("Which student would you like to delete?");
		Scanner userInput = new Scanner(System.in);
		
		Collections
		.sort(DataOfStudent.studentInformation, new NameSorter());
		int counter =0;
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
		int userDeleteStudent = userInput.nextInt();
		DataOfStudent.studentInformation.remove(userDeleteStudent-1);
		
		System.out.println();
		System.out.println("Here is the new list of students.");
		int counter2 =0;
		for (int i = 0; i < DataOfStudent.studentInformation.size(); i++)
			{
			counter2++;
			System.out.println(counter2 +") \t" + DataOfStudent.studentInformation.get(i)
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
			
	public static void addStudent()
		{
		System.out.println("What is ");
		Scanner userInput = new Scanner(System.in);
		userAddOrDelete = userInput.nextInt();
		DataOfStudent.studentInformation.add(new Student(firstName, lastName, periodOne, periodOneGrade, periodTwo, periodTwoGrade, periodThree, periodThreeGrade, 0.0));
		}

}
