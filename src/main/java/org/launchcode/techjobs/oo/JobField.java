package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
  //Same Fields!!
    private int id;
    private static int nextId = 1;
    private String value;
    //Same Constructors!!
    public JobField(){
        id = nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        this.value = value;
    }
//custom methods
    @Override
    public String toString() {
        if(value == null){
            this.value = "Data not available";
        }
        return value;
    }
    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    //getters/setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }



}
