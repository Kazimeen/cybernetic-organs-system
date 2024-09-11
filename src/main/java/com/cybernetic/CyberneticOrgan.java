package com.cybernetic;

public class CyberneticOrgan {
    private int id;
    private String model;
    private String functionality;
    private boolean compatiblity;

    public CyberneticOrgan(String model, String functionality, int id, boolean compatibility) {
      this.model = model;
      this.functionality = functionality;
      this.id = id;
      this.compatiblity = compatibility;
  }

  public String getDetails() {
   return "Model: " + model + ", Functionality: " + functionality + ", ID: " + id;
}

public String getFunctionality() {
   return functionality; 
}

public String getModel() {
   return model;
}

public Boolean isCompatible(String patientCompatibility) {
   return this.compatiblity; 
}
}
