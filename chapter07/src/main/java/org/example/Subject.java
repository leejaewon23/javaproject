package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Subject {
    private String title; // 과목명
    private int credit;         // 학점 (예: 3학점)
}