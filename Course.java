abstract class Course {
    private final String courseId;
    private String title;
    private final int duration;
    private final double baseFee;

    // Constructor
    public Course(String courseId, String title, int duration, double baseFee) {
        this.courseId = courseId;
        this.title = title;
        this.duration = duration;
        this.baseFee = baseFee;
    }

    // Getters & Setters
    public String getCourseId() { return courseId; }
    public String getTitle() { return title; }
    public int getDuration() { return duration; }
    public double getBaseFee() { return baseFee; }

    public void setTitle(String title) { this.title = title; }

    // Abstract Method
    public abstract double calculateFee();

    // Concrete Method
    public void displayCourseDetails() {
        System.out.println("ID: " + courseId);
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " hrs");
        System.out.println("Base Fee: $" + baseFee);
    }
}