package com.company;

public class Programmer extends Person{

    private String companyName;

    public Programmer(String companyName) {
        this.companyName = companyName;
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;

    }
    void coding() {
        System.out.println(" Write code in java.");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                "} " + super.toString();
    }
}
