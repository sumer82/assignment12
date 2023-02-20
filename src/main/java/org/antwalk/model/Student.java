package org.antwalk.model;

public class Student {

    private String firstName;
    private String lastName;
    private String rollNo;

    public Student(String firstName, String lastName,
                   String rollNo)
    {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNo = rollNo;
    }

    public Student() {}

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getRollNo() { return rollNo; }

    public void setRollNo(String rollNo)
    {
        this.rollNo = rollNo;
    }
}
