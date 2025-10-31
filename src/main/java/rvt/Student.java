package rvt;

public class Student {
    String name; 
    int age;

    public Student(String n, int a){
        name = n; 
        age = a;
    }


      public void introduce(){
        System.out.println("Student: " + name + ", age: " + age);
    }
}

  
