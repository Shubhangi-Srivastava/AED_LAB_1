/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person_Profile;

import java.util.Date;

/**
 *
 * @author shubhangisrivastava
 */
public class Profile {
    
    private String name;
    //geographic data
    String city;
    String DOB ;
    String telephone;
    String fax_num;
    String email_addr;
    String ssn;
    String medicaid_rec_num;
    String health_plan_ben_num;
    String bank_acc_num;
    String license_num;
    String vehicle_identifier;
    String device_identifier;
    String linkedIn;
    String IPAddr;
    String bio_identity;
    String Photo;
    String Unique_Identifier;

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getIPAddr() {
        return IPAddr;
    }

    public void setIPAddr(String IPAddr) {
        this.IPAddr = IPAddr;
    }

    public String getBio_identity() {
        return bio_identity;
    }

    public void setBio_identity(String bio_identity) {
        this.bio_identity = bio_identity;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    public String getUnique_Identifier() {
        return Unique_Identifier;
    }

    public void setUnique_Identifier(String Unique_Identifier) {
        this.Unique_Identifier = Unique_Identifier;
    }
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax_num() {
        return fax_num;
    }

    public void setFax_num(String fax_num) {
        this.fax_num = fax_num;
    }

    public String getEmail_addr() {
        return email_addr;
    }

    public void setEmail_addr(String email_addr) {
        this.email_addr = email_addr;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getMedicaid_rec_num() {
        return medicaid_rec_num;
    }

    public void setMedicaid_rec_num(String medicaid_rec_num) {
        this.medicaid_rec_num = medicaid_rec_num;
    }

    public String getHealth_plan_ben_num() {
        return health_plan_ben_num;
    }

    public void setHealth_plan_ben_num(String health_plan_ben_num) {
        this.health_plan_ben_num = health_plan_ben_num;
    }

    public String getBank_acc_num() {
        return bank_acc_num;
    }

    public void setBank_acc_num(String bank_acc_num) {
        this.bank_acc_num = bank_acc_num;
    }

    public String getLicense_num() {
        return license_num;
    }

    public void setLicense_num(String license_num) {
        this.license_num = license_num;
    }

    public String getVehicle_identifier() {
        return vehicle_identifier;
    }

    public void setVehicle_identifier(String vehicle_identifier) {
        this.vehicle_identifier = vehicle_identifier;
    }

    public String getDevice_identifier() {
        return device_identifier;
    }

    public void setDevice_identifier(String device_identifier) {
        this.device_identifier = device_identifier;
    }    
}
