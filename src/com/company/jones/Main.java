package com.company.jones;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ContactInfo person1=new ContactInfo("give me your persons name", "give mer there amil address");
        AddressBook addresses=new AddressBook();
        addresses.addInfo(person1);
        System.out.println("ok now type their name to look it up");
        System.out.println(addresses.retrieveByName(input.nextLine()));
        ContactInfo person2=new ContactInfo("give me your next persons name", "give mer there amil address");
        ContactInfo person3=new ContactInfo("give me your other next persons name", "give mer there amil address");
        addresses.addInfo(person2);
        addresses.addInfo(person3);
        System.out.println("now type any name to look it up the email");
        System.out.println(addresses.retrieveByName(input.nextLine()));
        System.out.println("now type any name to look it up the email");
        System.out.println(addresses.retrieveByName(input.nextLine()));
        System.out.println("now type any name to look it up the email");
        System.out.println(addresses.retrieveByName(input.nextLine()));

    }




}
