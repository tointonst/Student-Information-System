import java.util.Collections;
import java.util.Scanner;


public class SetStudent {
	public static int userAddOrDelete;

	public static void setStudentMenu()
		{
		System.out.println("\n" + "Add or Delete a Student");
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
			System.out.println();
			}
		
		}
	
	public static void deleteStudent()
		{
		System.out.println("\n" + "Which student would you like to delete?");
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
		System.out.println("\n" + "What is the first name of the student?");
		Scanner userInput = new Scanner(System.in);
		String firstName = userInput.next();
		System.out.println("\n" +"What is the last name of the student?");
		Scanner userInput2 = new Scanner(System.in);
		String lastName = userInput2.next();
		System.out.println("\n" + "What class is the students first peroid?");
		Scanner userInput3 = new Scanner(System.in);
		String periodOne= userInput3.next();
		System.out.println("\n" + "What grade does the student have in " + periodOne + "?");
		Scanner userInput4 = new Scanner(System.in);
		String periodOneGrade = userInput4.next();
		System.out.println("\n" + "What class is the students second peroid?");
		Scanner userInput5 = new Scanner(System.in);
		String periodTwo= userInput5.next();
		System.out.println("\n" + "What grade does the student have in " + periodTwo + "?");
		Scanner userInput6 = new Scanner(System.in);
		String periodTwoGrade = userInput6.next();
		System.out.println("\n" + "What class is the students third peroid?");
		Scanner userInput7 = new Scanner(System.in);
		String periodThree = userInput7.next();
		System.out.println("\n" + "What grade does the student have in " + periodThree + "?");
		Scanner userInput8 = new Scanner(System.in);
		String periodThreeGrade = userInput8.next();
		DataOfStudent.studentInformation.add(new Student(firstName, lastName, periodOne, periodOneGrade, periodTwo, periodTwoGrade, periodThree, periodThreeGrade, 0.0));
		
		System.out.println("\n" + "This is the list of " + firstName + "'s classes." + "\n");
			System.out.println(DataOfStudent.studentInformation.get(DataOfStudent.studentInformation.size()-1)
					.getFirstName()
					+ " "
					+ DataOfStudent.studentInformation.get(DataOfStudent.studentInformation.size()-1).getLastName()
					+ "  "
					+ DataOfStudent.studentInformation.get(DataOfStudent.studentInformation.size()-1).getPeriodOne()
					+ " "
					+ DataOfStudent.studentInformation.get(DataOfStudent.studentInformation.size()-1)
							.getPeriodOneGrade()
					+ "  "
					+ DataOfStudent.studentInformation.get(DataOfStudent.studentInformation.size()-1).getPeriodTwo()
					+ " "
					+ DataOfStudent.studentInformation.get(DataOfStudent.studentInformation.size()-1)
							.getPeriodTwoGrade()
					+ "  "
					+ DataOfStudent.studentInformation.get(DataOfStudent.studentInformation.size()-1).getPeriodThree()
					+ " "
					+ DataOfStudent.studentInformation.get(DataOfStudent.studentInformation.size()-1)
							.getPeriodThreeGrade());
			
		}
	//asdfasdf

}
