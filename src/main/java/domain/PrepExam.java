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
public class PrepExam 
{
    private String examID;
    private String examType;
    private String examDescription;
    private double examPrice;
    
    private PrepExam(){}
    
    private PrepExam(Builder builder)
    {
        examID = builder.examID;
        examType = builder.examType;
        examDescription = builder.examDescription;
        examPrice = builder.examPrice;
    }
    
    public static class Builder
    {
        private String examID;
        private String examType;
        private String examDescription;
        private double examPrice;
        
        public Builder(String examID)
        {
            this.examID = examID;
        }
        
        public Builder examType(String value)
        {
            examType = value;
            return this;
        }
        
        public Builder examDescription(String value)
        {
            examDescription = value;
            return this;
        } 
        
        public Builder examPrice(double value)
        {
            examPrice = value;
            return this;
        }
        
        public PrepExam build()
        {
            return new PrepExam(this);
        }
    }

    public String getExamID() {
        return examID;
    }

    public String getExamType() {
        return examType;
    }

    public String getExamDescription() {
        return examDescription;
    }

    public double getExamPrice() {
        return examPrice;
    }
    
    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (!(o instanceof PrepExam)) return false;

        PrepExam prepExam = (PrepExam) o;

        return !(examID != null ? !examID.equals(prepExam.examID) : prepExam.examID != null);

    }

    @Override
    public int hashCode() 
    {
        return examID != null ? examID.hashCode() : 0;
    }
}
