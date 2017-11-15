package com.dataStructures;

import com.IO.OutputWriter;

import java.util.*;
import java.util.stream.Collectors;

public class RepositorySorted {

    private static OutputWriter outputWriter = new OutputWriter();

    public static void printSortedStudents(
            HashMap<String , ArrayList<Integer>>  courseData,
            String comparisonType,
            Integer numberOfStudents){

        Comparator<Map.Entry<String , ArrayList<Integer>>> comparator = (x, y) -> Double.compare(
                x.getValue().stream().mapToInt(Integer::valueOf).average().getAsDouble(),
                y.getValue().stream().mapToInt(Integer::valueOf).average().getAsDouble());

        List<String> sortedStudents = courseData.entrySet()
                .stream()
                .sorted(comparator)
                .limit(numberOfStudents)
                .map(x -> x.getKey())
                .collect(Collectors.toList());

        if (comparisonType.equals("descending")){
            Collections.reverse(sortedStudents);
        }

        for (String student : sortedStudents){
            outputWriter.printStudent(student, courseData.get(student));
        }

    }

//    private static Comparator<Map.Entry<String, ArrayList<Integer>>> createComparator(String comparisonType) {
//                switch (comparisonType){
//                    case "ascending":
//                        return new Comparator<Map.Entry<String, ArrayList<Integer>>>() {
//                            @Override
//                            public int compare(Map.Entry<String, ArrayList<Integer>> firstStudent
//                                    , Map.Entry<String, ArrayList<Integer>> secondStudent) {
//                                Double firstStudentTotal = getTotalScore(firstStudent.getValue());
//                                Double secondStudentTotal = getTotalScore(secondStudent.getValue());
//
//                                return firstStudentTotal.compareTo(secondStudentTotal);
//                            }
//                        };
//                    case "descending":
//                        return new Comparator<Map.Entry<String, ArrayList<Integer>>>() {
//                            @Override
//                            public int compare(Map.Entry<String, ArrayList<Integer>> firstStudent
//                                    , Map.Entry<String, ArrayList<Integer>> secondStudent) {
//                                Double firstStudentTotal = getTotalScore(firstStudent.getValue());
//                                Double secondStudentTotal = getTotalScore(secondStudent.getValue());
//
//                                return secondStudentTotal.compareTo(firstStudentTotal);
//                            }
//                        };
//                    default:
//                        return null;
//
//                }
//    }

    private static Double getTotalScore(ArrayList<Integer> grades) {
        Double total = 0d;

        for (Integer grade : grades) {
            total += grade;
        }

        return total / grades.size();
    }
}
