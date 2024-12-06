package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
    private String role;
    public ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer id, String role){
        this.id=id;
        this.role=role;
        this.securityIncidents = new ArrayList<String>();
    }
    // TO DO: Implement HIPAACompliantUser!
   
    public boolean assignPin(int pin){
    	this.pin=0;
        if(pin > 1000 && pin < 9999){
        	this.setPin(pin);
            return true;
        }
        return false;
    }
   
    public boolean accessAuthorized(Integer confirmedAuthID){
        if(confirmedAuthID.equals(this.pin) ){
            return true;
        }
        else{
            authIncident();
            return false;
        }
    }
    // TO DO: Implement HIPAACompliantAdmin!
    public ArrayList<String> reportSecurityIncidents() {
    	for (String string : securityIncidents) {
			System.out.println(string);
		}
        return securityIncidents;
        
        }
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }

	
    
    // TO DO: Setters & Getters
    public Integer getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}

	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
}
