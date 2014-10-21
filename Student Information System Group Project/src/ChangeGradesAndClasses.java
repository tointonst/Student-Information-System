import java.util.*;
import java.util.Collections;

public class ChangeGradesAndClasses
	{
	static int bob;
	static int counter=0;
	static String bobs;
	static String lol;
	
	public static void changeGrade()
		{
		Scanner bobby=new Scanner(System.in);
		System.out.println("1) Change Grade");
		System.out.println("2) Switch Classes" + "\n");
		bob=bobby.nextInt();
		if(bob==1)
			{
			Collections.sort(DataOfStudent.studentInformation, new NameSorter());
			for(int i=0; i<DataOfStudent.studentInformation.size(); i++)
				{
				counter++;
			System.out.println(counter + ")" + " " + DataOfStudent.studentInformation.get(i).getFirstName() + " " + DataOfStudent.studentInformation.get(i).getLastName());
				}
			System.out.println("\n" + "What is the studets first name that you would like to change?");
			bobs=bobby.next();
			System.out.println("\n" + "What is the studets last name that you would like to change?");
			lol=bobby.next();
			}
		
		}

	}