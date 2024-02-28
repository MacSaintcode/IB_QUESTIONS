package IB_QUESTIONS.src.university;

public class Course {
    String courseCode, title;
    Professor professor;
    public Course(String courseCode, String title, Professor professor) {
        this.title = title;
        this.courseCode = courseCode;
        this.professor = professor;
    }

    @Override
    public String toString() {
        return String.format("Course Information: \nname: %s, course code: %s, professor: %s",
        title, courseCode, professor);
    }
}

