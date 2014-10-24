import java.text.*; 
public class CalculateGPA 
{
	static String convert; 
	static double GPA; 
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
			
			convert += GPA;
			
			DataOfStudent.studentInformation.get(i).setGPA(GPA); 
		}
	}
	public static void grade() 
	{
		GPA = 0; 
		switch(convert) 
		{
			case "A+": 
			{
				GPA = GPA + 4.3; 
				break; 
			}
			case "A": 
			{
				GPA = GPA + 4.0; 
				break; 
			}
			case "A-": 
			{
				GPA = GPA + 3.7;
				break; 
			}
			case "B+": 
			{
				GPA = GPA + 3.3;
				break; 
			}
			case "B": 
			{
				GPA = GPA + 3.0; 
				break; 
			}
			case "B-": 
			{
				GPA = GPA + 2.7;
				break; 
			}
			case "C+": 
			{
				GPA = GPA + 2.3;
				break; 
			}
			case "C": 
			{
				GPA = GPA + 2.0;
				break; 
			}
			case "C-": 
			{
				GPA = GPA + 1.7;
				break; 
			}
			case "D+": 
			{
				GPA = GPA + 1.3; 
				break; 
			}
			case "D": 
			{
				GPA = GPA + 1.0; 
				break; 
			}
			case "D-": 
			{
				GPA = GPA + 1.7; 
				break; 
			}
			case "F": 
			{
				GPA = GPA + 0; 
				break; 
			}
		}
		
	}
}
