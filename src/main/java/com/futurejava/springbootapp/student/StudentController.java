package com.futurejava.springbootapp.student;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService service;

    public StudentController(@Qualifier("db") StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student save(@RequestBody Student student) {
        return service.save(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }

    @GetMapping()
    public List<Student> findAllStudents() {
        return service.findAllStudents();
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return service.update(student);
    }

    @DeleteMapping("/{email}")
    public void deleteByEmail(@PathVariable("email") String email) {
        service.delete(email);
    }
}
