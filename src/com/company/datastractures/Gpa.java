package com.company.datastractures;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Gpa  implements Comparable<Gpa>{
    int id;
    String name;
    double  cgpa;

    public Gpa(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }


    @Override
    public int compareTo(Gpa s) {
        //same cgpa
        if (cgpa==s.cgpa){
            //compare name
            if (name.compareTo(s.name)==0){
                //compare id
                if (id==s.id)
                    return 0;
                //if id doesnt compare and the other is greater return other
                else if (id>s.id)
                    return 1;
                else
                    return -1;
            }
            else
                return name.compareTo(s.name);
        }
        else if (cgpa>s.cgpa)
            return -1;
        else
        return 1;
    }
}
class priorities{
    // get all the students and list of event into array list
    public ArrayList<Gpa> getStudents(List<String> events){
        // n number of events
        int n = events.size();
        //arrange student according to priority
        PriorityQueue<Gpa> pq = new PriorityQueue<>();
        for (String i: events){
            String[] s=new String[4];
            s=i.split("\\s");
            if (s.length>1){
                pq.add(new Gpa(Integer.valueOf(s[3]), s[1], Double.valueOf(s[2])));
            }
            else
            {
                pq.poll();
            }
        }
        while (pq.size()>1){
            System.out.println(pq.poll().name);
        }
        return new ArrayList<Gpa>(pq);

    }
}
class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Student.Priorities priorities = new Student.Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
