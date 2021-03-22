
/**
 * Write a description of class Application here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
    
/**
 * The university application sorts and assess the methods to add new courses to the univeristy
 * It also adds new students to the roster and enrols them in courses.
 * It also keeps track of grades and assigns them to students 
 * Lastly, the application collects all the info about the courses and prints that for the courses and the department
 *
 * @author (Fadzai Muzhuzha)
 * @version (22/03/2021)
 */
public class universityApplication
{
/**
* Constructor for objects of class Application
*/
    public univeristyApplication()
{
    }
    public void printStudentsCourseGradeInformation(Students)
    {
        System.out.println("COURSE GRADES FOR" + "s.getStudentName());
            for (Grade g : grades)
            { 
                if (g.getS().equals(s) )
                { System.out.println(g.getX() + "" g.getGrade());
                }
            }
    public boolean assignGrade(Students s, Course x, String grade)
    {
        for (Grade g: grades)
        {
            if(g.getS().equals(x))
            {
                g.setGrade(grade);
                return true;
            }
        }
    } 
        if (universityStudents.contains(x))
        {   
            if(universityCourse.contains(x))
                grades.add(new Grade(s,x,grade));
                return true;
        }
    }
        return false;
    }
    public void printAllStudentInformation(String dep)
    {
        System.out.println("ALL STUDENTS IN THE DEPARTMENT"+ dep +");
        for(Student x:universityStudents)
            if (x.getDep().equals(dep))
                System.out.println(x);
    }
}
    
    public boolean enrollForCourse(Student s, Course x) {
        if (s.enrollForCourse(x) && x.addStudentToCourse(s))
                 return true;
        return false;
    }
    
 }
