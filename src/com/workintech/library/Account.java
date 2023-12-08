package com.workintech.library;

public class Account {

    private String id;
    private String password;
    private AccountStatus status;
    private Person person;

    public Account(String id, String password, AccountStatus status, Person person) {
        this.id = id;
        this.password = password;
        this.status = status;
        this.person = person;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public Person getPerson() {
        return person;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", person=" + person +
                '}';
    }
}
