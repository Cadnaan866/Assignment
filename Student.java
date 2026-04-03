import java.util.List;
import java.util.ArrayList;

class Student {

    private final String name;
    private final List<Course> enrolledCourses;

    // Constructor
    public Student(String id, String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    // Add course (ENROLL)
    public void enroll(Course course) {
        enrolledCourses.add(course); 
        System.out.println(name + " enrolled in " + course.getTitle());
    }

    // View courses
    public void viewCourses() {
        if (enrolledCourses.isEmpty()) {
            System.out.println(name + " has no courses.");
        } else {
            System.out.println(name + "'s Courses:");
            for (Course c : enrolledCourses) {
                System.out.println("- " + c.getTitle());
            }
        }
    }
}
