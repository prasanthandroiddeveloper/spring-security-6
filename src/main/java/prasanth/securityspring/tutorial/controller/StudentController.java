package prasanth.securityspring.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import prasanth.securityspring.tutorial.model.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<Student> students=new ArrayList<>();
    @GetMapping("/student")
    public List<Student> getStudentsList(){

        Student student1=new Student();
        student1.setId(1);
        student1.setFirstName("prasanth");
        student1.setLastName("sanjeevi");

        Student student2=new Student();
        student2.setId(2);
        student2.setFirstName("sudhanva");
        student2.setLastName("sanjeevi");

        students.add(student1);
        students.add(student2);

        return students;
    }

    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student){
        students.add(student);
        return student;

    }
}
