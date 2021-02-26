package com.company.jones;

import java.util.Scanner;

public class ContactInfo {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public ContactInfo(String message1, String message2){
        Scanner input= new Scanner(System.in);
        System.out.println(message1);
        String name=input.nextLine();
        System.out.println(message2);
        String email=input.nextLine();
        this.setName(name);
        this.setEmail(email);
    }


}
