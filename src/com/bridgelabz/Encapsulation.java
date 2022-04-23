package com.bridgelabz;

public class Encapsulation
{
    private String name;
    private int empid;

    public int getEmpId() {
        return empid;
    }

    public String getEmpName() {
        return name;
    }

    public void setEmpId( int newId) {
        empid = newId;
    }
    public void setEmpName(String newName) {
        name = newName;
    }


}
