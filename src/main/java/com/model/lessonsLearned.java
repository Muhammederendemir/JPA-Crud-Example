package com.model;

public class lessonsLearned {
    Long LessonId;
    Long StudentId;

    public Long getLessonId() {
        return LessonId;
    }

    public void setLessonId(Long lessonId) {
        LessonId = lessonId;
    }

    public Long getStudentId() {
        return StudentId;
    }

    public void setStudentId(Long studentId) {
        StudentId = studentId;
    }

    @Override
    public String toString() {
        return "lessonsLearned{" +
                "LessonId=" + LessonId +
                ", StudentId=" + StudentId +
                '}';
    }
}
