package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        AddressBook ab = new AddressBook();
        ab.add();

    }
    ArrayList<Person> list = new ArrayList<>();

    static void add() {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name : ");
            String firstName = sc.next();
        System.out.println("Enter your last name : ");
            String lastName = sc.next();
        System.out.println("Enter your address : ");
            String address = sc.next();
        System.out.println("Enter your city : ");
            String city = sc.next();
        System.out.println("Enter your state : ");
            String state = sc.next();
        System.out.println("Enter your zip :");
            String zip = sc.next();
        System.out.println("Enter your phone number :");
            long phoneNum = sc.nextLong();
        System.out.println("Enter your Email : ");
            String email = sc.next();
            sc.close();
        }
    }

