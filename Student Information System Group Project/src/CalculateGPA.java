
public class CalculateGPA 
{
	static String convert; 
	static double number; 
	public static void GPA() 
	{
		for(int i = 0; i < DataOfStudent.studentInformation.size();i++) 
		{
			convert = DataOfStudent.studentInformation.get(i).getPeriodOneGrade();
			grade();
			convert = DataOfStudent.studentInformation.get(i).getPeriodTwoGrade(); 
			grade(); 
			convert = DataOfStudent.studentInformation.get(i).getPeriodThreeGrade(); 
			grade(); 
		}
	}
	public static void grade() 
	{
		switch(convert) 
		{
			case "A+": 
			{
				number = number + 4.3; 
				break; 
			}
			case "A": 
			{
				number = number + 4.0; 
				break; 
			}
			case "A-": 
			{
				number = number + 3.7;
				break; 
			}
			case "B+": 
			{
				number = number + 3.3;
				break; 
			}
			case "B": 
			{
				number = number + 3.0; 
				break; 
			}
			case "B-": 
			{
				number = number + 2.7;
				break; 
			}
			case "C+": 
			{
				number = number + 2.3;
				break; 
			}
		}
	}
}
