package com.cybernetic;
import java.util.ArrayList;

public class Patient {
    private String name;
    private int age;
    private String medicalHistory;
    private CyberneticOrgan[] organs;
    private int organCount;

    private final int MAX_ORGANS = 5;

    public Patient(String name, int age, String medicalHistory) {
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
        this.organs = new CyberneticOrgan[MAX_ORGANS];
        this.organCount = 0; 
    }

    public String addOrgan(CyberneticOrgan organ) {
        if (organCount < MAX_ORGANS) {
            organs[organCount] = organ;  
            organCount++;                
            return organ.getDetails() + " has been successfully installed.";
        } else {
            return "Cannot add more organs. Maximum capacity of " + MAX_ORGANS + " reached.";
        }
    }
    public ArrayList<CyberneticOrgan> getOrganList() {
        ArrayList<CyberneticOrgan> organList = new ArrayList<>();
        for (int i = 0; i < organCount; i++) {
            organList.add(organs[i]);
        }
        return organList;
    }
    public void listOrgans() {
        ArrayList<CyberneticOrgan> organList = getOrganList();
        if (organList.isEmpty()) {
            System.out.println("No organs installed.");
        } else {
            System.out.println("Installed Organs:");
            for (int i = 0; i < organList.size(); i++) {
                System.out.println((i + 1) + ". " + organList.get(i).toString());
            }
        }
    }
    public String getPatientInfo(){
        return "Male 37";
    }
    
}
