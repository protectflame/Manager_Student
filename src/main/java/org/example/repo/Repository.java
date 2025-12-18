package org.example.repo;

import com.google.gson.Gson;
import org.example.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private CsvConnection connection = new CsvConnection();
    private Gson gson = new Gson();
    private List<Student> db;

    public void addStudent(Student student) {
        allStudent().add(student);
    }

    public List<Student> allStudent() {
        List<String> json = connection.getStudents();
        List<Student> students = new ArrayList<>();
        if (!json.isEmpty()){
            for (String st:json) {
                students.add(gson.fromJson(st, Student.class));
            }
        }
        return students;
    }
}
