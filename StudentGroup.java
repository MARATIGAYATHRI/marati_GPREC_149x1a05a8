import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		String[] fullName=new String[length];
          int[] id=new int[length];
Date[] birthDate=new Date[length];
Double[] avgMark=new Double[length];
          Scanner SC=new Scanner(System.in);
           for(i=0;i<length;i++)
{
          System.out.print("Enter id: ");
          id=SC.nextInt();
id[i]=id;
          System.out.print("Enter name: ");
          fullName=SC.next();
fullName[i]=fullName;
          System.out.print("Enter date of birth: ");
          birthDate=(Date)SC.nextLine();
         SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
          birthDate=format.parse(birthDate);
birthDate[i]=birthDate;

          System.out.println("Enter average marks:");
          avgMark=SC.nextDouble();
avgMark[i]=avgMark;
           
}

		return null;
	}
		

	@Override
	public void setStudents(Student[] students) {
	try
{
if(Student[0]=null)
}
catch(IllegalArgumentException ae)
{
System.out.println("IllegalArgumentException"+ae);
return;
}
for(i=0;i<length;i++)
{
System.out.println("student id"+id[i]);
System.out.println("student full name"+fullName[i]);
System.out.println("student date of birth"+birthDate[i]);
System.out.println("student average marks"+avgMark[i]);
	}
}
	@Override
	public Student getStudent(int index) {
		try{
if(index<0||index>=length)
}
catch(IllegalArgumentException ae)
{
System.out.println("IllegalArgumentException"+ae);
return;
}


		
	}


	@Override
	public void setStudent(Student student, int index) {
	if((index<0||index>=length)||(Student[0]=null))
}
catch(IllegalArgumentException ae)
{
System.out.println("IllegalArgumentException"+ae);
return;
}
	
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	 public void swap(int *xp, int *yp)
{
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}
	public void bubbleSort() {
		
 
int n=Student.length;

   int i, j;
   for (i = 0; i < n-1; i++)      
 
              for (j = 0; j < n-i-1; j++) 
           if (Student[j] > Student[j+1])
              swap(&Student[j], &Student[j+1]);
}
	

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
