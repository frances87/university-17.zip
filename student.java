
/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class student
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class student
     */
    public class student
    {
        // initialise instance variables
        private String studentname;
        private int studentID;
        private String dep.;
        private ArrayList<Course> coursesEnrolled;
        private ArrayList<String> grades;
        
        public Student(String studentname, int studentID, String dep.){
            super();
            this.name = studentname;
            this.name = studentID;
            this.dep. = dep.;
            this.courseEnrolled = new Arraylist<>();
        }
        public String getStudentName() {
            return studentname;
        }
        public int getStudentID() {
            return studentID;
        }
        public String getDep.() {
            return dep.;
        }
        public boolean enrollForCourse(Course s) {
            if(!(courseEnrolled.contains(s))){
                courseEnrolled.add(s);
                return true;
            }
            return false;
        }
        @override
        public String toString() {
            return "Student ["+studentID+" , "+studentname+" , "+dep.+"]";
        }
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
