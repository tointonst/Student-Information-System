
public class Student
	{
	private String firstName;
	private String lastName;
	private String periodOne;
	private String periodOneGrade;
	private String periodTwo;
	private String periodTwoGrade;
	private String periodThree;
	private String periodThreeGrade;
	private int GPA;
	
	public Student(String fn, String ln, String po, String pog, String pt, String ptg, String pth, String pthg, int gpa)
		{
		firstName=fn;
		lastName=ln;
		periodOne=po;
		periodOneGrade=pog;
		periodTwo=pt;
		periodTwoGrade=ptg;
		periodThree=pth;
		periodThreeGrade=pthg;
		GPA=gpa;
		}
	

	public String getFirstName()
		{
		return firstName;
		}

	public void setFirstName(String firstName)
		{
		this.firstName = firstName;
		}

	public String getLastName()
		{
		return lastName;
		}

	public void setLastName(String lastName)
		{
		this.lastName = lastName;
		}

	public String getPeriodOne()
		{
		return periodOne;
		}

	public void setPeriodOne(String periodOne)
		{
		this.periodOne = periodOne;
		}

	public String getPeriodOneGrade()
		{
		return periodOneGrade;
		}

	public void setPeriodOneGrade(String periodOneGrade)
		{
		this.periodOneGrade = periodOneGrade;
		}

	public String getPeriodTwo()
		{
		return periodTwo;
		}

	public void setPeriodTwo(String periodTwo)
		{
		this.periodTwo = periodTwo;
		}

	public String getPeriodTwoGrade()
		{
		return periodTwoGrade;
		}

	public void setPeriodTwoGrade(String periodTwoGrade)
		{
		this.periodTwoGrade = periodTwoGrade;
		}

	public String getPeriodThree()
		{
		return periodThree;
		}

	public void setPeriodThree(String periodThree)
		{
		this.periodThree = periodThree;
		}

	public String getPeriodThreeGrade()
		{
		return periodThreeGrade;
		}

	public void setPeriodThreeGrade(String periodThreeGrade)
		{
		this.periodThreeGrade = periodThreeGrade;
		}

	public int getGPA()
		{
		return GPA;
		}

	public void setGPA(int gPA)
		{
		GPA = gPA;
		}
	//igy8if
	}
