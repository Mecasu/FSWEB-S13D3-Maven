package org.example;

public class Person {
    String firstName;
    String lastName;
    String grade;
    int age;
    int number;
    int identity;
    public Person(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public Person(String firstName, String lastName, int age, String grade, int number, int identity){
     this(firstName,lastName,age);
     this.number=number;
     this.grade=grade;
     this.identity=identity;
    }
    public String getFirstName(){
        return firstName;

    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return age>=13 && age<=19;
    }

}
