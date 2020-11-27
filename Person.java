package com.mycompany._3;
import Sort.Sort;
import java.util.Scanner;

public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private String birthday;
    
    public void setname(){
        Scanner first = new Scanner(System.in);
        Scanner last = new Scanner(System.in);
        System.out.println("\nEnter first name: ");
        firstname = first.nextLine();
        System.out.println("Enter last name: ");
        lastname = last.nextLine();
    }
    
    public String getfirstname() {
        return firstname;
    }
    
    public String getlastname() {
        return lastname;
    }
    
    public void setage() {
        Scanner birth = new Scanner(System.in);
        Scanner _age = new Scanner(System.in);
        System.out.println("Enter age: ");
        age = _age.nextInt();
        System.out.println("Enter birthday (dd.mm.year): ");
        birthday = birth.nextLine();
    }
    
    public int getage() {
        return age;
    }
    
    public String getbirthday() {
        return birthday;
    }
    
    public void print() {
        System.out.println("\nName: " + getfirstname() + " " + getlastname() + ", Age: " + getage() + ", Birthday: " + getbirthday());
    }
    
    
    public static void main(String args[]) {
        
        Person A = new Person();
        A.setname();
        A.setage();
        
        Person B = new Person();
        B.setname();
        B.setage();
        
        Person C = new Person();
        C.setname();
        C.setage();
        
        A.print();
        B.print();
        C.print();
        
        Sort p = new Sort();
        p.sorting(A, B, C);
        
    }
    
    
}
