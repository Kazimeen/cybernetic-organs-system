package com.cybernetic;
import java.util.ArrayList;

public class OrganInventory {
    private ArrayList<String> inventory = new ArrayList<>();

    public String addOrgan(CyberneticOrgan organ){
        return "new heart added";
    }

    public String getOrgan(String model){
        return "heart model";
    }
    
}
