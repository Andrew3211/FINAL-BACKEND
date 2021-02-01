package com.rudnev.finalproject.domains;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;


@Entity
public class UserData{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userDataID;
    private String fullname;
    private String dob;
    private boolean sex;
    private String countryOfResidence;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "userData", orphanRemoval=true)
    @JsonBackReference
    private User user;

    public UserData() {}

    public UserData(String fullname, String dob, boolean sex, String countryOfResidence) {
        this.fullname = fullname;
        this.dob = dob;
        this.sex = sex;
        this.countryOfResidence = countryOfResidence;
    }

    public Long getUserDataID() {
        return userDataID;
    }

    public void setUserDataID(Long userDataID) {
        this.userDataID = userDataID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "userDataID=" + userDataID +
                ", fullname='" + fullname + '\'' +
                ", dob=" + dob +
                ", sex=" + sex +
                ", countryOfResidence='" + countryOfResidence + '\'' +
                '}';
    }
}
