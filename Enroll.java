interface Enroll {
    void enrollStudent(String name);
}

interface Certifiable {
    void issueCertificate(String studentName);
}

interface Trackable {
    void trackProgress(String studentName, int progress);
}

interface Schedulable {
    void scheduleClass(String date, String time);
}