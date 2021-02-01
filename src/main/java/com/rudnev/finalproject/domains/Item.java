package com.rudnev.finalproject.domains;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemID;
    private String itemName;
    private String itemImg;

    private int  firstNumField;
    private int  secondNumField;
    private int  thirdNumField;

    private String  firstStrField;
    private String  secondStrField;
    private String  thirdStrField;

    private String  firstDateField;
    private String  secondDateField;
    private String  thirdDateField;

    private boolean  firstBoolField;
    private boolean  secondBoolField;
    private boolean  thirdBoolField;
    @Column(columnDefinition = "TEXT")
    private String  firstTextField;
    @Column(columnDefinition = "TEXT")
    private String  secondTextField;
    @Column(columnDefinition = "TEXT")
    private String  thirdTextField;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ItemCollectionID")
    @JsonBackReference
    private Collection collection;


    public Item() {}

    public Item(String itemName, Collection collection) {
        this.itemName = itemName;
        this.collection = collection;
    }

    public void setCustomFields(Item item) {
        this.itemName = item.itemName;
        this.itemImg = item.itemImg;
        this.firstNumField = item.firstNumField;
        this.secondNumField = item.secondNumField;
        this.thirdNumField = item.thirdNumField;
        this.firstStrField = item.firstStrField;
        this.secondStrField = item.secondStrField;
        this.thirdStrField = item.thirdStrField;
        this.firstDateField = item.firstDateField;
        this.secondDateField = item.secondDateField;
        this.thirdDateField = item.thirdDateField;
        this.firstBoolField = item.firstBoolField;
        this.secondBoolField = item.secondBoolField;
        this.thirdBoolField = item.thirdBoolField;
        this.firstTextField = item.firstTextField;
        this.secondTextField = item.secondTextField;
        this.thirdTextField = item.thirdTextField;
    }

    public Item(Item item) {
        this.itemName = item.itemName;
        this.itemImg = item.itemImg;
        this.firstNumField = item.firstNumField;
        this.secondNumField = item.secondNumField;
        this.thirdNumField = item.thirdNumField;
        this.firstStrField = item.firstStrField;
        this.secondStrField = item.secondStrField;
        this.thirdStrField = item.thirdStrField;
        this.firstDateField = item.firstDateField;
        this.secondDateField = item.secondDateField;
        this.thirdDateField = item.thirdDateField;
        this.firstBoolField = item.firstBoolField;
        this.secondBoolField = item.secondBoolField;
        this.thirdBoolField = item.thirdBoolField;
        this.firstTextField = item.firstTextField;
        this.secondTextField = item.secondTextField;
        this.thirdTextField = item.thirdTextField;
    }

    public Long getItemID() {
        return itemID;
    }

    public void setItemID(Long itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getFirstNumField() {
        return firstNumField;
    }

    public void setFirstNumField(int firstNumField) {
        this.firstNumField = firstNumField;
    }

    public int getSecondNumField() {
        return secondNumField;
    }

    public void setSecondNumField(int secondNumField) {
        this.secondNumField = secondNumField;
    }

    public int getThirdNumField() {
        return thirdNumField;
    }

    public void setThirdNumField(int thirdNumField) {
        this.thirdNumField = thirdNumField;
    }

    public String getFirstStrField() {
        return firstStrField;
    }

    public void setFirstStrField(String firstStrField) {
        this.firstStrField = firstStrField;
    }

    public String getSecondStrField() {
        return secondStrField;
    }

    public void setSecondStrField(String secondStrField) {
        this.secondStrField = secondStrField;
    }

    public String getThirdStrField() {
        return thirdStrField;
    }

    public void setThirdStrField(String thirdStrField) {
        this.thirdStrField = thirdStrField;
    }

    public String getFirstDateField() {
        return firstDateField;
    }

    public void setFirstDateField(String firstDateField) {
        this.firstDateField = firstDateField;
    }

    public String getSecondDateField() {
        return secondDateField;
    }

    public void setSecondDateField(String secondDateField) {
        this.secondDateField = secondDateField;
    }

    public String getThirdDateField() {
        return thirdDateField;
    }

    public void setThirdDateField(String thirdDateField) {
        this.thirdDateField = thirdDateField;
    }

    public boolean isFirstBoolField() {
        return firstBoolField;
    }

    public void setFirstBoolField(boolean firstBoolField) {
        this.firstBoolField = firstBoolField;
    }

    public boolean isSecondBoolField() {
        return secondBoolField;
    }

    public void setSecondBoolField(boolean secondBoolField) {
        this.secondBoolField = secondBoolField;
    }

    public boolean isThirdBoolField() {
        return thirdBoolField;
    }

    public void setThirdBoolField(boolean thirdBoolField) {
        this.thirdBoolField = thirdBoolField;
    }

    public String getFirstTextField() {
        return firstTextField;
    }

    public void setFirstTextField(String firstTextField) {
        this.firstTextField = firstTextField;
    }

    public String getSecondTextField() {
        return secondTextField;
    }

    public void setSecondTextField(String secondTextField) {
        this.secondTextField = secondTextField;
    }

    public String getThirdTextField() {
        return thirdTextField;
    }

    public void setThirdTextField(String thirdTextField) {
        this.thirdTextField = thirdTextField;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public String getItemImg() {
        return itemImg;
    }

    public void setItemImg(String itemImg) {
        this.itemImg = itemImg;
    }
}
