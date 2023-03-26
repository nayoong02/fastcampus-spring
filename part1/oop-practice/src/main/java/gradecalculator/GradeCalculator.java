package gradecalculator;

import java.util.List;

public class GradeCalculator {

    private final Courses courses;

    public GradeCalculator(Courses courses) {
        this.courses = courses;
    }

    /**
     * 핵심 포인트
     */
    // 이수한 과목을 전달해 평균학점 계산 요청 -> 학점 계산기 -> (학점수 x 교과목 평점)의 합계 -> 과목(코스)
    //
    public double calculateGrade() {
        // (학점 수 x 교과목 평점)의 합계
        double totalMultipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();

        // 수강신청 총학점 수
        int totalCompletedCredit = courses.calaculateTotalComlpetedCredit();

        return totalMultipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
