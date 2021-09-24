/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person_Profile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author shubhangisrivastava
 */
public class Profile {
    
    private String name;
    //geographic data
    String city;
    Date DOB ;
    String telephone;
    String fax_num;
    String email_addr;
    String ssn;
    String medicaid_rec_num;
    String health_plan_ben_num;
    Long bank_acc_num;
    String license_num;
    String vehicle_identifier;
    String device_identifier;
    String linkedIn;
    String IPAddr;
    String bio_identity;
    Icon Photo;
    String Unique_Identifier;

    public Long getBank_acc_num() {
        return bank_acc_num;
    }

    public void setBank_acc_num(Long bank_acc_num) {
        
       if(String.valueOf(bank_acc_num).length() == 12) {
      
        this.bank_acc_num = bank_acc_num;
    }
        else {
            JOptionPane.showMessageDialog(null, "Please enter Account number less than 13 digits.");  

        }
    }
   
    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        
        if(linkedIn.matches("http(s)?:\\/\\/([\\w]+\\.)?linkedin\\.com\\/in\\/[A-z0-9_-]+\\/?")) {
        this.linkedIn = linkedIn;
        }
        else {
           JOptionPane.showMessageDialog(null, "Please enter a valid LinkedIn address.");  
        }
    }

    public String getIPAddr() {
        return IPAddr;
    }

    public void setIPAddr(String IPAddr) {
        
        if(IPAddr.matches("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$")) {
        this.IPAddr = IPAddr;
    }
        else {
            JOptionPane.showMessageDialog(null, "Please enter a valid IP Address.");
        }
    }

    /**
     *
     * @return
     */
    public String getBio_identity() {
        return bio_identity;
    }

    public void setBio_identity(String bio_identity) {
        this.bio_identity = bio_identity;
    }

    public Icon getPhoto() {
        return Photo;
    }

    public void setPhoto(Icon Photo) {
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
        
        if (name.matches("[A-Za-z]+")) {
            this.name = name;
        }
        else {
         JOptionPane.showMessageDialog(null, "Please enter a valid name.");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        
        if (city.matches("^[A-Za-z]\\w{5,29}$")) {
        this.city = city;
    }
        else{
            JOptionPane.showMessageDialog(null, "Please enter a valid city name.");
        }
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        
        if (telephone.matches("\\d{3}-\\d{3}-\\d{4}")) {
             this.telephone = telephone;  
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter valid phone number");
        }
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
        
        if(email_addr.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$")) {
            
                    this.email_addr = email_addr;
        }
        else 
        JOptionPane.showMessageDialog(null, "Please enter valid email address");
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        if(ssn.matches("^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$")) {
            
                    this.ssn = ssn;
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter valid SSN");
        }
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

    

    public String getLicense_num() {
        return license_num;
    }

    public void setLicense_num(String license_num) {
        
        //if( license_num.matches(name)
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
