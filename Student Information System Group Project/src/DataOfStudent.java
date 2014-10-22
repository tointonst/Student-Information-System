import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataOfStudent
	{
	static String firstName;
	static String lastName;
	static String periodOne;
	static String periodOneGrade;
	static String periodTwo;
	static String periodTwoGrade;
	static String periodThree;
	static String periodThreeGrade;
	static ArrayList<Student> studentInformation = new ArrayList<Student>();
	public static void fillArrayList() throws FileNotFoundException
		{
	    Scanner file = new Scanner(new File("studentlist.txt"));
	    while(file.hasNext())
	    	{
	    	firstName=file.next();
			lastName=file.next();
			periodOne=file.next();
			periodOneGrade=file.next();
			periodTwo=file.next();
			periodTwoGrade=file.next();
			periodThree=file.next();
			periodThreeGrade=file.next();
			studentInformation.add(new Student(firstName, lastName, periodOne, periodOneGrade, periodTwo, periodTwoGrade, periodThree, periodThreeGrade, 0.0));
	    	}
		}

	}
