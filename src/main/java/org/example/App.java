package org.example;

import com.google.gson.Gson;
import org.example.entity.Student;
import org.example.repo.CsvConnection;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        CsvConnection connection = new CsvConnection();

        connection.setStudents(List.of("Timerbulat", "Shamil", "Gadji", "Zagirbek"));
    }
}
