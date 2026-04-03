public class ELearningSystem {
    public static void main(String[] args) {

        try {
            // Create Courses
            OnlineCourse online = new OnlineCourse("C1", "Java Programming", 15, 10, "Zoom");
            OfflineCourse offline = new OfflineCourse("C2", "Database Systems", 8, 20, "Campus", 50);

            // Polymorphism
            System.out.println("Online Fee: " + online.calculateFee());
            System.out.println("Offline Fee: " + offline.calculateFee());

            // Students
            Student s1 = new Student("S1", "Ali");
            Student s2 = new Student("S2", "Asha");

            // Enroll students
            s1.enroll(online);
            s2.enroll(offline);

            // Casting to access specific methods
            online.enrollStudent("Ali");
            online.trackProgress("Ali", 80);

            offline.enrollStudent("Asha");
            offline.scheduleClass("10-Apr-2026", "10:00 AM");
            offline.issueCertificate("Asha");

            // Display Details
            online.displayCourseDetails();
            offline.displayCourseDetails();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}