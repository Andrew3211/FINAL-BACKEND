package com.rudnev.finalproject.domains;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity
public class Collection {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long collectionID;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String theme;
    private String colImg;
    private String dateOfCreation;
    private boolean [][] usingCustomFields = new boolean[3][4];

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userID")
    @JsonBackReference
    private User user;

    @OneToOne(fetch = FetchType.EAGER, orphanRemoval=true)
    @JsonManagedReference
    @JoinColumn(name = "itemFieldsID")
    private CustomItemFields customItemFields;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "collection", orphanRemoval=true)
    @JsonManagedReference
    private List<Item> items;

    public Collection() {}

    public Collection(Collection collection) {
        this.name = collection.getName();
        this.description = collection.getDescription();
        this.theme = collection.getTheme();
        this.colImg = collection.getColImg();
    }

    public Collection(String name, String description, String theme, String colImg) {
        this.name = name;
        this.description = description;
        this.theme = theme;
        this.colImg = colImg;
    }


    public Long getCollectionID() {
        return collectionID;
    }

    public void setCollectionID(Long collectionID) {
        this.collectionID = collectionID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getColImg() {
        return colImg;
    }

    public void setColImg(String colImg) {
        this.colImg = colImg;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public boolean[][] getUsingCustomFields() {
        return usingCustomFields;
    }

    public void setUsingCustomFields(boolean[][] usingCustomFields) {
        this.usingCustomFields = usingCustomFields;
    }

    public CustomItemFields getCustomItemFields() {
        return customItemFields;
    }

    public void setCustomItemFields(CustomItemFields customItemFields) {
        this.customItemFields = customItemFields;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "collectionID=" + collectionID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", theme='" + theme + '\'' +
                ", colImg='" + colImg + '\'' +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", usingCustomFields=" + Arrays.toString(usingCustomFields) +
                ", customItemFields=" + customItemFields +
                '}';
    }
}
