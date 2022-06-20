package com.caresoft.clinicapp;

import java.sql.Date;
import java.util.ArrayList;

public class Physician extends User implements HIPAACompliantUser  {

///... imports class definition...
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	private int id;
	
	
    public Physician (int id) { 
    	super(id);
		this.id = id;
		
	}

	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		return false;
	}
	
    // TO DO: Setters & Getters

}
