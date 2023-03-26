package gradecalculator;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
        return courses.stream()
                .mapToDouble(Course::multiplyCredetAndCourseGrade)
                .sum();
    }

    public int calaculateTotalComlpetedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
