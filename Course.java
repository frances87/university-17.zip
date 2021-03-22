
/**
 * This part of a University application which is meant to compile and print the information for a univeristy for use by departments,
 * students and instructors to be able to assess the information at hand.
 * The class is the Course class which will take the CRN number, title , enrollment and instructors into consideration.
 * It is meant to get the course number, the course name , who is enrolled in it or check if a student is enrolled in the course 
 * and the name of the instructor being reffered to.
 * @author (Fadzai Muzhuzha)
 * @version (22/04/2021)
 */
public class Course
{
    // instance variables - replace the example below with your own
    private int courseNumber;
    private String title;
    private ArrayList<Student>studentsEnrolled;
    private String instructorName;
    /**
     * Constructor for objects of class Course
     */
    public Course(int courseNumber,String title, String instructorName)
    {
        // initialise instance variables
        super();
        this.courseNumber = courseNumber;
        this.title = title;
        this.instructor = instructorName;
        this.studentsEnrolled = new ArrayList<>();
    
    }

    /**
     * This is the method to get the coursenumber from the system in the application.
     *
     * 
     * @return    the sum of x and y
     */
    public int getCourseNumber() 
    {
        //This returns the courseNumber as an integer 
        return courseNumber;
    }
    public String getTitle()
    { 
        //This returns the courseName or title as a string
        return title;
    }
    public ArrayList<Student> getStudentsEnrolled()
    { 
        //This returns the compilation of students enrolled in the course. Including the number of students and their names and ID
        return studentsEnrolled;
    }
    public String getInstructorName()
    { 
        //This returns the name of the Instructor taking the course as a string
        return instructorName;
    }
    public boolean enrollForCourse(Course x)
    {
        //This returns true or false if the student is enrolled in the course aforementioned
        if (!(coursesEnrolled.contains(x)))
            {
                coursesEnrolled.add(x);
                return true;
            } 
            return false;
    }
    public String toString()
    {
        //This returns the student's ID,name and department
        return "Student["+studentID+","+studentName+","+dep+"]";
    }
}
