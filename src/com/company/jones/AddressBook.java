package com.company.jones;

import java.util.HashMap;


public class AddressBook {
    private HashMap<String, String> theBook= new HashMap<>();
    public String retrieveByName(String name){
        return this.theBook.get(name);
    }
    public void addInfo(ContactInfo obama){
        this.theBook.put(obama.getName(), obama.getEmail());
    }


}
