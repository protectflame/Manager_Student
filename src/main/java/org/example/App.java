package org.example;

import org.example.repo.CsvConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        CsvConnection connection = new CsvConnection();

        connection.setStudents("Ayzar");
        connection.setStudents("Maga");
        System.out.println(connection.getStudents());
    }

}
