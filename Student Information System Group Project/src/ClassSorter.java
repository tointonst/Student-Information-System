import java.util.Comparator;

public class ClassSorter //implements Comparator<Student>
	{
	public int compare(Student s1, Student s2, Student s3)
		{

		if (s1.getPeriodOne().compareTo(s2.getPeriodTwo()) < 0)
			{
			if (s2.getPeriodTwo().compareTo(s3.getPeriodThree()) < 0)
				{
				return s1.getPeriodOne().compareTo(s3.getPeriodThree());
				} 
			else
				{
				return s2.getPeriodTwo().compareTo(s3.getPeriodThree());
				}
			}
		else 
			{
			return s1.getPeriodOne().compareTo(s3.getPeriodThree());
			}
		}
	}
