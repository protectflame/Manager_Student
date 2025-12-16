package org.example.repo;

import org.example.entity.Student;

import java.io.*;
import java.util.ArrayList;

public class CsvConnection {
    File file = new File("src/main/resources/db.csv");


    public ArrayList<Student> getStudents() {
        ArrayList<String> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((reader.read()) != -1) {
                students.add(reader.readLine());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setStudents(String students) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(students);
            writer.newLine();
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
