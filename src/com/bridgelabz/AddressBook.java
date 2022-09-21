package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {
    Scanner sc;
    ArrayList<Person>list = new ArrayList<>();
    public void addPerson() {
             sc = new Scanner(System.in);
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

        System.out.println("Enter your zipCode :");
            int zipCode = sc.nextInt();

        System.out.println("Enter your phone number :");
            long phoneNum = sc.nextLong();

        System.out.println("Enter your Email : ");
            String email = sc.next();
            list.add(new Person(firstName,lastName,address,city,state,zipCode,phoneNum));
        }
       private void editPerson(){
           System.out.println("Enter person name to edit person : ");
           String editPersonName = sc.next();
           Person person = getPerson(editPersonName);
           System.out.println("Enter what you want to edit : 1-First Name\n2-Last Name\n3-Address\n4-City\n5-State\n6-Zip code\n7-Phone Number\n8-Email");
           int choice = sc.nextInt();
           switch (choice){
               case 1:
                   editfirstName();
               case 2:
                   editlastName();
               case 3:
                   editAddress();
               case 4:
                   editCity();
               case 5:
                   editState();
               case 6:
                   editZipCode();
               case 7:
                   editPhoneNum();
               case 8:
                   editEmail();
               default:
                   System.out.println("Invalid Choice");
           }
        }
        private void editfirstName(){
        sc = new Scanner(System.in);
            System.out.println("Enter your First name");
            String firstName = sc.next();
        }
    private void editlastName(){
        sc = new Scanner(System.in);
        System.out.println("Enter your Last name");
        String firstName = sc.next();
    }
    private void editAddress(){
        sc = new Scanner(System.in);
        System.out.println("Enter your Address");
        String firstName = sc.next();
    }
    private void editCity(){
        sc = new Scanner(System.in);
        System.out.println("Enter your City");
        String firstName = sc.next();
    }
    private void editState(){
        sc = new Scanner(System.in);
        System.out.println("Enter your State");
        String firstName = sc.next();
    }
    private void editZipCode(){
        sc = new Scanner(System.in);
        System.out.println("Enter your Zip Code");
        int firstName = sc.nextInt();
    }
    private void editPhoneNum(){
        sc = new Scanner(System.in);
        System.out.println("Enter your Phone Number");
        long firstName = sc.nextLong();
    }
    private void editEmail(){
        sc = new Scanner(System.in);
        System.out.println("Enter your Email_Id");
        String firstName = sc.next();
    }
    private Person getPerson(String editPersonName) {
        Iterator itr = list.iterator();
        Person person;
        if (itr.hasNext()) {
            for (int i = 0; i < list.size(); i++) {
                 person = (Person) itr.next();
                if (person.firstName.equalsIgnoreCase(editPersonName)) {
                    return person;
                }
            }
        }
        return null;
    }
    public void display(){
        System.out.println(list);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Scanner sc = new Scanner(System.in);
        AddressBook ab = new AddressBook();
        int choice = 0;
        while (choice != 10){
            System.out.println("Please Enter your choice : \n 1-Add Person\n 2-Edit person\n 3-Delete Person\n 4-Search person\n 5-Show Person\n 10-Exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    ab.addPerson();
                    break;
                case 2:
                    ab.editPerson();
                    break;
                case 3:
                  //  ab.deletePerson();
                    break;
                case 4:
                  //  ab.searchPerson();
                    break;
                case 5:
                    ab.display();
                    break;
                case 10:
                    break;
            }
        }
        ab.addPerson();
        ab.editPerson();
        ab.display();
    }
    }

