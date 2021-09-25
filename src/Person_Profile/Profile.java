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
        
        if(Unique_Identifier.matches("^[A-PR-WYa-pr-wy][1-9]\\d"
                + "\\s?\\d{4}[1-9]$")) {
        this.Unique_Identifier = Unique_Identifier;
    }
       else {
                     JOptionPane.showMessageDialog(null, "Please enter a passport number.");

        }
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
        
        
    if(telephone.matches("^[0-9]*$") && telephone.length()==10) {
             this.telephone = telephone;    
        }
    else if(String.valueOf(telephone).matches("[A-Za-z]+")) {
        
         JOptionPane.showMessageDialog(null, "Please enter valid Telephone Number");    
        }
    }

    public String getFax_num() {
        return fax_num;
    }

    public void setFax_num(String fax_num) {
        
        if(fax_num.matches("\\+[0-9]{1,3}\\([0-9]{3}\\)[0-9]{7}")) { 

        this.fax_num = fax_num; 
    }
        else {
           JOptionPane.showMessageDialog(null, "Please enter valid fax number like +895(194)6165163");

        }
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
        
        if(medicaid_rec_num.matches("[M-m][R-r]\\d{5,6}")) {
        this.medicaid_rec_num = medicaid_rec_num;
    }
        else {
           JOptionPane.showMessageDialog(null, "Please enter valid Medical Record Number like MR123456");

        }
        
    }

    public String getHealth_plan_ben_num() {
        return health_plan_ben_num;
    }

    public void setHealth_plan_ben_num(String health_plan_ben_num) {
        
        if(health_plan_ben_num.matches("\\b\\d[A-Z]{2}\\d-[A-Z]{2}\\d-[A-Z]{2}\\d{2}\\b")) {
        this.health_plan_ben_num = health_plan_ben_num;
    }
        else {
           JOptionPane.showMessageDialog(null, "Please enter valid Health Beneficiary number example 1EG4-TE5-MK73");

        } 
    }

    

    public String getLicense_num() {
        return license_num;
    }

    public void setLicense_num(String license_num) {
        
        if(license_num.matches("^[A-Z](?:\\d[- ]*){14}$")) {
        this.license_num = license_num;
    }
        else {
          JOptionPane.showMessageDialog(null, "Please enter valid License Number like D61014070660905");

        }
    }

    public String getVehicle_identifier() {
        return vehicle_identifier;
    }

    public void setVehicle_identifier(String vehicle_identifier) {
        
        if(vehicle_identifier.matches("\\b[(A-H|J-N|P|R-Z|0-9)]{17}\\b")) {
        this.vehicle_identifier = vehicle_identifier;
    }
        else {
         JOptionPane.showMessageDialog(null, "Please enter valid Vehicle number (I,O,Q not allowed) example: SALVA2AE4EH877322");

        }
        
    }
    
    public String getDevice_identifier() {
        return device_identifier;
    }

    public void setDevice_identifier(String device_identifier) {
        
        this.device_identifier = device_identifier;
    }    
}
