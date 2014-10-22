import java.util.*;

public class ChangeGradesAndClasses
	{
	static int bob;
	static int counter= 0;
	static int bobs;
	static int lol;
	static int lou;
	static String srh;

	public static void changeGrade()
		{
		Scanner bobby = new Scanner(System.in);
		System.out.println("1) Change Grade");
		System.out.println("2) Switch Classes");
		bob = bobby.nextInt();
		if (bob == 1)
			{
			System.out
					.println("\n"
							+ "Here are the names of the students, which one would you like to change?"
							+ "\n");
			Collections
					.sort(DataOfStudent.studentInformation, new NameSorter());
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
					+ DataOfStudent.studentInformation.get(lol).getLastName() + ".");
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
			System.out.println("1) " + DataOfStudent.studentInformation.get(lol).getPeriodOne());
			System.out.println("2) " + DataOfStudent.studentInformation.get(lol).getPeriodTwo());
			System.out.println("3) " + DataOfStudent.studentInformation.get(lol).getPeriodThree());
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

			}

		}

	}