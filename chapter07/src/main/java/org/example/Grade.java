package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Grade {
    private Subject subject; // 성적을 매길 과목
    private String score;    // 성적 (A, B, C 등)

    public Grade(Subject subject) {
        this.subject = subject;
        this.score = "N/A"; // 초기 성적은 미정 상태
    }

    // Setter 직접 구현: 성적 입력 시 로직 추가
    public void setScore(String score) {
        this.score = score;
        System.out.println(subject.getTitle() + " 과목의 성적이 " + score + "로 업데이트되었습니다.");
    }
}