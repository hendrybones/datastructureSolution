package com.company.datastractures;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student implements Comparable<Student> {
    int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa) {
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
    public int compareTo(Student student) {
        double diffCGPA=student.cgpa-this.cgpa; //the student gpa - actual gpa
        if (diffCGPA==0D){
            if (student.name.equals(this.name)){
                return student.id -this.id;
            }
            else {
                return this.name.compareTo(student.name);
            }
        }
        else {
            return diffCGPA <0 ? -1 :1;
        }
}

static class Priorities {
    List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        List<Student> res = new ArrayList<>();
        String[] vals;
        String name;
        double cgpa;
        int id;
        for (String e : events) {
            vals = e.split(" ");
            if (vals.length == 4) {
                name = vals[1];
                cgpa = Double.parseDouble(vals[2]);
                id = Integer.parseInt(vals[3]);

                pq.add(new Student(id, name, cgpa));
            } else {
                pq.poll();
            }
        }
        while (!pq.isEmpty()) {
            res.add(pq.poll());
        }
        return res;
    }
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
//solution 2
class Student implements Comparable<Student>{
    String name = new String();
    double cgpa;
    int id;
    public Student(String name,double cgpa,int id)
    {
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public int compareTo(Student s)
    {
        if(cgpa == s.cgpa)
        {
            if(name.compareTo(s.name) == 0)
            {
                if(id == s.id)
                    return 0;
                else if (id > s.id)
                    return 1;
                else
                    return -1;
            }
            else
                return name.compareTo(s.name);
        }
        else if(cgpa > s.cgpa)
            return -1;
        else
            return 1;
    }
}

class Priorities{
    public ArrayList<Student> getStudents(List<String> events)
    {
        int n = events.size();
        PriorityQueue<Student> pq = new PriorityQueue<Student>();
        for(String i:events)
        {
            String[] s = new String[4];
            s = i.split("\\s");
            if(s.length>1)
            {
                pq.add(new Student(s[1],Double.valueOf(s[2]),Integer.valueOf(s[3])));
            }
            else
            {
                pq.poll();
            }
        }
        while(pq.size()>1)
        {
            System.out.println(pq.poll().name);
        }
        return new ArrayList<Student>(pq);
    }
}

