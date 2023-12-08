package com.workintech.library;

public class Member extends Account{

    private int totalBooksCheckedOut;

    public Member(String id, String password, AccountStatus status, Person person) {
        super(id, password, status, person);
    }

    public int getTotalBooksCheckedOut() {
        return totalBooksCheckedOut;
    }
}
