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
public class Subject 
{
    private String subjectCode;
    private String subjectName;
    private String Stream;
    
    private Subject(){}
    
    private Subject(Builder builder)
    {
        subjectCode = builder.subjectCode;
        subjectName = builder.subjectName;
        Stream = builder.Stream;
    }
    
    public static class Builder
    {
        private String subjectCode;
        private String subjectName;
        private String Stream;
        
        public Builder(String subjectCode)
        {
            this.subjectCode = subjectCode;
        }
        
        public Builder subjectName(String value)
        {
            subjectName = value;
            return this;
        }
        
        public Builder Stream(String value)
        {
            Stream = value;
            return this;
        }
        
        public Subject build()
        {
            return new Subject(this);
        }
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getStream() {
        return Stream;
    }
    
    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (!(o instanceof Subject)) return false;

        Subject subject = (Subject) o;

        return !(subjectCode != null ? !subjectCode.equals(subject.subjectCode) : subject.subjectCode != null);

    }

    @Override
    public int hashCode() 
    {
        return subjectCode != null ? subjectCode.hashCode() : 0;
    }
}
