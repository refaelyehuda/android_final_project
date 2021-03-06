package com.menachi.class3demo.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class User {
    String userId;
    String email;
    String fName;
    String lName;
    Boolean isAdmin;
    String profPicture;
    String lastUpdate;
    String address;
    String birthDate;
    String password;
    Map<String, String> billingInfo;
    public User(){

    }


    public User(String userId, String email, String fName, String lName,String address,String password, String profPicture, String birthDate,Boolean isAdmin) {
        this.userId = userId;
        this.email = email;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.password = password;
        this.profPicture = profPicture;
        this.birthDate = birthDate;
        this.isAdmin = isAdmin;
        this.lastUpdate = Model.Tools.getCurrentDate();
        this.billingInfo = new HashMap<String, String>();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {

        this.address = address;
        this.lastUpdate = Model.Tools.getCurrentDate();
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        this.email = email;
        this.lastUpdate = Model.Tools.getCurrentDate();
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
        // Create an instance of SimpleDateFormat used for formatting
        // the string representation of date (month/day/year)
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        // Get the date today using Calendar object.
        Date today = Calendar.getInstance().getTime();
        // Using DateFormat format method we can create a string
        // representation of a date with the defined format.
        String currenDate = df.format(today);
        this.lastUpdate = currenDate;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
        this.lastUpdate = Model.Tools.getCurrentDate();
    }

    public String getProfPicture() {
        return profPicture;
    }

    public void setProfPicture(String profPicture) {
        this.profPicture = profPicture;
        // Create an instance of SimpleDateFormat used for formatting
        // the string representation of date (month/day/year)
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        // Get the date today using Calendar object.
        Date today = Calendar.getInstance().getTime();
        // Using DateFormat format method we can create a string
        // representation of a date with the defined format.
        String currenDate = df.format(today);
        this.lastUpdate = currenDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        // Create an instance of SimpleDateFormat used for formatting
        // the string representation of date (month/day/year)
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        // Get the date today using Calendar object.
        Date today = Calendar.getInstance().getTime();
        // Using DateFormat format method we can create a string
        // representation of a date with the defined format.
        String currenDate = df.format(today);
        this.lastUpdate = currenDate;
    }

    public Map<String, String> getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(Map<String, String> billingInfo) {
        this.billingInfo = billingInfo;
        this.lastUpdate = Model.Tools.getCurrentDate();
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}