package com.trial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrialCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrialCourseApplication.class, args);
        FirstClass firstClass = new FirstClass();
        int a = firstClass.plus(4, 5);
        System.out.println(a);
        int b = firstClass.minus(4, 5);
        System.out.println(b);
    }

}
