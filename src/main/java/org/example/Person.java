package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    String job;
    boolean isSingle;

    public Person(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;

    }
    public Person(String firstName,String lastName,int age,String gender){
        this(firstName,lastName,age);
        this.gender=gender;
    }


    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;

    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(){
     return this.age >=13 && this.age<=19;
    }

}
