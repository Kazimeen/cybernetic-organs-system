package com.cybernetic;

import java.util.ArrayList;

public class Patient {
    private String name;
    private int age;
    private String medicalHistory;
    
   private ArrayList<String> installedOrgans = new ArrayList<>();

    public String addOrgan(CyberneticOrgan organ){
        return "heart";
    }
    
    public String getPatientInfo(){
        return "Male 37";
    }
    
}
