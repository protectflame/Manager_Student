package org.example.repo;

import org.example.entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvConnection {
    File file = new File("src/main/resources/db.csv");


    public List<String> getStudents() {
        List<String> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((reader.read()) != -1) {
                students.add(reader.readLine());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    public void setStudents(List<String> students) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            for (String student : students){
                writer.write(student);
                writer.newLine();
            }
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
