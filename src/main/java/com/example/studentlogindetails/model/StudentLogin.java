package com.example.studentlogindetails.model;

public class StudentLogin {

    private Long LoginID;
    private String Password;
    private String Email;
    private String UserName;

    private String FirstName;

    private String LastName;

    private int age;


    //   private String Address;

    public StudentLogin() {

    }


    public StudentLogin(String Password, String Email, String UserName) {
        //this.LoginID = LoginID;
        this.Password = Password;
        this.Email = Email;
        this.UserName = UserName;
        // this.Address = Address;
        //this.FirstName = firstName;
    }

    public long getLoginID() {
        return LoginID;
    }

    public void setLoginID(long LoginID) {
        this.LoginID = LoginID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }


  /* private String getAddress()
    {
        return Address;
    }

    public void setAddress(String Address)
    {
        this.Address = Address;
    }*/
    //public String toString() {
    //  return "StudentLogin [LoginID=" + LoginID + ", password=" + getPassword() + ", userName=" + getUserName() + " Email="+ getEmail() +  "]";
    //}

    public String toString() {
        return "StudentLogin [LoginID=" + LoginID + ", password=" + getPassword() + ", userName=" + getUserName() + " Email=" + getEmail() + "]";
    }


}


