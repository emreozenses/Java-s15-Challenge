package com.workintech.library;

public class Librarian extends Account{



    public Librarian(String id, String password, AccountStatus status, Person person) {
        super(id, password, status, person);
    }

    public static void addIssueItem(){
       Item item = new IssueItem();
    }

    public static void changeAccountStatus(){

    }



}
