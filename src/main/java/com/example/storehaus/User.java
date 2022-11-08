package com.example.storehaus;

public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private  int nubOfLinID;
    private  int lastLineID;

    public User(String firstName, String lastName, String userName, String password, int nubOfLinID, int lastLineID) {
        this.firstName = new String(firstName);
        this.lastName =  new String(lastName);
        this.userName = new String(userName);
        this.password = new String(password);
        this.nubOfLinID = nubOfLinID;
        this.lastLineID = lastLineID;
    }

    public User() {

    }

    public User(String firstname, String lastname, String username, String password) {
        this.firstName = this.firstName;
        this.lastName = this.lastName;
        this.userName = this.userName;
        this.password = this.password;

    }

    public int getNubOfLinID() { return nubOfLinID; }

    public int getLastLineID() { return lastLineID; }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() { return userName; }

    public String getPassword() { return password; }

    public void setNubOfLinID(int nubOfLinID) { this.nubOfLinID = nubOfLinID; }

    public void setLastLineID(int lastLineID) { this.lastLineID = lastLineID; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setUserName(String userName) { this.userName = userName; }

    public void setPassword(String password) {
        this.password = password;
    }
}
