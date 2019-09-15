package com.dashletter.dashletterbackend.Models;

import javax.persistence.*;

@Entity
public class MerchantProfileModel {

    @Id
<<<<<<< HEAD
=======
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
>>>>>>> fd23f52e1bcb10bf8f7c6e3111d5287177f1f1bc
    private String username;
    private String name;
    private String gender;
    private String dob;
<<<<<<< HEAD
    private String pass;
=======
    private String password;
>>>>>>> fd23f52e1bcb10bf8f7c6e3111d5287177f1f1bc
    private String email;
    private String phno;
    private String merchantBussiness;

<<<<<<< HEAD
=======
    public long getId() {
        return id;
    }
>>>>>>> fd23f52e1bcb10bf8f7c6e3111d5287177f1f1bc

    public MerchantProfileModel() {
    }

    public MerchantProfileModel(String username, String name, String gender, String dob, String password, String email, String phno, String merchantBussiness) {
        this.username = username;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.password = password;
        this.email = email;
        this.phno = phno;
        this.merchantBussiness = merchantBussiness;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getMerchantBussiness() {
        return merchantBussiness;
    }

    public void setMerchantBussiness(String merchantBussiness) {
        this.merchantBussiness = merchantBussiness;
    }
}
