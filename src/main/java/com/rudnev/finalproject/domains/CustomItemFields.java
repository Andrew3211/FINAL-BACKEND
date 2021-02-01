package com.rudnev.finalproject.domains;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class CustomItemFields {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemFieldsID;

    private String  firstNumField;
    private String  secondNumField;
    private String  thirdNumField;

    private String  firstStrField;
    private String  secondStrField;
    private String  thirdStrField;

    private String  firstDateField;
    private String  secondDateField;
    private String  thirdDateField;

    private String  firstBoolField;
    private String  secondBoolField;
    private String  thirdBoolField;

    private String  firstTextField;
    private String  secondTextField;
    private String  thirdTextField;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "customItemFields")
    @JsonBackReference
    private Collection collection;

    public CustomItemFields() {}

    public CustomItemFields(CustomItemFields cIF) {
        this.firstNumField = cIF.firstNumField;
        this.secondNumField = cIF.secondNumField;
        this.thirdNumField = cIF.thirdNumField;
        this.firstStrField = cIF.firstStrField;
        this.secondStrField = cIF.secondStrField;
        this.thirdStrField = cIF.thirdStrField;
        this.firstDateField = cIF.firstDateField;
        this.secondDateField = cIF.secondDateField;
        this.thirdDateField = cIF.thirdDateField;
        this.firstBoolField = cIF.firstBoolField;
        this.secondBoolField = cIF.secondBoolField;
        this.thirdBoolField = cIF.thirdBoolField;
        this.firstTextField = cIF.firstTextField;
        this.secondTextField = cIF.secondTextField;
        this.thirdTextField = cIF.thirdTextField;
    }

    public Long getItemFieldsID() {
        return itemFieldsID;
    }

    public void setItemFieldsID(Long itemFieldsID) {
        this.itemFieldsID = itemFieldsID;
    }

    public String getFirstNumField() {
        return firstNumField;
    }

    public void setFirstNumField(String firstNumField) {
        this.firstNumField = firstNumField;
    }

    public String getSecondNumField() {
        return secondNumField;
    }

    public void setSecondNumField(String secondNumField) {
        this.secondNumField = secondNumField;
    }

    public String getThirdNumField() {
        return thirdNumField;
    }

    public void setThirdNumField(String thirdNumField) {
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

    public String getFirstBoolField() {
        return firstBoolField;
    }

    public void setFirstBoolField(String firstBoolField) {
        this.firstBoolField = firstBoolField;
    }

    public String getSecondBoolField() {
        return secondBoolField;
    }

    public void setSecondBoolField(String secondBoolField) {
        this.secondBoolField = secondBoolField;
    }

    public String getThirdBoolField() {
        return thirdBoolField;
    }

    public void setThirdBoolField(String thirdBoolField) {
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

    @Override
    public String toString() {
        return "CustomItemFields{" +
                "itemFieldsID=" + itemFieldsID +
                ", firstNumField='" + firstNumField + '\'' +
                ", secondNumField='" + secondNumField + '\'' +
                ", thirdNumField='" + thirdNumField + '\'' +
                ", firstStrField='" + firstStrField + '\'' +
                ", secondStrField='" + secondStrField + '\'' +
                ", thirdStrField='" + thirdStrField + '\'' +
                ", firstDateField='" + firstDateField + '\'' +
                ", secondDateField='" + secondDateField + '\'' +
                ", thirdDateField='" + thirdDateField + '\'' +
                ", firstBoolField='" + firstBoolField + '\'' +
                ", secondBoolField='" + secondBoolField + '\'' +
                ", thirdBoolField='" + thirdBoolField + '\'' +
                ", firstTextField='" + firstTextField + '\'' +
                ", secondTextField='" + secondTextField + '\'' +
                ", thirdTextField='" + thirdTextField + '\'' +
                '}';
    }
}
