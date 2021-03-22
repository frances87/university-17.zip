
/**
 * Write a description of class student here.
 *
 * @author (Frances Utomi)
 * @version (22/03/2021)
 */
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
        
        public boolean enrollForCourse(Course x) {
            if(!(courseEnrolled.contains(x))){
                courseEnrolled.add(x);
                return true;
            }
            return false;
        }
        
        @override
        public String toString() {
            return "Student ["+studentID+" , "+studentName+" , "+dep.+"]";
        }
}
