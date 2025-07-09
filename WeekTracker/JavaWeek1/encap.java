package JavaWeek1;

import java.io.PrintWriter;

public class encap {
    public static void main(String[] args) {
        Student std= new Student();
        std.setMarks(65);
        std.setStudentName("Rohit");
        Student std2= new Student();
        std2.setStudentName("Mohit");
        std2.setMarks(99);
        System.out.println("Student Name: "+std.getStudentName() +"\n Marks is: " +std.getMarks() );
        System.out.println("Student Name: "+std2.getStudentName() +"\n Marks is: " +std2.getMarks() );

    }
    static class Student{
        private int marks;
        private String StudentName;
        public int getMarks() {
            return marks;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }

        public String getStudentName() {
            return StudentName;
        }

        public void setStudentName(String studentName) {
            StudentName = studentName;
        }



    }
}
