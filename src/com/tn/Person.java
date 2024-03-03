package com.tn;

import java.util.Scanner;

public class Person {
    public String Name;

    public String Sex;

    public String dateOfBirth;

    public String Address;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        this.Name = sc.nextLine();

        sc = new Scanner(System.in);
        System.out.println("Enter Sex:");
        this.Sex = sc.nextLine();

        sc = new Scanner(System.in);
        System.out.println("Enter Date Of Birth:");
        this.dateOfBirth = sc.nextLine();

        sc = new Scanner(System.in);
        System.out.println("Enter Address:");
        this.Address = sc.nextLine();
    }

    public void  showInfo() {
        System.out.println(Name);
        System.out.println(Sex);
        System.out.println(dateOfBirth);
        System.out.println(Address);
    }
}
