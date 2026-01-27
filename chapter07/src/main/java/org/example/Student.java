package org.example;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Student {
    private String id;
    private String name;
    private List<Grade> grades; // 성적 리스트

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // 동작: 과목 수강 시작 (Grade 객체 생성 및 리스트 추가)
    public void takeCourse(Subject subject) {
        Grade newGrade = new Grade(subject);
        this.grades.add(newGrade);
        System.out.println(name + " 학생이 " + subject.getTitle() + " 수강을 시작합니다.");
    }

    // 동작: 성적표 출력
    public void showReportCard() {
        System.out.println("\n===== " + name + "의 성적표 =====");
        for (Grade g : grades) {
            System.out.println("과목: " + g.getSubject().getTitle() + " | 점수: " + g.getScore());
        }
    }
}