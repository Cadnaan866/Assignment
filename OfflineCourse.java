import java.util.List;
import java.util.ArrayList;

class OfflineCourse extends Course implements Enroll, Certifiable, Schedulable {

    private final String location;
    private final double materialFee;
    private final List<String> students;

    // Constructor
    public OfflineCourse(String id, String title, int duration, double baseFee,
                         String location, double materialFee) {
        super(id, title, duration, baseFee);
        this.location = location;
        this.materialFee = materialFee;
        this.students = new ArrayList<>(); // FIXED initialization
    }

    // Calculate total fee
    @Override
    public double calculateFee() {
        return (getBaseFee() * getDuration()) + materialFee;
    }

    // Enroll student (Override)
    @Override
    public void enrollStudent(String name) {
        students.add(name);
        System.out.println(name + " enrolled in Offline Course at " + location);
    }

    // Method Overloading
    public void enrollStudent(String name, String email) {
        students.add(name + " (" + email + ")");
        System.out.println(name + " enrolled with email in Offline Course");
    }

    // Issue certificate
    @Override
    public void issueCertificate(String studentName) {
        if (students.contains(studentName)) {
            System.out.println("Certificate issued to " + studentName);
        } else {
            System.out.println("Student not found!");
        }
    }

    // Schedule class
    @Override
    public void scheduleClass(String date, String time) {
        System.out.println("Class scheduled at " + location +
                " on " + date + " at " + time);
    }
}