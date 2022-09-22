package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {
    Scanner sc;
    ArrayList<Person>list = new ArrayList<>();
    public void addPerson() {
             sc = new Scanner(System.in);
        System.out.print("Enter your first name :- ");
            String firstName = sc.next();

        System.out.print("Enter your last name :- ");
            String lastName = sc.next();

        System.out.print("Enter your address :- ");
            String address = sc.next();

        System.out.print("Enter your city :- ");
            String city = sc.next();

        System.out.print("Enter your state :- ");
            String state = sc.next();

        System.out.print("Enter your zipCode :- ");
            int zipCode = sc.nextInt();

        System.out.print("Enter your phone number :- ");
            long phoneNum = sc.nextLong();

        System.out.print("Enter your Email :- ");
            String email = sc.next();
            list.add(new Person(firstName,lastName,address,city,state,zipCode,phoneNum,email));
        }
       private void editPerson(){
           System.out.println("Enter person name to edit person :- ");
           String editPersonName = sc.next();
           Person person = getPerson(editPersonName);
           System.out.println("Enter what you want to edit :" + "\n1-First Name\n2-Last Name\n3-Address\n4-City\n5-State\n6-Zip code\n7-Phone Number\n8-Email");
           int choice = sc.nextInt();
           switch (choice){
               case 1:
                   editfirstName(person);
                   break;
               case 2:
                   editlastName(person);
                   break;
               case 3:
                   editAddress(person);
                   break;
               case 4:
                   editCity(person);
                   break;
               case 5:
                   editState(person);
                   break;
               case 6:
                   editZipCode(person);
                   break;
               case 7:
                   editPhoneNum(person);
                   break;
               case 8:
                   editEmail(person);
                   break;
               default:
                   System.out.println("Invalid Choice....");
           }
        }
        private void editfirstName(Person person){
        sc = new Scanner(System.in);
            System.out.print("Enter your First name :- ");
            person.firstName = sc.next();
        }
    private void editlastName(Person person){
        sc = new Scanner(System.in);
        System.out.print("Enter your Last name :- ");
        person.lastName = sc.next();
    }
    private void editAddress(Person person){
        sc = new Scanner(System.in);
        System.out.print("Enter your Address :- ");
        person.address = sc.next();
    }
    private void editCity(Person person){
        sc = new Scanner(System.in);
        System.out.print("Enter your City :- ");
        person.city = sc.next();
    }
    private void editState(Person person){
        sc = new Scanner(System.in);
        System.out.print("Enter your State :- ");
        person.state = sc.next();
    }
    private void editZipCode(Person person){
        sc = new Scanner(System.in);
        System.out.print("Enter your Zip Code :- ");
        person.zipCode = sc.nextInt();
    }
    private void editPhoneNum(Person person){
        sc = new Scanner(System.in);
        System.out.print("Enter your Phone Number :- ");
        person.phoneNum = sc.nextLong();
    }
    private void editEmail(Person person){
        sc = new Scanner(System.in);
        System.out.print("Enter your Email_Id :- ");
        person.email= sc.next();
    }
    private Person getPerson(String editPersonName) {
        Iterator itr = list.iterator();
        if (itr.hasNext()) {
            for (int i = 0; i < list.size(); i++) {
               Person  person = (Person) itr.next();
                if (person.firstName.equalsIgnoreCase(editPersonName)) {
                    return person;
                }
            }
        }
        return null;
    }
    private void deletePerson(){
        sc = new Scanner(System.in);
        System.out.print("Enter person name to delete :- ");
        String personName = sc.next();
        Person person = getPerson(personName);
        if(person == null){
            System.out.println("Sorry no person found given name !...");
        }
        else {
            list.remove(person);
        }
    }

    public void display(){
        System.out.println(list);
    }

    public static void main(String[] args) {
        System.out.println(" ## Welcome to Address Book ##");
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
                   ab.deletePerson();
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

    }
    }

