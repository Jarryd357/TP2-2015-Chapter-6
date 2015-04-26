/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

/**
 *
 * @author user
 */
public class Student 
{
    private String studentID;
    private String studentName;
    private String contactNumber;
    private String emailAddress;
    
    private Student(){}
    
    private Student(Builder builder)
    {
        studentID = builder.studentID;
        studentName = builder.studentName;
        contactNumber = builder.contactNumber;
        emailAddress = builder.emailAddress;
    }
    
    public static class Builder
    {
        private String studentID;
        private String studentName;
        private String contactNumber;
        private String emailAddress;
        
        public Builder(String studentID)
        {
            this.studentID = studentID;
        }
        
        public Builder studentName(String value)
        {
            studentName = value;
            return this;
        }
        
        public Builder contactNumber(String value)
        {
            contactNumber = value;
            return this;
        } 
        
        public Builder emailAddress(String value)
        {
            emailAddress = value;
            return this;
        }
        
        public Student build()
        {
            return new Student(this);
        }
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
            
    
    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        return !(studentID != null ? !studentID.equals(student.studentID) : student.studentID != null);

    }

    @Override
    public int hashCode() 
    {
        return studentID != null ? studentID.hashCode() : 0;
    }
    
}
