public class Student implements Comparable<Student> {

    int rollnumber;
    String name;

    Student(int num, String name) {
        this.rollnumber = num;
        this.name = name;
    }

    public int compareTo(Student num) {
        return this.rollnumber - num.rollnumber;
    }

    public String toString() {
        return this.rollnumber + "-" + this.name;
    }
}

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "Baskar"));
        list.add(new Student(5, "Kathir"));
        list.add(new Student(2, "Dinesh"));
        list.add(new Student(3, "Jebadurai"));

        System.out.println("Before using Comparable compareTo method in student class:");

        for (Student values : list) {
            System.out.println(values);
        }

        Collections.sort(list);
        System.out.println("Comparable Output:");

        for (Student values : list) {
            System.out.println(values);
        }

        System.out.println("Using a comperator:");
        Comparator<Student> byname = new Comparator<>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        };
        System.out.println("Sorting the list with byname comperator:");
        Collections.sort(list, byname);
        System.out.println("Comperator sorted Values:");

        for (Student val : list) {
            System.out.println(val);
        }


    }
}
