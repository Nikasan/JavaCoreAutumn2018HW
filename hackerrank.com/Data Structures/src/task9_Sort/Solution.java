package task9_Sort;

import java.util.*;


class Checker2 implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {

        if ((a.getCgpa() - b.getCgpa()) == 0) {
            if (a.getFname().equals(b.getFname())) {
                return Integer.compare(b.getId(), a.getId());
            } else
                return a.getFname().compareTo(b.getFname());
            } else
                return Double.compare(b.getCgpa(), a.getCgpa());

        }
    }


class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();

        for (int i = 0; i < n; i++) {
            studentList.add(new Student(in.nextInt(), in.next(), in.nextDouble()));
        }
        in.close();
//        while (testCases > 0) {
//            int id = in.nextInt();
//            String fname = in.next();
//            double cgpa = in.nextDouble();
//
//            Student st = new Student(id, fname, cgpa);
//            studentList.add(st);
//
//            testCases--;
//        }
       // Checker2 checker = new Checker2();
        Collections.sort(studentList, new Checker2());

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}