
/**
 * Write a description of class Application here.
 *
 * @author Mohammed Nafis Hossain
 * @version 22/03/2021
 */
public class universityApplication
{
    // instance variables - replace the example below with your own
    ArrayList<Student> universityStudent;
    ArrayList<Course> universityCourse;
    ArrayList<Grades> grades;
    
    public universityApplication() {
        universityCourse = new ArrayList<>();
        universityStudent = new ArrayList<>();
        grade = new ArrayList<>();
    }
    
    public boolean addNewStudent(student s){
        if (!(universityStudent.contain(s))) {
            universityStudent.add(s);
            return true;
        }
        return false;
    }
    
    public boolean addNewCourse(Course x){
        if (!(universityCourse.contain(x))) {
            unicversityCourse.add(x);
            return true;
        }
        return false;
    }
    
    public boolean enrollForCourse(Student s, Course x) {
        if (s.enrollForCourse(x) && x.addStudentToCourse(s))
                 return true;
        return false;
    }
    

    /**
     * Constructor for objects of class Application
     */
    public Application()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
