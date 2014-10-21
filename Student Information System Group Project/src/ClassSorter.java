import java.util.Comparator;

public class ClassSorter implements Comparator<Student>
	{
	public int compare(Student s1, Student s2)
		{
		if (userChoice ==1 ) return s1.getPeriodOne().compareTo(s2.getPeriodOne());
		else if (userChoice ==2) return s1.getPeriodTwo().compareTo(s2.getPeriodTwo());
		else return s1.getPeriodThree().compareTo(s2.getPeriodThree());
		}
	}
