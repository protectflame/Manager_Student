package org.example.repo;

import org.example.entity.Student;

import java.io.*;
import java.util.ArrayList;

public class CsvConnection {
    File file = new File("src/main/resources/db.csv");


    public ArrayList<Student> getStudents() {
        try (FileReader fileReader = new FileReader(file)) {
            int i;
            while ((i = fileReader.read()) != -1) {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
