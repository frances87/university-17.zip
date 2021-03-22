
/**
 * Write a description of class grade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class grade
{
    // instance variables - replace the example below with your own
    private Student s;
    private Course x;
    private String grade;
    
    public Grade(Student s, Course s, String grade) {
        super();
        this.s = s;
        this.x = x;
        this.grade = grade;
    }
    
    public String getGrade() {
        return grade;
    }
    
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    public Student getS() {
        return s;
    }
    
    public Course getX() {
        return s;
    }
    
}
    

    /**
     * Constructor for objects of class grade
     */
    public grade()
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
