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
public class TutSession 
{
    private String sessionID;
    private String sessionType;
    private String sessionDescription;
    private double sessionPrice;
    
    private TutSession(){}
    
    private TutSession(Builder builder)
    {
        sessionID = builder.sessionID;
        sessionType = builder.sessionType;
        sessionDescription = builder.sessionDescription;
        sessionPrice = builder.sessionPrice;
    }
    
    public static class Builder
    {
        private String sessionID;
        private String sessionType;
        private String sessionDescription;
        private double sessionPrice;
        
        public Builder(String sessionID)
        {
            this.sessionID = sessionID;
        }
        
        public Builder sessionType(String value)
        {
            sessionType = value;
            return this;
        }
        
        public Builder sessionDescription(String value)
        {
            sessionDescription = value;
            return this;
        } 
        
        public Builder sessionPrice(double value)
        {
            sessionPrice = value;
            return this;
        }
        
        public TutSession build()
        {
            return new TutSession(this);
        }
    }

    public String getSessionID() {
        return sessionID;
    }

    public String getSessionType() {
        return sessionType;
    }

    public String getSessionDescription() {
        return sessionDescription;
    }

    public double getSessionPrice() {
        return sessionPrice;
    }
    
    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (!(o instanceof TutSession)) return false;

        TutSession tutSession = (TutSession) o;

        return !(sessionID != null ? !sessionID.equals(tutSession.sessionID) : tutSession.sessionID != null);

    }

    @Override
    public int hashCode() 
    {
        return sessionID != null ? sessionID.hashCode() : 0;
    }
}
