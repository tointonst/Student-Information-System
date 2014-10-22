import java.util.*;

public class ChangeGradesAndClasses
	{
	static int bob;
	static int counter=0;
	static int bobs;
	static int lol;
	static int lou;
	static String srh;
	
	public static void changeGrade()
		{
		Scanner bobby=new Scanner(System.in);
		System.out.println("1) Change Grade");
		System.out.println("2) Switch Classes");
		bob=bobby.nextInt();
		if(bob==1)
			{
			System.out.println("\n" + "Here is the names of the students which one would you like to change?" + "\n");
			Collections.sort(DataOfStudent.studentInformation, new NameSorter());
			for(int i=0; i<DataOfStudent.studentInformation.size(); i++)
				{
				counter++;
			System.out.println(counter + ")" + " " + DataOfStudent.studentInformation.get(i).getFirstName() + " " + DataOfStudent.studentInformation.get(i).getLastName());
			    }
			bobs=bobby.nextInt();
			lol=bobs-1;
			if(DataOfStudent.studentInformation.get(lol).getLastName().substring(DataOfStudent.studentInformation.get(lol).getLastName().length()-1, DataOfStudent.studentInformation.get(lol).getLastName().length()).equals("s"))
			{
			System.out.println("\n" + "Here are " + DataOfStudent.studentInformation.get(lol).getFirstName() + " " + DataOfStudent.studentInformation.get(lol).getLastName() + "' classes and scores.");
			}
			else
			{
				System.out.println("\n" + "Here are " + DataOfStudent.studentInformation.get(lol).getFirstName() + " " + DataOfStudent.studentInformation.get(lol).getLastName() + "'s classes and scores.");
			}
			System.out.println("\n" + DataOfStudent.studentInformation.get(lol).getPeriodOne() + " " + DataOfStudent.studentInformation.get(lol).getPeriodOneGrade() + " " + DataOfStudent.studentInformation.get(lol).getPeriodTwo() + " " + DataOfStudent.studentInformation.get(lol).getPeriodTwoGrade() + " " + DataOfStudent.studentInformation.get(lol).getPeriodThree() + " " + DataOfStudent.studentInformation.get(lol).getPeriodThreeGrade());
			System.out.println("\n" + "Which grade of " + DataOfStudent.studentInformation.get(lol).getFirstName() + " " + DataOfStudent.studentInformation.get(lol).getLastName() + " would you like to change.");
			System.out.println("1) Period One");
			System.out.println("2) Period Two");
			System.out.println("3) Period Three");
			lou=bobby.nextInt();
			if(lou==1)
			{
				System.out.println("\n" + "What you like to change that grade to?");
				srh=bobby.next();
				//System.out.println(DataOfStudent.studentInformation.get(lol).setPeriodOneGrade());
			}
			if(lou==2)
			{
				System.out.println("\n" + "What you like to change that grade to?");
				srh=bobby.next();
			}
			if(lou==3)
			{
				System.out.println("\n" + "What you like to change that grade to?");
				srh=bobby.next();
			}
			
			}
		
		}

	}