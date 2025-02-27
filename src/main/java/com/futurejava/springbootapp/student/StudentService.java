package com.futurejava.springbootapp.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(
                new Student("Łukasz", "Jargieło", LocalDate.of(1988, 3, 4), "lukasz.jargielo1988@gmail.com", 36),
                new Student("Natalia", "Jargieło", LocalDate.of(1989, 3, 26), "natalia.grzegorzyca@gmail.com", 35),
                new Student("Alicja", "Jargieło", LocalDate.of(1995, 6, 19), "alicjajar@gmail.com", 29)
        );
    }
}
