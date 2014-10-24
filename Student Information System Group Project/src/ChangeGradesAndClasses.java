import java.util.*;

public class ChangeGradesAndClasses
	{
	static int bob;
	static int counter = 0;
	static int bobs;
	static int lol;
	static int lou;
	static String srh;
	static int total;
	static int steve;
	static int harris;
	static String a;
	static String b;
	static String c;

	public static void changeGrade()
		{
		Scanner bobby = new Scanner(System.in);
		Collections.sort(DataOfStudent.studentInformation, new NameSorter());
		System.out.println("\n" + "Change Student Grades/Schedule");
		System.out.println("\t 1) Change Grade");
		System.out.println("\t 2) Switch Classes");
		bob = bobby.nextInt();
		if (bob == 1)
			{
			System.out
					.println("\n"
							+ "Here are the names of the students, which one would you like to change?"
							+ "\n");
			for (int i = 0; i < DataOfStudent.studentInformation.size(); i++)
				{
				counter++;
				System.out
						.println(counter
								+ ")"
								+ " "
								+ DataOfStudent.studentInformation.get(i)
										.getFirstName()
								+ " "
								+ DataOfStudent.studentInformation.get(i)
										.getLastName());
				}
			bobs = bobby.nextInt();
			lol = bobs - 1;
			System.out.println("\n" + "Here are the classes and scores of "
					+ DataOfStudent.studentInformation.get(lol).getFirstName()
					+ " "
					+ DataOfStudent.studentInformation.get(lol).getLastName()
					+ ".");
			System.out.println("\n"
					+ DataOfStudent.studentInformation.get(lol).getPeriodOne()
					+ " "
					+ DataOfStudent.studentInformation.get(lol)
							.getPeriodOneGrade()
					+ " "
					+ DataOfStudent.studentInformation.get(lol).getPeriodTwo()
					+ " "
					+ DataOfStudent.studentInformation.get(lol)
							.getPeriodTwoGrade()
					+ " "
					+ DataOfStudent.studentInformation.get(lol)
							.getPeriodThree()
					+ " "
					+ DataOfStudent.studentInformation.get(lol)
							.getPeriodThreeGrade());
			System.out.println("\n" + "Which grade of "
					+ DataOfStudent.studentInformation.get(lol).getFirstName()
					+ " "
					+ DataOfStudent.studentInformation.get(lol).getLastName()
					+ " would you like to change.");
			System.out.println("1) "
					+ DataOfStudent.studentInformation.get(lol).getPeriodOne());
			System.out.println("2) "
					+ DataOfStudent.studentInformation.get(lol).getPeriodTwo());
			System.out.println("3) "
					+ DataOfStudent.studentInformation.get(lol)
							.getPeriodThree());
			lou = bobby.nextInt();
			if (lou == 1)
				{
				System.out.println("\n"
						+ "What you like to change that grade to?");
				srh = bobby.next();
				DataOfStudent.studentInformation.get(lol)
						.setPeriodOneGrade(srh);
				}
			if (lou == 2)
				{
				System.out.println("\n"
						+ "What you like to change that grade to?");
				srh = bobby.next();
				DataOfStudent.studentInformation.get(lol)
						.setPeriodTwoGrade(srh);
				}
			if (lou == 3)
				{
				System.out.println("\n"
						+ "What you like to change that grade to?");
				srh = bobby.next();
				DataOfStudent.studentInformation.get(lol).setPeriodThreeGrade(
						srh);
				}
			System.out.println("\n" + "Here are the new grades of "
					+ DataOfStudent.studentInformation.get(lol).getFirstName()
					+ " "
					+ DataOfStudent.studentInformation.get(lol).getLastName()
					+ ".");
			System.out.println("\n"
					+ DataOfStudent.studentInformation.get(lol).getPeriodOne()
					+ " "
					+ DataOfStudent.studentInformation.get(lol)
							.getPeriodOneGrade()
					+ " "
					+ DataOfStudent.studentInformation.get(lol).getPeriodTwo()
					+ " "
					+ DataOfStudent.studentInformation.get(lol)
							.getPeriodTwoGrade()
					+ " "
					+ DataOfStudent.studentInformation.get(lol)
							.getPeriodThree()
					+ " "
					+ DataOfStudent.studentInformation.get(lol)
							.getPeriodThreeGrade());

			} else
			{
			System.out.println("\n" + "Which student would like to choose?"
					+ "\n");
			for (int j = 0; j < DataOfStudent.studentInformation.size(); j++)
				{
				total++;
				System.out.println(total
						+ ")"
						+ "\t"
						+ DataOfStudent.studentInformation.get(j)
								.getFirstName()
						+ " "
						+ DataOfStudent.studentInformation.get(j).getLastName()
						+ "\t"
						+ DataOfStudent.studentInformation.get(j)
								.getPeriodOne()
						+ " "
						+ DataOfStudent.studentInformation.get(j)
								.getPeriodOneGrade()
						+ "\t"
						+ DataOfStudent.studentInformation.get(j)
								.getPeriodTwo()
						+ " "
						+ DataOfStudent.studentInformation.get(j)
								.getPeriodTwoGrade()
						+ "\t"
						+ DataOfStudent.studentInformation.get(j)
								.getPeriodThree()
						+ " "
						+ DataOfStudent.studentInformation.get(j)
								.getPeriodThreeGrade());
				}
			steve = bobby.nextInt();
			harris = steve - 1;
			System.out.println("\n"
					+ "Here is the schedule of "
					+ DataOfStudent.studentInformation.get(harris)
							.getFirstName()
					+ " "
					+ DataOfStudent.studentInformation.get(harris)
							.getLastName() + ".");
			System.out.println("\n"
					+ DataOfStudent.studentInformation.get(harris)
							.getPeriodOne()
					+ " "
					+ DataOfStudent.studentInformation.get(harris)
							.getPeriodOneGrade()
					+ " "
					+ DataOfStudent.studentInformation.get(harris)
							.getPeriodTwo()
					+ " "
					+ DataOfStudent.studentInformation.get(harris)
							.getPeriodTwoGrade()
					+ " "
					+ DataOfStudent.studentInformation.get(harris)
							.getPeriodThree()
					+ " "
					+ DataOfStudent.studentInformation.get(harris)
							.getPeriodThreeGrade());
			System.out.println("\n"
					+ "What would you like to change period one to?");
			a = bobby.next();
			System.out.println("\n"
					+ "What would you like to change period two to?");
			b = bobby.next();
			System.out.println("\n"
					+ "What would you like to change period three to?");
			c = bobby.next();
			System.out.println("\n"
					+ "Here is the new schedule of "
					+ DataOfStudent.studentInformation.get(harris)
							.getFirstName()
					+ " "
					+ DataOfStudent.studentInformation.get(harris)
							.getLastName() + ".");
			DataOfStudent.studentInformation.get(harris).setPeriodOne(a);
			DataOfStudent.studentInformation.get(harris).setPeriodTwo(b);
			DataOfStudent.studentInformation.get(harris).setPeriodThree(c);
			System.out.println("\n" + "Period One "
					+ DataOfStudent.studentInformation.get(harris)
							.getPeriodOne() + "\n" + "Period Two " + DataOfStudent.studentInformation.get(harris)
							.getPeriodTwo() +  "\n" + "Period Three " + DataOfStudent.studentInformation.get(harris)
							.getPeriodThree()); 
			

			}

		}
	}