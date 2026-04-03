import java.util.*;

class OnlineCourse extends Course implements Enroll, Trackable {

    private final List<String> students = new ArrayList<>();
    private final DiscountStrategy discountStrategy;

    public OnlineCourse(String id, String title, int duration, double baseFee, String platform) {
        super(id, title, duration, baseFee);
        this.discountStrategy = new LongCourseDiscount();
    }

    @Override
    public double calculateFee() {
        double fee = getBaseFee() * getDuration() * 0.5;
        if (getDuration() > 10) {
            fee = discountStrategy.applyDiscount(fee);
        }
        return fee;
    }

    @Override
    public void enrollStudent(String name) {
        students.add(name);
        System.out.println(name + " enrolled in Online Course");
    }

    // Overloading
    public void enrollStudent(String name, String email) {
        students.add(name + " (" + email + ")");
        System.out.println(name + " enrolled with email");
    }

    @Override
    public void trackProgress(String studentName, int progress) {
        System.out.println(studentName + " progress: " + progress + "%");
    }
}
