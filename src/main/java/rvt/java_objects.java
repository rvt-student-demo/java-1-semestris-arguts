package rvt;
// Custom data type
// 

import java.util.ArrayList;

public class java_objects {

    public static void main(String[] args) {
    Student st1 = new Student("Janis", 12);
    st1.introduce();
    Student st2 = new Student("Peteris", 34);
    st2.introduce();
    Student st3 = new Student( "Sofija", 18);
    st3.introduce();
    }
   
    //array 

    Student[] stArr = new Student[5];
    ArrayList<Student> stList = new  ArrayList<>();
}
