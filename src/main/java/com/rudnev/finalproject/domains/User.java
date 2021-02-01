package com.rudnev.finalproject.domains;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userID;
    private String username;
    private String password;
    private String email;
    private String LastOnlineDate;
    private String role;
    private String avatarLink;
    private boolean isAccountActive;


    @OneToOne(fetch = FetchType.EAGER, orphanRemoval=true)
    @JsonManagedReference
    @JoinColumn(name = "UserDataID")
    private UserData userData;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user", orphanRemoval=true)
    @JsonManagedReference
    private List<Collection> collections;


    public User() {}

    public void addCollection(Collection collection){
        this.collections.add(collection);
    }

    public void removeCollection(Collection collection){
        this.collections.remove(collection);
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public List<Collection> getCollections() {
        return collections;
    }

    public void setCollections(List<Collection> collections) {
        this.collections = collections;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getLastOnlineDate() {
        return LastOnlineDate;
    }

    public void setLastOnlineDate(String LastOnlineDate) {
        this.LastOnlineDate = LastOnlineDate;
    }

    public boolean isAccountActive() {
        return isAccountActive;
    }

    public void setAccountActive(boolean accountActive) {
        isAccountActive = accountActive;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAvatarLink() {
        return avatarLink;
    }

    public void setAvatarLink(String avatarLink) {
        this.avatarLink = avatarLink;
    }


    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", LastOnlineDate='" + LastOnlineDate + '\'' +
                ", role='" + role + '\'' +
                ", avatarLink='" + avatarLink + '\'' +
                ", isAccountActive=" + isAccountActive +
                '}';
    }
}
