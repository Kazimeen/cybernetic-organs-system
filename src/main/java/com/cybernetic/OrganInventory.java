package com.cybernetic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrganInventory {
    private ArrayList<CyberneticOrgan> inventory = new ArrayList<>();
    
    public OrganInventory() {
        this.inventory = new ArrayList<>();
    }
    public String addOrgan(CyberneticOrgan organ){
        inventory.add(organ);  
        return organ.getDetails() + " has been added to the inventory.";
    }

    public ArrayList<CyberneticOrgan> getOrganList() {
        return new ArrayList<>(inventory); 
    } 
    
    public String removeOrgan(String model) {
        for (CyberneticOrgan organ : inventory) {
            if (organ.getDetails().equalsIgnoreCase(model)) {
                inventory.remove(organ); 
                return model + " has been successfully removed from the inventory.";
            }
        }
        return "Organ with model name " + model + " not found in the inventory.";
    }

    public ArrayList<CyberneticOrgan> searchOrganByFunctionality(String functionality) {
        ArrayList<CyberneticOrgan> matchingOrgans = new ArrayList<>();
        
        for (CyberneticOrgan organ : inventory) {
            if (organ.getFunctionality() != null && organ.getFunctionality().equalsIgnoreCase(functionality)) {
                matchingOrgans.add(organ);
            }
        }
        return matchingOrgans;
    }

        public ArrayList<CyberneticOrgan> sortOrgansByModel() {
            ArrayList<CyberneticOrgan> sortedList = new ArrayList<>(inventory);
            Collections.sort(sortedList, Comparator.comparing(CyberneticOrgan::getModel));
            return sortedList;
        }
}
