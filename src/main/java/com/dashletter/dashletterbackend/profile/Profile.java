package com.dashletter.dashletterbackend.profile;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Profile {

    @Id
    String username;
    String name;
    String gender;
    String dob;
    String pass;
    String email;
    String phno;

    public Profile() {
    }

    public Profile(String username, String name, String gender, String dob, String pass, String email, String phno) {
        this.username = username;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.pass = pass;
        this.email = email;
        this.phno = phno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}
