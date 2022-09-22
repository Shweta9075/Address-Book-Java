package com.bridgelabz;

public class Person {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zipCode;
    Long phoneNum;
    String email;
    Person(String firstName, String lastName, String address,
           String city, String state, int zipCode, Long phoneNum, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public Person(String firstName, String lastName, String address, String city, String state, int zipCode, long phoneNum) {
    }

    public String toString() {
        return "Person{" +  " firstName '" + firstName + '\'' + " ,lastName '" + lastName +'\'' + " ,address '" + address + '\'' +
                " ,city '" + city +'\'' + ",state'" + state +'\'' + " ,zipCode '" + zipCode +'\'' + ",phoneNum'" + phoneNum + '\'' +
                " ,email '" + email + '\'' + +'}';
    }

}
