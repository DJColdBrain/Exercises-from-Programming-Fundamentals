package com.dataStructures;

import com.IO.OutputWriter;
import com.statics.ExceptionMessages;
import com.statics.SessionData;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentsRepository {
    public static boolean isDataInitialiized = false;
    public static HashMap<String , HashMap<String , ArrayList<Integer>>> studentsByCourse;

    private static OutputWriter outputWriter = new OutputWriter();

    public static void initializeData(String fileName) {
        if (isDataInitialiized){
            outputWriter.displayExeption(ExceptionMessages.DATA_ALREADY_INITIALIZED);
            return;
        }
        studentsByCourse = new HashMap<>();
        try {
            readData(fileName);
        } catch (IOException e) {
            outputWriter.displayExeption(ExceptionMessages.DATA_NOT_READED);
        }
    }

    private static void readData(String fileName) throws IOException {
        String regex = "([A-Z][a-zA-Z#+]*_[A-Z][a-z]{2}_\\d{4})\\s+([A-Z][a-z]{0,3}\\d{2}_\\d{2,4})\\s+(\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        String path = SessionData.currentPath + "\\" + fileName;
        List<String > lines = Files.readAllLines(Paths.get(path));


        for (String line : lines){
            matcher = pattern.matcher(line);

            if (!line.isEmpty() && matcher.find()) {
                String[] tokens = line.split("\\s+");
                String course = tokens[0];
                String student = tokens[1];
                Integer mark = Integer.parseInt(tokens[2]);

                if (mark <= 100 && mark >= 0) {
                    if (!studentsByCourse.containsKey(course)) {
                        studentsByCourse.put(course, new HashMap<>());
                    }
                    if (!studentsByCourse.get(course).containsKey(student)) {
                        studentsByCourse.get(course).put(student, new ArrayList<>());
                    }
                    studentsByCourse.get(course).get(student).add(mark);
                }
            }
        }
        isDataInitialiized = true;
        outputWriter.writeMessageOnNewLine("Data is initialized");
    }
    private static boolean isQueryForCoursePossible(String courseName){
        if (!isDataInitialiized){
            outputWriter.displayExeption(ExceptionMessages.DATA_NOT_INITIALIZED);
            return  false;
        }
        if (!studentsByCourse.containsKey(courseName)){
            outputWriter.displayExeption(ExceptionMessages.NON_EXISTING_COURSE);
            return  false;
        }
        return true;
    }
    private static boolean isQueryForStudentPossible(String courseName, String studentName){
        if (!isQueryForCoursePossible(courseName)){
            return false;
        }
        if (!studentsByCourse.get(courseName).containsKey(studentName)){
            outputWriter.displayExeption(ExceptionMessages.NON_EXISTING_STUDENT);
            return false;
        }
        return true;
    }



    public static void getStudentMarksInCourse(String course, String student){
        if (!isQueryForStudentPossible(course,student)){
            return;
        }
        ArrayList<Integer> marks = studentsByCourse.get(course).get(student);
        outputWriter.printStudent(student, marks);
    }

    public static void getStudentsByCourse(String course){
        if (!isQueryForCoursePossible(course)){
            return;
        }
        outputWriter.writeMessageOnNewLine(course + ": ");
        for (Map.Entry<String, ArrayList<Integer>> students : studentsByCourse.get(course).entrySet()) {
            outputWriter.printStudent(students.getKey(), students.getValue());
        }
    }

    public static void printFilteredStudents(String course, String filter, Integer numberOfStudents){
        if (!isQueryForCoursePossible(course)){
            return;
        }
        if (numberOfStudents != null){
            numberOfStudents = studentsByCourse.get(course).size();
        }
        RepositoryFilters.printFilteredStudents(studentsByCourse.get(course), filter, numberOfStudents);
    }
    public static void printOrderedStudents(String course, String order, Integer numberOfStudents){
        if (!isQueryForCoursePossible(course)){
            return;
        }
        if (numberOfStudents != null){
            numberOfStudents = studentsByCourse.get(course).size();
        }
        RepositorySorted.printSortedStudents(studentsByCourse.get(course), order, numberOfStudents);
    }



}
